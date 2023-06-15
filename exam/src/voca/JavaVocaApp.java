package voca;

import java.util.List;
import java.util.Scanner;

public class JavaVocaApp {

	//단어장 프로그램 -> 수정,삭제 기능 알아보고 해보기 
	public static void main(String[] args) {
		
		JavaVocaNote myNote = new JavaVocaNote();
		
		Scanner sc = new Scanner(System.in);
		String english;
		String korean;
		String level;
		String sel;
		boolean run = true;
		String path = "C:\\Users\\82108\\OneDrive\\바탕 화면\\coding\\javavoca.txt";
		//1. 프로그램을 시작하면 저장된 단어들을 파일에서 읽어옵니다.
		System.out.println("📝 단어장 📝 ");
		myNote.load(path);
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.println("📝 단어장 프로그램을 시작합니다. Hello 🫵🏻🖐🏻");
		System.out.println("\n선택 기능 👉🏻👉 [n]📝 새 단어 저장 [s]🔎 단어 찾기 [g]👪 Level선택 보기 [a]🅰️ 전체보기 [d]⛔ 삭제하기 [f]✍🏻 수정하기 [e]👋🏻 프로그램 끝내기");
		
		while(run) {
			System.out.print("\n선택 ✏️ -> ");
			sel = sc.nextLine();
			
			switch (sel) {
			case "n":
				System.out.print("단어 입력 ✍🏻 ");
				english = sc.nextLine();
				System.out.print("뜻(의미) ✍🏻 ");
				korean = sc.nextLine();
				System.out.print("👪 Level(1👶🏻 : 기초, 2👧🏻 : 중급, 3👩🏻 : 고급) ✏️ ");
				level = sc.nextLine();
				//add() 메소드 실행하기
				JavaVoca v = new JavaVoca(english, korean, level);
				v.setLevel(level); //level 1,2,3 입력 받은 것을 해당 문자열로 변환하기
				myNote.add(v);
				myNote.save(path);
				break;
			case "s":	
				System.out.print("🔎 검색할 Java 단어 입력 ✏️ ");
				english = sc.nextLine();
				JavaVoca s = myNote.getVoca().get(english);
				if(s == null) System.out.println("📕 찾는 단어가 없습니다. 🙏🏻");
				else System.out.println("📚 단어를 찾았습니다. 👉🏻👉🏻 "+s);
				break;
			case "g":	
				System.out.print("🔎 검색할 Level(1👶🏻 : 기초, 2👧🏻 : 중급, 3👩🏻 : 고급) ✏️ ");
				String group = sc.nextLine(); 		//1,2,3 중 하나를 입력
				List<JavaVoca> results = myNote.group(group);
				for(int i = 0; i < results.size(); i++) {
					System.out.println("🔎 Level 검색 결과 👉🏻👉🏻 "+results.get(i));
				}
				break;
			case "a":	
				//화면이 모두 출력 메소드 호출
				myNote.print();
				break;
			case "d": //삭제하기
				System.out.print("🔎 삭제할 Java 단어 입력 ✏️ ");
				english = sc.nextLine();
				myNote.delete(english);
				myNote.save(path);
				break;
			case "f":	//수정하기
				System.out.print("🔎 수정할 Java 단어 입력 ✏️ ");
				english = sc.nextLine();
				myNote.update(english);
				myNote.save(path);
				break;
			case "e":	
				run = false; 		//종료조건
				break;
				
			}//switch
		}//while
		System.out.println("👋🏻👋🏻👋🏻 Java 단어장을 종료합니다. Bye..Bye.. 👋🏻👋🏻👋🏻");
	}//main
}//class
