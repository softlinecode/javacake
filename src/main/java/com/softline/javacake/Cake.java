package com.softline.javacake;

/**
 * @author softlinecode@gmail.com
 */
public enum Cake {
	Carrot("당근이 들어있는 부드럽고 쫄깃한 질감의 케이크"),
	Chiffon("프랑스어로 비단(Chiffon)같이 촉촉하고 탄력 있는 시폰 시트에 부드럽고 달콤한 생크림을 바른 케이크"),
	Chocolate("초콜릿 또는 코코아를 사용하여 초콜렛맛과 색을 들인 케이크"),
	Coconut("코코넛 케이크"),
	Coffee("커피 케이크"),
	Cupcake("보통 케이크를 만드는 재료와 방법은 같으나, 큰 덩어리가 아닌 1인분량으로 컵형에 담아 굽는 케이크"),
	Fruitcake("여러 가지 과일을 넣어 만든 케이크"),
	IceCream("아이스크림 케이크"),
	King("지역에서 공현 대축일 기념 페스티벌 때, 또는 크리스마스 시즌이 끝날 때 먹는 케이크로, 작은 플라스틱 아기인형이 들어가는데(아기 예수를 의미) 이를 발견한 사람은 특권과 의무를 부여 받습니다."),
	Layer("크림이나 잼 등을 사이사이에 넣어 여러 층으로 만든 케이크"),
	Moon("유에삥(月餠, 월병) 등불, 촛불, 보름달 구경과 함께 중국의 중추절에 빼놓을 수 없는 음식"),
	Pound("밀가루, 달걀, 설탕, 버터를 각각 1대1의 비율로 섞어 만든 케이크");

	private String desc;

	private Cake(String desc) {
		this.desc = desc;
	}
}
