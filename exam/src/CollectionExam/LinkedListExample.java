package CollectionExam;

import java.util.LinkedList;

public class LinkedListExample {

	//LinkedList 예시
	public static void main(String[] args) {
		
		//LinkedList 생성
		LinkedList<String> linkedList = new LinkedList<>();
		
		//LinkedList에 요소 추가
		linkedList.add("Apple");
		linkedList.add("Banana");
		linkedList.add("Orange");
        
        //요소 접근
		String firstElement = linkedList.get(0);
		System.out.println("firstElement = "+firstElement);
		
		//요소 수정
		linkedList.set(1, "Grape");
        
		//요소 삭제
		linkedList.remove(2);
		
		//크기 확인
		linkedList.size();
		
		//전체 요소 출력 - for-each 문 사용
		for (String element : linkedList) {
			System.out.println(element);
		}
	}

}
