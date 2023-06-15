package solution;

//toString 단축키 alt + shift + s + s
public class ProductTest {
 
	public static void main(String[] args) {
		// main 메소드에 Product 배열(크기는 10) cart 를 선언합니다
		//cart 배열이 다음과 같은 객체를 참조값하도록 합니다.
		//자바는 앞에 애들 기준으로 생각하면됨. 
		Product[] cart = new Product[10];	//객체생성
		
		//기본 생성자하고 커스텀 생성자 둘 다 만들었으니 두번 코드 작성하지말고 커스텀 생성자로 한번에 값 준것.
		cart[0] = new Bike(123000, "MTB",25);
		cart[3] = new Bike(99000,"삼천리",15);
		
		//커스텀 생성자가 없으니까 직접 값을 준거임.
		cart[1] = new Electronics();
		cart[1].price = 35000; cart[1].prdName = "USB";
		cart[5] = new Electronics();
		cart[5].price = 117000; cart[5].prdName = "ipad";
		cart[7] = new Electronics();
		cart[7].price = 2250000; cart[7].prdName = "lg 냉장고";
		
		System.out.println(cart[0].sell(10));
		System.out.println(cart[1].sell(10));
		
		//위에서 생성된 cart 배열 상품 중 가격이 10만원 이상인 것을 출력하세요. 
		//출력은 toString 메소드로 합니다.
		for (int i = 0; i < cart.length; i++) { //<> 앞에오고 = 뒤로
			if(cart[i] != null && cart[i].price >= 100000) {
				if(cart[i] instanceof Bike) {
					Bike b = (Bike)cart[i]; //다운캐스팅 해서 새롭게 담은것
					System.out.println(b.toString());
				}//Bike 캐스팅 
				if(cart[i] instanceof Electronics) {
					Electronics e = (Electronics)cart[i]; //다운캐스팅 해서 새롭게 담은것
					System.out.println(e.toString());
				}//Electronics 캐스팅 
			}//첫번째 if
		}//반복문
	}//메인
}//클래스
