package partA.day06;

public class A26MyUtilltyTest {

	public static void main(String[] args) {
		
		//메소드는 클래스의 구성요소인 '동작(데이터 처리)' 입니다.
		//필드는 클래스의 구성요소인 '특성(데이터)'을 나타내는 변수입니다.
		System.out.println("MyUtillty 필드 TEST 값 = "+MyUtillty.TEST);
		System.out.println("MyUtillty 필드 TEMP 값 = "+MyUtillty.TEMP);

		//MyUtillty의 static 즉 클래스 메소드를 테스트해보기. 사용방법은 클래스이름.메소드();
		//private은 다른 클래스에서 사용할 수 없는 접근 제한입니다.
		//int code = MyUtillty.toAscii("$"); //오류 : private 메소드
		
		MyUtillty.alphabetPrint(0);
		MyUtillty.alphabetPrint(1);
		
		double result = MyUtillty.sumThreeDoble(3, 4, 5.2);
		System.out.println("result = "+result);
		
		
	}

}
