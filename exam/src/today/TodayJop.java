package today;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class TodayJop {
	
	public static void main(String[] args) {
		/*
		 * Map<> 을 응용해서 직업 선택 프로그램 만들기
		 * 아래 직업 중 투표해 주세요. - 개발자, 미용사, 요리사, 상담사, 공무원, 회계사 
		 * 입력(종료는 end) >>> '입력하기'
		 * =투표 중간 결과=
		 * {개발자 = 1, 미용사 = 0, 요리사,....}
		 * 
		 */

		//사용자에게 입력을 받기 위해 Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		
		//입력할 변수 생성 
		Map<String, Integer> jop = new LinkedHashMap<String, Integer>();
		// <String, Integer> = {개발자(문자열) = 1(정수)}
		
		//변수를 생성했으니 초기값을 넣어줘야함
		jop.put("개발자", 0);
		jop.put("미용사", 0);
		jop.put("요리사", 0);
		jop.put("상담사", 0);
		jop.put("공무원", 0);
		jop.put("회계사", 0);
		
		System.out.println("Map의 key값으로 만든 set : "+jop.keySet());
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		//jop = 직업 이름(key 값)이 다 나온 상태
		while(true) {
			String jops = "";
			for(String key : jop.keySet()) {
				jops += key + ",";
			}//for end
			//선택한 메뉴를 입력받으면 -> key값
			System.out.println(String.format("아래 직업 중 투표 해주세요. - %s", jops));
			
			//입력
			System.out.print("입력(종료는 end) >>> ");
			String choice = sc.nextLine();
			
			if(choice.equals("end")) break;
			//'end' 입력시 종료
			
			//비교
			boolean isEmpty = jop.containsKey(choice);
			if(isEmpty == true) {
				Iterator<String> iterKey = jop.keySet().iterator();
				String key = iterKey.next();
				int count = jop.get(key);
				count += 1;
				jop.put(key, count);
			}else {
				System.out.println("없는 직업입니다. 투표항목에 추가합니다.");
				jop.put(choice, 1);
			}
			System.out.println("━━━투표 중간 결과━━━");
			System.out.println(jop);
			System.out.println();
		}
		System.out.println("투표를 종료합니다.");
		System.out.println("━━━최종 투표 결과━━━");
		System.out.println(jop);
	}//main end
}//class end
