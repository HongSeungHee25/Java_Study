package partC.day17.beable;

public class Human implements Thinkable,Cookable,Runnable{
	
	//부모 인터페이스의 추상메소드 정의하기
	@Override
	public String beAble() {
		return "Thinkable,Cookable,Runnable";
	}
	//Runnable
	@Override
	public String run(int speed) {
		return "사람은 " + speed+" km/h 로 잘 달립니다.";
	}
	//Cookable
	@Override
	public void cook(String meterial) {
		System.out.println("사람은 "+meterial+" 재료로 요리를 잘 합니다.");
	}
	//Thinkable
	@Override
	public void think() {
		System.out.println("사람은 생각을 창의적으로 합니다.");
	}

	@Override
	public int calculate(int a, int b) {
		if(a>=99999&&b>=99999) {
			System.out.println("사람이 암산으로 덧셈 할 수 없는 값입니다.");
			return -99999999;
		}else {
			System.out.println("덧셈으로 암산합니다.");
			return a+b;
		}
	}
}
