package partB.day15;

public class OLadderShape extends AShape{

	private int topLength;
	private int bottomLength;
	
	//기본 생성자
	public OLadderShape() {
		System.out.println("자식 클래스 OLadderShape 기본 생성자 실행완료!");
	}
	
	public OLadderShape(String shapName, int height, int topLength, int bottomLength) {
		super(shapName);
		System.out.println("자식 클래스 OLadderShape 커스텀 생성자 실행완료!");
		super.height = height;
		this.topLength = topLength;
		this.bottomLength = bottomLength;
	}
	public void iamLadder() {
		System.out.println("I am Ladder. -"+super.shapeName);
		System.out.println("윗변 = "+this.topLength+", 아랫변 = "+this.bottomLength);
	}
	
	@Override
	public int area() {
		return (topLength+bottomLength)*super.height/2;
	}

	@Override
	public void resize(int size) {
		this.topLength += size;
		this.bottomLength += size;
	}

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
	
	@Override
	public String toString() {
		return super.toString()+",윗변 = "+this.topLength+", 아랫변 = "+this.bottomLength;
	}

}
