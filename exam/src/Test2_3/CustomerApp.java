package Test2_3;

import java.util.List;
import java.util.Scanner;

public class CustomerApp {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//---필드 선언부---//
		String name;
		String address;
		String grade;
		String sel;
		boolean run = true;
		String path = "C:\\Users\\82108\\OneDrive\\바탕 화면\\coding\\CustomerInformation.txt";
		
		
		//파일 불러올 객체 생성
		CustomerNote csn = new CustomerNote();
		
		//시작하면 파일 불러오기
		csn.load(path);
		//시작
		System.out.println("[n]새로운 사용자 등록   [g]그룹선택 보기   [a]전체보기   [e]프로그램 끝내기");
		
		while(run) {
			System.out.print("선택 ▶ ");
			sel = sc.nextLine();
			switch(sel) {
			
			//새로운 사용자 등록
			case "n":
				System.out.println("이름 입력 >>");
				name = sc.nextLine();
				System.out.println("주소 입력 >>");
				address = sc.nextLine();
				System.out.println("그룹 입력 >>");
				grade = sc.nextLine();
				Customer c = new Customer(name, address, grade);
				c.setGrade(grade);
				csn.add(c);
				break;
			//그룹 선택 보기
			case "g":
				System.out.println("그룹 선택 (1,2,3)>>");
				grade = sc.nextLine();
				List<Customer> results = csn.group(grade);
				System.out.println(results);
				break;
			//전체 보기
			case "a":
				csn.print();
				break;
			//프로그램 끝내기
			case "e":
				//프로그램이 종료될 때 , 단어장 파일을 갱신(update)하기
				csn.save(path);
				run = false;
					//Map에 저장된 데이터를 파일로 저장하기
				break;
			}//switch end
		}//while end
		
		
	}//main end
}//main class end
