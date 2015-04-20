package com.softline.javacake.test;

/**
 * @author Venice
 * @since 14. 10. 31. 오후 5:15
 */
public class NodeList {
	private Node head;
	private Node last;

	//Constructor ; NodeList
	NodeList() {
		this.head = null;
		this.last = null;
	}

	//Append the Nodes
	public void appendTerm(float coef, int expo) {
		Node newNode = new Node();
		newNode.setCoef(coef);
		newNode.setExpo(expo);
		newNode.link = null;

		if (head == null) {
			head = newNode;
			last = newNode;
		} else {
			last.link = newNode;
			last = newNode;
		}
	}

	//Add Polynomial
	public void addPolynomial(NodeList poly_A, NodeList poly_B) {
		Node pA = poly_A.head;
		Node pB = poly_B.head;
		head = null;
		last = null;
		float sum = 0;

		while (pA != null && pB != null) {
			if (pA.getExpo() == pB.getExpo()) {
				sum = pA.getCoef() + pB.getCoef();
				if (sum != 0) {
					this.appendTerm(sum, pA.getExpo());
					pA = pA.link;
					pB = pB.link;
				}
			} else if (pA.getExpo() < pB.getExpo()) {
				this.appendTerm(pB.getCoef(), pB.getExpo());
				pB = pB.link;
			} else {
				this.appendTerm(pA.getCoef(), pA.getExpo());
				pA = pA.link;
			}
		}
		while (pA != null) {
			this.appendTerm(pA.getCoef(), pA.getExpo());
			pA = pA.link;
		}
		while (pB != null) {
			this.appendTerm(pB.getCoef(), pB.getExpo());
			pB = pB.link;
		}
	}

	//Print the Polynomial
	public void printPolynomial() {
		Node temp = this.head;
		while (temp != null) {
			System.out.printf("%.0f", temp.getCoef());
			System.out.print("x^");
			System.out.print(temp.getExpo());

			temp = temp.link;
			if (temp != null) {
				System.out.print(" + ");
			}
		}
		System.out.println('\n');
	}
}
