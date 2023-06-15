package partA.day05;

public class A19Nof2 {

	public static void main(String[] args) {
		int result = 1;
		int i;
		
		for(i = 0; i < 3; i++) { //3번 실행합니다. result = 2 * 2 * 2 => 2의 3승은 8
			result *= 2;			//반복되는 수식에 제어변수 i를 사용하지 않습니다. result = result * 2
		}
		System.out.println("2의 "+i+"제곱은 "+result+"입니다.");
	}

}
