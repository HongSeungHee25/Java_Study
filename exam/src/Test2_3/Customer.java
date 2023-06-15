package Test2_3;

public class Customer {
	
	//Customer 클래스
	//	>> String name, address, grade 필드
	//---필드 선언부---//
	String name;
	String address;
	String grade;
	//---생성자---//
	public Customer(String name, String address, String grade) {
		this.name = name;
		this.address = address;
		this.grade = grade;
	}
	//파일이 저장되는 형태 오버라이딩
	@Override
	public String toString() {
		return name +"\t"+address+"("+grade+")";
	}
	//---getter, setter정의---//
		//단, setGrade는 커스텀 작성
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = switch(grade) {
		case "1" -> "일반 고객";
		case "2" -> "직원";
		case "3" -> "VIP";
		default -> throw new IllegalArgumentException("Unexpected (value =1 or 2 or 3) : "+grade);
 		};
	}
	
	
	
	
}
