package exam;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class TodayMenuVote {

	public static void main(String[] args) {
		/*
		 * 아래 메뉴 중 투표해 주세요. -치킨, 곱창, 떡볶이, 불고기, 햄버거
		 * 입력(종료는 END) >>> '입력하기'
		 * =투표 중간 결과=
		 * {치킨= 1, 곱창 = 0, 떡볶이.....}
		 * * Map 은 출력시 {값=v, 값=v,....}
		 */
		
		//입력받기 위해 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		
		//입력할 변수 생성
		Map<String, Integer> vote = new LinkedHashMap<String, Integer>();
		
		//초기화 : 초기값이 <음식이름, 0(초기 투표수)>으로 출력되기 때문에 초기화 처리
		vote.put("치킨", 0);
		vote.put("곱창", 0);
		vote.put("떡볶이", 0);
		vote.put("불고기", 0);
		vote.put("햄버거", 0);
		
		System.out.println("map의 key 값만으로 만든 set : "+vote.keySet());
	
		//foods = 메뉴 이름(키값)이 다 나온 상태
		while(true) {
			String foods = "";
			for(String key : vote.keySet()) {
					foods += key + ",";
			}
			//선택한 메뉴를 입력받으면 -> key값
			System.out.println(String.format("아래 메뉴 중 투표해 주세요. - %s", 
				foods));
			//입력
			System.out.print("입력(종료는 end)>> ");
			String choice = sc.nextLine();
			
			if(choice.equals("end")) break;
			
			//비교
			boolean isEmpty = vote.containsKey(choice);
			if(isEmpty == true) {
				//있는 메뉴일 경우 map 에서 key에 대한 value를 가져와서 ++ 1 증가한 후 replace 합니다.	
				//key에 대한 value를 가져와서
				Iterator<String> iterKey = vote.keySet().iterator();
					String key = iterKey.next();
					int count = vote.get(key);
					//++ 1 증가한 후
					count += 1; //count = count + 1;
					//replace 합니다.
					vote.replace(key, count);
			}else {
				//없는 메뉴일 경우 map 에서 put() 하고 value는 1로 합니다.
				System.out.println("없는 메뉴입니다. 투표항목에 추가합니다.");
				vote.put(choice, 1);
			}
			System.out.println("=투표 중간 결과=");
			System.out.println(vote);
			System.out.println();
		}
		
		System.out.println("투표를 종료합니다.");
		System.out.println("최종 투표 결과 = ");
		System.out.println(vote);
		
	}
}
