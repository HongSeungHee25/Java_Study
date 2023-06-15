package solution;

//추상클래스 오버라이드 단축키 alt + shift + s + v
public class Bike extends Product{

	//[3] Bike 클래스에 sell 메소드를 재정의 합니다.
	//실행은 인자 Object 를 전달받아 “추가 할인 행사 - %d %% 인하” 을 문자열로
	//리턴합니다.String.format() 활용.
	
	@Override	//재정의
	public String sell(Object object) {
		return String.format("추가 할인 행사 - %d %% 인하",object);
	}
	//[5] Bike 클래스에는 int speed 필드를 접근 한정자 private 으로 선언하고 
	//getter,setter 메소드를 public 으로 작성하세요.
	private int speed;
	
	//getter,setter 
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	//[6] Bike 클래스는 public 생성자가 2개입니다. 
	//디폴트 생성자와 price,prdName,speed 필드를 초기화하는 커스텀 생성입니다.
	public Bike() {} 		// <- 디폴트 생성자 >> 타입이 아무것도 없으면 디폴트 생성자 
	
	//커스텀 생성자
	public Bike(int price, String prdName, int speed) {
		super.price = price;	//super. 은 부모안에서 
		super.prdName = prdName;
		this.speed = speed;		//this. 은 중괄호 안에서  
	}
	
	@Override
	public String toString() {
		return super.toString()+", 스피드"+speed+"]";
	}
}
//[4] Electronics 클래스에 sell 메소드를 재정의 합니다. 
//실행은 인자 Object 를 전달받아 “묶음 상품 - %s (1set)” 을 문자열로
//리턴합니다.String.format() 활용.
class Electronics extends Product{

	@Override
	public String sell(Object object) {
		return String.format("묶음 상품 - %s (1set)", object);
	}
}
