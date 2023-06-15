package CollectionExam;

import java.util.ArrayList;

public class ArrayListExample {

	//ArrayList 예시
	public static void main(String[] args) {
		
//1) ArrayList 객체 생성 : 'ArrayList<String> fruits = new ArrayList<>();' 라인에서 'ArrayList'객체를 생성합니다.
//'<String>'은 'ArrayList'에 저장될 요소의 타입을 나타냅니다.
		ArrayList<String> fruits = new ArrayList<>();
		
//2) ArrayList에 요소 추가 : 'fruits.add("사과");'와 같은 형태로 'add()'메서드를 사용하여 요소를 'ArrayList'에 추가할 수 있습니다.
		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("딸기");
		
//3) 요소 접근 : 'fruits.get(0)'와 같이 'get()'메서드를 사용하여 특정 인덱스에 위치한 요소에 접근할 수 있습니다.
		System.out.println(fruits.get(0)); //"사과" 출력
		
//4) 요소 수정 : 'fruits.set(1, "수박");' 와 같이 'get()' 메서드를 사용하여 특정 인덱스에 위치한 요소를 수정할 수 있습니다.
		fruits.set(1, "수박");
		
//5) 요소 삭제 : 'fruits.remove(2);'와 같이 'remove()'메서드를 사용하여 특정 인덱스에 위치한 요소를 삭제할 수 있습니다.
		fruits.remove(2);
		
//6) 리스트 크기 확인 : 'fruits.size();'와 같이 'size()'메서드를 사용하여 'ArrayList'의 크기를 확인할 수 있습니다.
		System.out.println(fruits.size()); 	// 2 출력
		
//7) 리스트 순회 : 'for-each'문법을 사용하여 'ArrayList'의 모든 요소를 순회하고 출력할 수 있습니다.
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
//8) 데이터 조회 : 'for'문을 통해 'ArrayList'의 요소의 'size()'메서드를 사용하여 확인하고 'get()'메서드를 사용하여 조회했습니다.		
		for (int i = 0; i < fruits.size(); i++) {
			System.out.println(fruits.get(i));
		}
//7),8)번은 결과 값이 똑같음. 편한 방법데로 해도 되지만 때에 따라 사용해야할게 달라질수 있음. 알아서 잘 판단해야함.		
	}

}
