package solution;

public class PruductTest {

	public static void main(String[] args) {
		//[1] main 메소드에 Product 배열(크기는 10) cart 를 선언합니다.
		Pruduct[] cart = new Pruduct[10];
		
		cart[0] = new Bike(123000,"MTB",25);
		cart[3] = new Bike(99000,"삼천리",15);
		
		cart[1] = new Electronics();
		cart[1].price = 35000; cart[1].prdName = "USB";
		cart[5] = new Electronics();
		cart[5].price = 117000; cart[5].prdName = "ipad";
		cart[7] = new Electronics();
		cart[7].price = 2250000; cart[7].prdName = "lg냉장고";
		
		System.out.println(cart[0].sell(15));
		System.out.println(cart[1].sell("트레이닝"));
		
		//[3] 위 [1]번에 생성된 cart 배열 상품 중 가격이 10만원 이상인 것을 출력하세요. 출력은 toString 메소드로 합니다.
		//문제에서 조건 확인 // 코드를 이해해야함
		for(int i=0;i<cart.length;i++) {
			if(cart[i] != null && cart[i].price >= 100000) {
				if(cart[i] instanceof Bike) {
				Bike b = (Bike)cart[i];
				System.out.println(b.toString());
			}//Bike 캐스팅
			if(cart[i] instanceof Electronics) {
				Electronics e = (Electronics)cart[i];
				System.out.println(e.toString());
				}//Electronics 캐스팅
			}//첫번째 if문
		}//FOR 문
	}//main
}//class
