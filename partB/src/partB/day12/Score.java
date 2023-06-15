package partB.day12;

//sum(), average() 메소드는 인스턴스 필드로 계산한 결과를 리턴하는 인스턴스 메소드
public class Score {
	//저장할 값은 name, korea, english, sciense (3개 과목 점수)
	//필드는 모두 private. getter/setter 필요
	//모든 필드값 문자열로 리턴하는 메소드
	//sum(), average() 메소드
	private String name;
	private int korea;
	private int english;
	private int science;
	
	//생성자를 day13에서 배우고나서 보니 , 여기는 기본 생성자가 생략된 상태로 
	//객체 생성시에는 기본생성자만 실행이 가능합니다.
	
	public String getname() {
		return name;
	}
	public int getkorea() {
		return korea;
	}
	public int getenglish() {
		return english;
	}
	public int getscience() {
		return science;
	}
	public void setname(String name) {
		this.name = name;
	}
	public void setkorea(int korea) {
		this.korea = korea;
	}
	public void setenglish(int english) {
		this.english = english;
	}
	public void setsciense(int sciense) {
		this.science = sciense;
	}
	
	//인스턴스 메소드로 만듭니다.
	public int sum() {
		return korea + english + science;
	}
	public double average() {
		return (double)sum()/3;
	}
	public String member() {
		return String.format("이름 : %s \n성적 : [국어점수 = %d, 영어점수 = %d, 과학점수 = %d] \n      [합계 : %d, 평균 : %.2f]", name,korea,english,science,sum(),average());
	}
}
