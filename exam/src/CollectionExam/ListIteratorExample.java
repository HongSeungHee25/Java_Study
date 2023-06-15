package CollectionExam;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
	//ListIterator 예시
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Alice");
		names.add("Bob");
		names.add("Charlie");
		
		ListIterator<String> iterator = names.listIterator();
		
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
			
			if(name.equals("Bob")) {
				iterator.add("David"); //현재 위치 다음에 "David" 추가
			}
			if(name.equals("Charlie")) {
				iterator.remove(); //현재 위치의 요소 삭제
			}
		}
		System.out.println(names);
	}

}
