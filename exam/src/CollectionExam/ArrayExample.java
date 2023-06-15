package CollectionExam;

public class ArrayExample {

	//배열 예시
	public static void main(String[] args) {
		
		int[] numbers = new int[5]; //크기가 5인 정수 배열 생성
		
		//배열 요소에 값을 할당
		numbers[0] = 10;	//첫 번째 요소에 값 할당
		numbers[1] = 20; 	//두 번째 요소에 값 할당
		numbers[2] = 30; 	//세 번째 요소에 값 할당
		numbers[3] = 40; 	//네 번째 요소에 값 할당
		numbers[4] = 50; 	//다섯 번째 요소에 값 할당
		
		//배열 요소에 접근하여 출력
		System.out.println("배열 요소 : ");
		System.out.println("numbers[0] : "+numbers[0]);
		System.out.println("numbers[1] : "+numbers[1]);
		System.out.println("numbers[2] : "+numbers[2]);
		System.out.println("numbers[3] : "+numbers[3]);
		System.out.println("numbers[4] : "+numbers[4]);
		
		//배열 요소의 합 구하기 및 출력
		int sum = 0;
		for(int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println("배열 요소의 합 : "+sum);
		
		//선언과 동시에 배열 초기화
		String[] fruits = {"사과","바나나","오렌지"};
		
		//반복문을 사용하여 배열 요소 접근 및 출력
		System.out.println("\n배열 요소 : ");
		for (int i = 0; i < fruits.length; i++) {
			System.out.println("fruits["+i+"] : "+fruits[i]);
		}
	}

}
