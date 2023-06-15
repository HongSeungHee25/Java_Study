package Inheritance;

//학생 클래스
public class Student {

	private String name;		//학생 이름
	private int StudentID;		//학번
	private int phoneNumber;	//전화번호
	
	//필드값 getter,setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStudentID() {
		return StudentID;
	}
	public void setStudentID(int studentID) {
		StudentID = studentID;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return String.format("이름 : %s\n학번 : %d\n전화번호 : %d", name,StudentID,phoneNumber);
	}
	
}
