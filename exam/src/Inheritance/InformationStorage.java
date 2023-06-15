package Inheritance;

import java.util.Scanner;

public class InformationStorage {

	public static void main(String[] args) {
		
		//Student 클래스 사용
		Student s = new Student();
		
		//회원 정보 저장할 변수
		Scanner sc = new Scanner(System.in);
		
		//while문을 위한 변수
		boolean status = true;
		
		//회원 정보 저장하고 검색할 변수
		String student;
		
		int num;
		while(status) {
			System.out.println("어떤것을 도와드릴까요?");
			System.out.println("1. 회원 정보 저장하기 | 2. 회원 정보 검색하기 | 3. 종료");
			System.out.print("선택해주세요 >>");
			num = sc.nextInt();
			switch(num){
			case 1:
				System.out.println("회원 정보 저장하기를 선택하셨습니다.");
				System.out.print("이름을 입력해주세요 >>");
				s.setName(sc.next());
				System.out.print("학번을 입력해주세요 >>");
				s.setStudentID(sc.nextInt());
				System.out.print("전화번호를 입력해주세요 >>");
				s.setPhoneNumber(sc.nextInt());
				break;
			case 2:
				System.out.println("회원 정보 검색하기를 선택하셨습니다.");
				System.out.print("검색할 이름을 입력해주세요 >>");
				student = sc.next();
				if(student.equals(s.getName())) {
					System.out.println("검색하신 회원 정보는 "+s.toString()+" 입니다.");
				}else {
					System.out.println("검색하신 결과가 없습니다.");
				}
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				status = false;
				break;
			}
		}
		sc.close();
	}

}
