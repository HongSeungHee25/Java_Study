package CollectionExam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
	//Iterator 예시
	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		names.add("Alice");
		names.add("Bob");
		names.add("Charlie");

		Iterator<String> iterator = names.iterator();
		while (iterator.hasNext()) {
		    String name = iterator.next();
		    if (name.equals("Bob")) {
		        iterator.remove();
		        System.out.println(names);
		    }
		}
	}

}
/*
 * public interface Iterator<E>{
 *
 *	boolean hasNext(); 	//다음 요소가 존재하는지 확인
 *	E next();			//다음 요소를 반환
 *	void remove();		//현재 요소를 삭제 (선택 사항)
 *	}
 *
 */