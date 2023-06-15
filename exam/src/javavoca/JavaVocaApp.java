package javavoca;

import java.util.List;
import java.util.Scanner;

public class JavaVocaApp {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		//---필드 선언부---//
		//String	english , korean , level , num , path, boolean->run
		String english;
		String korean;
		String level;
		String num;
		boolean run = true;
		//단어를 저장할 객체 생성 (힌트 : ???타입의 객체 생성)
		JavaVocaNote myNote = new JavaVocaNote();
		//단어장 프로그램 시작
		//1. 시작하면 단어장 파일 불러오기
		String path = "C:\\Users\\82108\\OneDrive\\바탕 화면\\coding\\javavoca.txt";
		myNote.load(path);
		//2. 종료 선택할 때 까지 while 반복문
		while(run) {
		//'run'변수가 'true'인 동안 반복하는 'while'루프입니다.
			System.out.println("━".repeat(82)+"┓");
			System.out.println("[n]새 단어 저장   [s]단어 찾기   [g]그룹선택 보기   [d] 삭제   [a]전체보기   [e]프로그램 끝내기 ┃");
			System.out.print("선택 ✏ ->");
			num = sc.nextLine();
			//3. switch문으로 각 기능 구현
			switch (num) {
			//새 단어 저장
			case "n":
			//사용자로부터 단어와 뜻, 그룹을 입력받고, 해당정보를 'JavaVoca'객체로 생성하여 
			//'myNote'객체의 'add'메서드를 호출하여 단어를 저장합니다.
				//1. 저장할 데이터 입력
				System.out.print("단어를 입력해주세요 >> ");
				english = sc.nextLine();
				System.out.print("뜻(의미)를 입력해주세요 >> ");
				korean = sc.nextLine();
				System.out.print("그룹(1 : 기초, 2 : 중급, 3 : 고급) >> ");
				level = sc.nextLine();
				//2. 입력한 데이터를 JavaVoca 형식으로 저장
				JavaVoca vo = new JavaVoca(english, korean, level);
				//2-1. level(숫자) 를 level(단어) 로 변경
				vo.setLevel(level);
				//3. JavaVocaNote에 추가하기
				myNote.add(vo);
				break;
			//단어 찾기
			case "s":
			//사용자로부터 찾을 단어를 입력받고, 해당정보를 'myNote'객체의
			//'getVoca'메서드를 통해 검색하여 결과를 출력합니다.
				//1. 찾을 단어를 입력
				System.out.print("찾을 단어를 입력해주세요 >> ");
				english = sc.nextLine();
				//2. 단어 비교를 위해 JavaVoca 클래스의 객체 생성
				JavaVoca vos = myNote.getVoca().get(english);
				//3. 단어 비교 후 알맞은 출력문 출력
				if(vos == null) System.out.println("찾는 단어가 없습니다.");
				else System.out.println("단어를 찾았습니다 => "+vos);
				break;
			//그룹 선택 보기
			case "g":
			//사용자로부터 그룹 번호를 입력받고, 해당 그룹에 속하는 단어들을
			//'myNote'객체의 'group'메서드를 호출하여 검색하고 결과를 출력합니다.
				//1. 찾을 그룹의 번호를 입력
				System.out.print("검색할 그룹(1 : 기초, 2 : 중급, 3 : 고급) >> ");
				level = sc.nextLine();
				//2. group() 메소드의 리턴값이 List 이므로 List 객체 생성
				List<JavaVoca> results = myNote.group(level);
				System.out.println(results);
				break;
			//삭제
			case "d":
			//사용자로부터 삭제할 단어를 입력받고, 해당 단어를 'myNote'객체의 'remove'메서드를
			//호출하여 삭제합니다.
				//1. 삭제할 단어를 입력
				System.out.print("삭제할 단어를 입력해주세요 >> ");
				english = sc.nextLine();
				//2. 삭제 메소드의 실행 결과를 JavaVoca 타입의 remove 객체에 담음
				JavaVoca vod = myNote.remove(english);
				if(vod == null) System.out.println("단어장에 없는 단어입니다.");
				else System.out.println("단어 => "+vod+"를 삭제하였습니다.");
				break;
			//전체 보기
			case "a":
			//'myNote'객체의 'print'메서드를 호출하여 단어장 전체를 출력합니다.
				//출력 메소드 사용
				myNote.print();
				break;
			//프로그램 끝내기
			case "e":
			//'myNote'객체의 'save'메서드를 호출하여 단어장을 파일에 저장한 후 프로그램을 종료합니다.
				//프로그램이 종료될 때 , 단어장 파일을 갱신(update)하기 : Map에 저장된 데이터를 파일로 저장하기
				myNote.save(path);
				System.out.println("단어장이 파일에 정상적으로 저장되었습니다.");
				run = false;
				break;
			}//switch end
		}//while end
		//단어장 종료 후 출력할 문장을 입력
		System.out.println("단어장 프로그램이 종료되었습니다.");
	}//main end
}//main class end
