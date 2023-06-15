package partA.day03;

import java.util.Scanner;

//작성자 : 홍승희 
public class ForExam {

	//for문 예습) for문은 반복문의 종류 중 하나입니다.
	//반복문이란 -> 특정 작업을 반복 적으로 수행하고 싶을때 사용하는 문법
	//for문 -> 특정한 횟수 동안 반복하고 싶을때 사용, 
	//몇 번을 반복해야 되는지 알고 있을때 주로 사용합니다.
	
	//구조 : for(초기식;조건식;증감식;)
	//{초기식에 선언된 변수가 조건식이 참일 동안에 반복할 명령;}
	//초기식 : 반복문에 사용될 변수를 초기화 하는 부분이며 처음에 한번만 수행된다.
	//조건식 : 조건식이 값이 참일동안 반복, 거짓이면 반복 중단 후 for문을 벗어난다.
	//증감식 : 반복문을 제어하는 변수의 값을 증가 또는 감소 시킨다.
	
	public static void main(String[] args) {
		//과제 - for문을 이용한 간단한 예제 만들기1 
		//Scanner로 입력받아서 입력받은 구구단 출력하기 
		Scanner sc = new Scanner(System.in);
		System.out.print("출력하고 싶은 단을 입력하세요>>");
		int num = sc.nextInt();
		
		System.out.println("::: 입력받아서 구구단 출력하기 :::");
		System.out.println("============ "+num+"단 ============");
		for(int i=1;i<=9;i++) {
				System.out.println(num+"x"+i+"="+(num*i));
			}
		
		//과제 - for문을 이용한 간단한 예제 만들기2
		//Scanner로 입력받아서 1부터 입력받은 정수까지 짝수값 합계,홀수값 합계 구하기
		System.out.println("\n::: 입력받아서 짝수값, 홀수값 합계 구하기 :::");
		Scanner sc1 = new Scanner(System.in);
		System.out.print("숫자를 입력하세요>>");
		int num1 = sc1.nextInt();
		
		int sum = 0; //짝수 값 변수
		int oddsum = 0; //홀수 값 변수
		
		for(int i = 1; i <= num1; i++) {
			if(i % 2 == 0) {
			//짝수값 구하는 공식 : i가 2로 나누어 떨어지는지 판별하는 조건식.
			//2로 나누어 떨어지는 숫자가 짝수값의 합계
			sum += i;
			}else { 
			//위에 조건문이 거짓일 경우 출력. 2로 나누어 떨어지지 
			//않은 숫자가 홀수값의 합계(공식 : i % 2 != 0)
			oddsum += i; 
			}
		}
		System.out.println("============ 합계 ============");
		System.out.println("1부터 "+num1+"까지의 짝수값의 합은 "+sum+"입니다.");
		System.out.println("1부터 "+num1+"까지의 홀수값의 합은 "+oddsum+"입니다.");
		
		sc.close();
		sc1.close();
		
		}
		
	}


