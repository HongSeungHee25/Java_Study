package partB.day15;

public class OCircle extends AShape{

	private double radius;
	
	//기본 생성자
		public OCircle() {
			System.out.println("자식 클래스 OCircle 기본 생성자 실행완료!");
		}
		
	
	 //자식 클래스 커스텀 생성자
	public OCircle(double radius) {
		System.out.println("자식 클래스 OCircle 커스텀 생성자 실행완료!");
		//super();			//1) 부모클래스 기본생성자 호출은 생략 가능.
		this.radius = radius;	//2) 부모클래스 커스텀 생성자 호출. 1) 또는 2) 각각 테스트 해보세요.
	}
	
	public void iamCircle() {
		System.out.println("I am Circle. -"+super.shapeName);
		System.out.println("반지름 = "+this.radius);
	}
	
	@Override
	public int area() {
		return (int)(Math.PI * this.radius * this.radius);
	}

	@Override
	public void resize(int size) {
		this.radius += size;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	@Override
	public String toString() {
		return super.toString()+",반지름 = "+this.radius;
	}
	
}
