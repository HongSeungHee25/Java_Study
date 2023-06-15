package partA.day08;

public class A32StringFotmat {
	
	//문자열의 출력 형식(패턴)을 정하는 static (클래스) 메소드
	public static void main(String[] args) {
		
		String name = "김모모";
		int age = 25;
		double point = 135.6;
		
		//데이터 형식을 지정 문자 : %d(정수), %f(실수) , %s(문자열) 등을 사용합니다.
		String result = String.format
				("%s(%d세) 고객님! 현재 포인트는 %.1f포인트 입니다. ", name,age,point);
		System.out.println(result);
		System.out.println(name+"("+age+"세) 고객님! 현재 포인트는 "+point+"포인트 입니다." ); //문자열 연결 처리 5번 반복적으로 실행 

		System.out.printf("%s(%d세) 고객님! 현재 포인트는 %.1f포인트 입니다. ", name,age,point);
		System.out.println("\n"+String.format("%s(%d세) 고객님! 현재 포인트는 %.1f포인트 입니다. ", name,age,point));
		
		//String.valueOf 클래스메소드 테스트
		//String.valueOf 클래스메소드를 int, double, 등 원시타입 데이터를 String 으로 변환시킵니다.
		
		String str = String.valueOf(12345);
		System.out.println("정수 12345를 문자열 \"12345\"로 변환합니다.");
		System.out.println(str +","+str.length());
		str = String.valueOf(3.141519222);
		System.out.println("실수 3.141519222를 문자열 \"3.141519222\" 로 변환합니다.");
		System.out.println(str + ","+str.length());
		
		System.out.println("Integer.value0Of('1') = "+Integer.valueOf('1'));
		System.out.println("Integer.parseInt(\"1\") = "+Integer.parseInt("1"));
		//System.out.println("Integer.parseInt(\"12345\") = "+Integer.parseInt("12345"));
		//System.out.println("Integer.valueOf('1') = "+Integer.valueOf('1'));
		
		int test = Integer.parseInt("12345");	//리턴타입이 int
		test = Integer.valueOf("12345");		//리턴타입이 Integer
	}

}

/*
 * 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return하는 solution 함수를 만들어 주세요.
 * 예를 들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
 * 		   N = 12345 1 + 2 + 3 + 4 + 5 = 15
 * 
 * 		방법1)
 * 		문자열을 인덱스 i로 1개씩 substring으로 가져오면 String
 * 		이 문제는 '1' 을 정수 1로 바꾸어야 합니다. Integer.parseInt("1")
 * 
 * 		방법2)
 * 		123/100 + 23/10 + 3/1 = 1 + 2 + 3 = 6
 * 		12345/10000 + 2345/1000 + 345/100 + ..... = 1 + 2 + 3 +...
 */



















