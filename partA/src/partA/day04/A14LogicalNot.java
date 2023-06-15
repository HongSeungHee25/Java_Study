package partA.day04;

import java.util.Scanner;

public class A14LogicalNot {

	public static void main(String[] args) { 
		//Not 논리연산 연습 : true 은 false로, false는 true로 변경합니다. 연산기호는 !
		//변수명 다른 이름으로 수정하고 싶을 때 alt + shift + r
		Scanner sc = new Scanner(System.in);
		System.out.print("아스키코드 정수값 0~128 입력하세요 >>>");
		int code = sc.nextInt();
		
		System.out.println("0~127 범위 확인 : "+(code >= 0 && code < 128));
		System.out.println("0~127 범위 아닌지 확인 : "+(code < 0 || code >= 128));
		System.out.println("0~127 범위 아닌지 확인(Not 연산) : "+!(code >= 0 && code < 128)); //위에 코드와 같은 조건식
		
		
		System.out.println("::: 아스코드값 중에 문자로 출력 가능한 범위는 32~126 :::");
		
		//32~126 일때만 출력하도록 합니다. 그러지 않으면 '출력할수 없는 문자로 출력하세요.
		System.out.println("입력 문자 => "+(code >= 32 && code < 127));
		System.out.println("출력할수 없는 문자 => "+!(code >= 32 && code < 127));
		
		if(!(code < 32 || code > 127)) {
			System.out.println("입력 문자 => "+(char)code);
		}else {
			System.out.println("출력할수 없는 문자입니다.");
		}
	}

}
