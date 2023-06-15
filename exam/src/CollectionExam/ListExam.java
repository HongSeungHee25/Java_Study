package CollectionExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ListExam { //List<E> 는 인터페이스이고 List<E>를 상속받아 자식 클래스를 생성하고, 
						//생성한 자식클래스를 이용해 객체를 생성해야한다.
						//List<E> 안에 각각의 특성 및 목적이 다른 클래스가 구현되어 있는데, 
						//대표적으로 ArrayList<E>, Vector<E>, LinkedList<E> 가 있다.
	public static void main(String[] args) {
		
		//배열과 리스트의 차이점 -> 배열과 리스트의 가장 큰 차이점은 *저장공간의 크기가 고정적인지, 동적으로 변화하는지* 이다.
		//배열의 특징
		String[] array = new String[] {"가","나","다"};
		array[1] = null;
		System.out.println(array.length); //결과 값 -> 3
		//크기가 3인 배열 중 "나" 데이터가 필요없어졌을 경우 array[1] 에 null 값을 입력하는 방법밖에 없다.
		
		//List 의 특징
		List<String> aList = new ArrayList<String>();
		aList.add("가"); //.add 문자열 추가
		aList.add("나");
		aList.add("다");
		aList.size(); //결과 값 -> 3 //.size 문자열 크기 
		
		aList.remove("나");
		aList.size(); //결과 값 -> 2
		//List는 배열과는 다르게 필요없는 부분만 remove()를 사용하여 제거할 수 있다. 제거 후에는 리스트의 크기도 같이 조정된다.
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━		
		//1. List<E> 인터페이스의 구현 클래스 생성자로 동적 컬렉션 생성
		//List<제너릭 타입 지정> 참조변수 = new ArrayList<제너릭 타입 지정>();
		//List<제너릭 타입 지정> 참조변수 = new Vector<제너릭 타입 지정>();
		//List<제너릭 타입 지정> 참조변수 = new LinkedList<제너릭 타입 지정>();
		
		//ArrayList<제너릭 타입 지정> 참조변수 = new ArrayList<제너릭 타입 지정>();
		//Vector<제너릭 타입 지정> 참조변수 = new Vector<제너릭 타입 지정>();
		//LinkedList<제너릭 타입 지정> 참조변수 = new LinkedList<제너릭 타입 지정>();
		List<Integer> aList2 = new ArrayList<Integer>();  	//capacity(용량) = 10 
		List<Integer> aList3 = new ArrayList<Integer>(30);	//capacity(용량) = 30 
		Vector<String> aList4 = new Vector<String>();		//capacity(용량) = 10
		//여기서 'capacity(용량) = 10'은 실제 데이터의 개수를 나타내는 저장공간의 크기가 아닌
		//데이터를 저장하기 위해 미리 할당해 놓은 메모리 크기이다.(size() 아님)
		
		//오류 : LinkedList는 capacity(용량) 지정 불가
 		//List<ListExam> aList5 = new LinkedList<ListExam>(20);
		
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━		
		//2. Arrays.asList() 메소드를 이용해 정적 컬렉션 객체 생성
		//내부적으로는 배열을 먼저 생성하고, 이를 List<E> 로 래핑(Wrapping) 즉, 포장만 해 놓은 것이다.
		//따라서 내부 구조는 배열과 동일하므로 컬렉션 객체인데도 저장 공간의 크기를 변경할 수 없다. 
		
		//List<제너릭 타입 지정> 참조변수 = Arrays.asList(제너릭 타입 저장 데이터);
		List<Integer> aList1 = Arrays.asList(1, 2, 3, 4);
		aList.set(1, "7"); //결과 값 -> [1,7,3,4]
		//저장 공간의 크기를 변경하지 않는 데이터의 변경(set())은 가능하다. 
		//따라서 고정된 개수의 데이터를 저장하거나 활용할 때 주로 사용한다.
		
		
		
		
		
		
	}
}
