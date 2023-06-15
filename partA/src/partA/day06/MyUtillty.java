package partA.day06;

public class MyUtillty {
	
	//필드는 클래스의 구성요소인 특성(데이터)을 나타내는 변수. 위치를 고려하면 전역(global) 변수
	//전역변수는 이 클래스 어디서나 쓸 수 있습니다.
	public static final double VERSION = 1.1;
	//public static final 는 상수. 대문자로 표기
	//상수는 변하지 않는 의미있는 값을 이름을 붙여준 것입니다. 값을 변경할수 없습니다.
	
	public static int TEST = 1234;
	public static final int TEMP = 9999;

	public static void main(String[] args) {
		int result = SumToN(23);
		System.out.println("1~23 까지의 합 : "+result);
		
		result = SumToN(100);
		System.out.println("1~100 까지의 합 : "+result);
		
		result = sumFromNToM(5,10);
		System.out.println("5~10 까지의 합 : "+result);
		
		result = sumThreeNumber(5,6,7);
		System.out.println("3개 정수값의 합 : "+result);
		
		System.out.println("3개 실수값의 합 : "+sumThreeDoble(3.4,5.6,7.7));
		
		double d1 = 3.14;
		double d2 = 3.141;
		double d3 = 3.1419;
		
		System.out.println("3개의 실수 d1+d2+d3 = "+sumThreeDoble(d1, d2, d3));
		
		alphabetPrint(0);
		alphabetPrint(1);
		//리턴이 없고, 인자는 0 또는 1 입니다. 메소드는 0이면 대문자 A부터 Z, 1이면 a부터 z 출력		
		
		char ch = 'A';
		int code = toascii(ch); //문자 'A'에 아스키코드값 구해서 리턴받기
		System.out.println("문자 = "+ch+", 아스키코드 = "+code);
		
		code = 67;
		char result1 = toChar(code);
		System.out.println("아스키코드 = "+code+", 문자 = "+result1);
	}

	//굳이 메소드를 만들 필요가 없는 동작이지만 연습으로 합니다.
	private static int toascii(char ch) {	
		//private은 이 클래스의 다른 메소드가 사용하는 것이 목적입니다. (다른 클래스에서 사용 X)
		
		//int code = ch;		//자동 캐스팅
		//return code;
		//return (int)ch;
		System.out.println(VERSION);
		return ch;		//정상 : 리턴값도 자동 캐스팅
	}
	
	private static char toChar(int code) {
		return (char)code;
	}

	public static void alphabetPrint(int i) {
		char start = 'A';	//메소드의 지역(local)변수
		if(i == 1) start = 'a';
		for(char ch = start;ch <= start+25; ch++) {	//i값에 따라 start 결정됩니다.
			System.out.print(ch);					//마지막값은 알파벳 26개이므로 start+25
			}
//		toascii('#');	//테스트용
//		toChar(67);		//테스트용
		System.out.println();
		}
	
	//참고 : System.out.println 에서 println 메소드는 문자열을 1개 받아서 처리하고 
	//		리턴값은 없는 메소드 입니다.
	//정리 : 메소드 인자는 0,1,2,3,..... 개 모두 가능하고 
	//		리턴값 개수는 0 또는 1 입니다.
	
	public static double sumThreeDoble(double d, double e, double f) {
		return d+e+f;
	}

	public static int sumThreeNumber(int i, int j, int k) {
		
		return i+j+k;
	}

	/*
	 * 메소드 실행 순서  
	 * 1. 인자값 23 또는 100을 매개변수에 전달합니다. => SumToN 매개변수 n 저장합니다. 
	 * 2. 메소드를 인자값으로 실행합니다. sum 이 구해집니다. 
	 * 3. 구해진 결과 sum을 메소드 호출한 곳으로 전달합니다. => return
	 * 4. 메소드 호출한 결과로 받은 값을 변수 result에 저장하고 출력
	 */	
		public static int SumToN(int n) { //void ?? //n 오류??
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		//sum은 1부터 n까지의 합
		return sum;
	}
		//매개변수는 개수의 제한이 없습니다. int n, int m 또는 int start, int end 와 같이 나열합니다.
		public static int sumFromNToM(int A, int B) {
			int sum = 0;
			for(int i = A; i <= B; i++) {
				sum += i;
			}
			return sum;
			
			
		}
}
