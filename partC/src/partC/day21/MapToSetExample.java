package partC.day21;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapToSetExample {
	//Map에서 Set으로 전환하는 코드 예시
	public static void main(String[] args) {
		//Map 생성 및 데이터 추가
		Map<String, Integer> map = new HashMap<>(); //HashMap을 사용하여 Map 생성
		map.put("Apple", 100);	//put() 메서드 사용하여 데이터 추가
		map.put("Banana", 200);
		map.put("Cherry", 300);
		
		//keySet() 메서드를 사용하여 Map의 key를 Set으로 변환
		Set<String> keySet = map.keySet(); 
		System.out.println("Keys : "+keySet);
		
		//entrySet() 메서드를 사용하여 Map의 key-value 쌍을 Set으로 변환
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		System.out.println("Entries : "+entrySet);
	}

}
