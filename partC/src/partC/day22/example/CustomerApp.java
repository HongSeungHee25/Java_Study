package partC.day22.example;

import java.util.List;
import java.util.Scanner;

public class CustomerApp {

	public static void main(String[] args) {
		
		CustomerAddressBook information = new CustomerAddressBook();
		
		Scanner sc = new Scanner(System.in);
		String name;
		String address;
		String grade;
		String sel;
		boolean run = true;
		
		String path = "C:\\Users\\82108\\OneDrive\\바탕 화면\\coding\\CustomerInformation.txt";
		
		information.load(path);
		System.out.println("━".repeat(120));
		System.out.println("\n선택 기능 👉🏻👉 [n]📝 새로운 직원 등록 [s]🔎 직원 찾기 [g]👪 직원 등급별 보기 [a]🅰️ 직원 전체보기 [d]⛔ 직원 해고시키기 [f]✍🏻 직원 정보 수정하기 [e]👋🏻 프로그램 끝내기");
	
		while(run) {
			System.out.print("\n선택 ✏️ -> ");
			sel = sc.nextLine();
			switch(sel) {
			case "n":
				System.out.print("직원 이름 이름 입력 ✍🏻");
				name = sc.nextLine();
				Customer temp = information.getCustomer().get(name);
				if(temp != null) {
					System.out.print("해당 직원이 주소록에 존재합니다. 수정하시겠습니까(Y / N)?");
					if(sc.nextLine().equals("N")) {
						System.out.println("새로운 직원 등록을 취소합니다.");
						continue;
					}
				}
				System.out.print("직원 주소 입력 ✍🏻 ");
				address = sc.nextLine();
				System.out.print("👪 등급(1👶🏻 : 인턴, 2👧🏻 : 직원, 3👩🏻 : 대리, 4👨🏻‍🦳 : 팀장, 5👸🏻 : CEO) ✏️ ");
				grade = sc.nextLine();
				Customer c = new Customer(name, address, grade);
				c.setGrade(grade);
				information.add(c);
				information.save(path);
				break;
			case "s":
				System.out.print("🔎 검색할 직원 이름 입력 ✏️ ");
				name = sc.nextLine();
				Customer s = information.getCustomer().get(name);
				if(s == null)System.out.println("📕 찾는 직원 정보가 없습니다. 🙏🏻");
				else System.out.println("📚 직원 정보를 찾았습니다. 👉🏻👉🏻 "+s);
				break;
			case "g":
				System.out.print("🔎 검색할 등급(1👶🏻 : 인턴, 2👧🏻 : 직원, 3👩🏻 : 대리, 4👨🏻‍🦳 : 팀장, 5👸🏻 : CEO) ✏️ ");
				String grade1 = sc.nextLine();
				List<Customer> result = information.group(grade1);
				for(int i = 0; i < result.size(); i++) {
					System.out.println("🔎 등급 검색 결과 👉🏻👉🏻 "+result.get(i));
				}
				break;
			case "a":
				information.print();
				break;
			case "d":
				System.out.print("🔎 해고할 직원 이름 입력 ✏️ ");
				name = sc.nextLine();
				information.remove(name);
				information.save(path);
				break;
			case "f":
				System.out.print("🔎 수정할 직원 이름 입력 ✏️ ");
				name = sc.nextLine();
				information.update(name);
				information.save(path);
				break;
			case "e":
				information.save(path);
				run = false;
				break;
			}
		}
	System.out.println("👋🏻👋🏻👋🏻 주소록을 종료합니다. Bye..Bye.. 👋🏻👋🏻👋🏻");
	}

}
