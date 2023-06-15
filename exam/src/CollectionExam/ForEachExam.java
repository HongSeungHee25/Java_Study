package CollectionExam;

import java.util.ArrayList;

public class ForEachExam {
/* ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
 * 자바의 'for-each'문법은 배열이나 컬렉션과 같은 반복 가능한 객체를 순회(iterate)할 때 사용되는 편리한 방법입니다.
 * 'for-each'문법은 반복문을 간경하게 작성할 수 있으며, 요소들을 순차적으로 접근할 때 유용합니다.
 * 
 * <for-each 형식>
 * for(element_type  element : iterable_object){ 반복 실행될 코드 }
 * 여기서 'elemen_type'은 배열이나 컬렉션의 요소 타입을 나타내며, 'iterable_object'는 반복 가능한 객체를 의미합니다.
 * 'iterable_object'는 배열이나 'Iterable'인터페이스를 구현한 컬렉션 등이 될 수 있습니다.
 * 
 * 'for-each'문법은 반복문을 통해 'iterable_object'의 요소를 순차적으로 접근하면서, 각 요소를 'element'라는 변수에 할당하여
 * 반복 실행될 코드 블록을 수행합니다. 코드 블록은 반복문이 한 번 실행될 때마다 실행되며, 'element'변수는 해당 요소의 값을 가지게 됩니다.
 * ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
 */
	
	//for-each 예시
	public static void main(String[] args) {
		//배열 순회 예시
		int[] numbers = {1,2,3,4,5};
		for (int i : numbers) {
			System.out.println(i);
		}
		
		//ArrayList 순회 예시
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("딸기");
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
/*━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
 * 위의 예시에서 'for-each'문법을 사용하여 배열 'numbers'의 요소와 'ArrayList' 'fruits'의 요소를 순회하고 출력하고 있습니다.
 * 각 요소는 'i'와 'fruit'라는 변수에 할당되어 'System.out.println()'을 통해 출력됩니다.
 * 
 * 'for-each'문법을 사용하면 반복 인덱스를 직접 다루지 않고도 요소에 간편하게 접근할 수 있으며, 코드를 간결하게 작성할 수 있습니다. 다만,
 * 요소의 순서를 변경하거나 요소를 삭제하는 등의 작업은 'for-each'문법에서 직접적으로 처리할 수 없습니다. 이런 경우에는 일반적인 
 * 'for'루프나 'Iterator'를 사용해야 합니다.
 *━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━	
 */
		
		
		
		
		
	}
}
