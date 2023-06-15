package partC.day17;

//Member 클래스의 객체를 비교가능하도록 인터페이스 사용하기
public class Member implements Comparable<Member>{
	
	private String id;
	private String name;
	private int age;
	private double point;
	
	//Comparable<Member> 인터페이스의 추상메소드 정의하기
	@Override
	public int compareTo(Member o) { //this.name 과 인자 객체인 o 의 name 비교
		//name 필드로 비교한다면
		return this.name.compareTo(o.getname());
		//age 필드로 비교한다면  	//age 필드는 int형이므로 뺄셈식으로 리턴.
		//return this.age-o.age;
	}
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getid() {return id;}
	public String getname() {return name;}
	public int getage() {return age;}
	public double getpoint() {return point;}
	
	//객체 필드값 정보 리턴
	public String toString() {
		return String.format("id=%s , name=%s, age=%d, point=%.1f\n",id,name,age,point);
	}

}
