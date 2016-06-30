package com.softline.javacake.test;

/**
 * @author softlinecode@gmail.com
 */
public class Exercise {
	public static void main(String[] args) {
		//Set Polynomial A
		System.out.println("Create Nodes for Polynomial A");
		NodeList poly_A = new NodeList();
		poly_A.appendTerm(4, 3);
		poly_A.appendTerm(3, 2);
		poly_A.appendTerm(5, 1);
		System.out.print("A = ");
		poly_A.printPolynomial();

		//Set Polynomial B
		System.out.println("Create Nodes for Polynomial B");
		NodeList poly_B = new NodeList();
		poly_B.appendTerm(3, 4);
		poly_B.appendTerm(1, 3);
		poly_B.appendTerm(2, 1);
		poly_B.appendTerm(1, 0);
		System.out.print("B = ");
		poly_B.printPolynomial();

		//Set the Polynomial C (=A+B)
		System.out.println("Create Nodes for Polynomial C (= A + B)");
		NodeList poly_C = new NodeList();
		poly_C.addPolynomial(poly_A, poly_B);

		System.out.print("Confirm the result.\nC = ");
		poly_C.printPolynomial();
	}
}
