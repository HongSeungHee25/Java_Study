package codingtest;

import java.util.Scanner;

//작성자 : 홍승희

//코딩 테스트 : Lv.1 약수의 합 - 정답률 87%
public class AdditionReturn {

	public static void main(String[] args) {

		/*
		 * 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, 
		 * solution을 완성해주세요.
		 * 
		 * 제한 사항
		 * - n은 0 이상 3000이하인 정수입니다.
		 */
		
		//입력 받을 스캐너 객체 생성
		System.out.println("[문제 Lv.1 : 약수의 합 (정답률 87%)]");
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 >> ");
		int n = sc.nextInt();
		int answer = 0;
		
		
		for (int i = 1; i <= n; i++) {
			if(n % i == 0) {
				answer += i;
			}
		}
		System.out.println("정수 '"+n+"' 의 약수는 '"+answer+"'입니다.");
	}

}
