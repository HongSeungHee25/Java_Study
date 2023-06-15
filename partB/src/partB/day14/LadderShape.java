package partB.day14;

//사다리꼴 클래스
public class LadderShape extends Shape{
	
	private int topLength;			//윗변
	private int bottomLength;		//아랫변
	
	
	//부모 클래스의 width=0 으로 사용하지 않음. 생성자/getter와 setter
	public int getTopLength() {
		return topLength;
	}
	public void setTopLength(int topLength) {
		this.topLength = topLength;
	}
	public int getBottomLength() {
		return bottomLength;
	}
	public void setBottomLength(int bottomLength) {
		this.bottomLength = bottomLength;
	}
	
	//생성자에 부모 필드말고도 자식 필드를 인자로 넣을수 있음. 자식 필드는 this. 으로 해야함.
	public LadderShape(String shapeName, int height , int topLength, int bottomLength) {
		super(shapeName, 0, height);
		this.topLength = topLength;
		this.bottomLength = bottomLength;
	}
	//day15에 추가. 자식 LadderShape의 인스턴스 메소드
	public void iamLadder() {
		System.out.println("I am Ladder. - "+super.getShapeName());
		System.out.println("윗변 = "+topLength+", 아랫변 = "+bottomLength);
	}
	//사다리꼴 넓이 구하는 공식으로 메소드 재정의 해보세요.(윗변+아랫변)*높이/2
	//toString 재정의 하세요. Shape 의 toString() 활용하려면?
		
	@Override
	public String toString() {
		return String.format("도형이름 : %s , 높이 : %d , 윗변 : %d , 아랫변 : %d", getShapeName(),getHeight(),topLength,bottomLength);
		//*참고 : 아래 코드처럼 재정의 할수있음
		//return super.toString() + ", 윗변 = "+topLength+" , 아랫변 = "+bottomLength; 
	}
	
	@Override
	public int area() {
		//*참고 : 아래 코드처럼 재정의 할수있음
//		int sum = topLength + bottomLength;
//		return sum*getHeight()/2;
		return (topLength+bottomLength)*getHeight()/2;
	}
	
	
}
