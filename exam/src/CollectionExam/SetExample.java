package CollectionExam;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	
	//Set 예시 + HashSet,LinkedHashSet,TreeSet
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>(); //HashSet 인스턴스 생성
		//요소 추가
		set.add("사과");
		set.add("바나나");
		set.add("체리");
		//요소 삭제
		set.remove("바나나");
		//요소 검색
		boolean contains = set.contains("사과");
		//Set 크기 확인
		set.size();
		//Set 순회
		for (String element : set) {
		    System.out.println(element);
		}
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
		//HashSet 생성 => 순서가 중요하지 않고 중복을 허용하지 않을 때 사용
		HashSet<String> hashSet = new HashSet<>();
	
		//요소 추가
		hashSet.add("사과");
		hashSet.add("바나나");
		hashSet.add("체리");
		
		//요소 출력
		System.out.println("hashSet = "+hashSet);
		//출력 값 = [체리, 사과, 바나나]
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
		//LinkedHashSet 생성 => 순서가 중요하고 중복을 허용하지 않을 때 사용
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		
		//요소 추가
		linkedHashSet.add("사과");
		linkedHashSet.add("포도");
		linkedHashSet.add("복숭아");
		
		//요소 출력
		System.out.println("linkedHashSet = "+linkedHashSet);
		//출력 값 = [사과, 포도, 복숭아]
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
		//TreeSet 생성  => 정렬된 순서로 요소를 유지하고 중복을 허용하지 않을때 사용
		TreeSet<String> treeSet = new TreeSet<>();
		
		//요소 추가
		treeSet.add("자두");
		treeSet.add("딸기");
		treeSet.add("귤");
		
		//요소 출력
		System.out.println("treeSet = "+treeSet);
		//출력 값 = [귤, 딸기, 자두]
	}

}
