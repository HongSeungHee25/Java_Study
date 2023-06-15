package partC.day22.example;

public class Customer {
//== > String name, String address, String grade 필드
	private String name; 	//이름
	private String address;	//주소	
	private String grade;	//등급
	
	@Override
		public String toString() { //이 문자열이 저장되는 형태
			return name+"\t"+address+"("+grade+")";
		}
	
	public Customer(String name, String address, String grade) {
		this.name = name;
		this.address = address;
		this.grade = grade;
	}


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
		case "1" -> "인턴";
		case "2" -> "직원";
		case "3" -> "대리";
		case "4" -> "팀장";
		case "5" -> "CEO";
		default -> throw new IllegalArgumentException("Unexpected (value = 1 or 2 or 3 or 4 or 5) : "+grade);
							 //잘못된 인자값으로 발생되는 예외. 이런경우는 예외로 분류해서 처리하고 싶을 때 사용하면 됩니다.
		//default -> ""; //throw와 비교해 보세요.
		
		}; 					 
	}
}
