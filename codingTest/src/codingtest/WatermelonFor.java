package codingtest;

import java.util.Scanner;

//작성자 : 홍승희

//코딩 테스트 : Lv.1 수박수박수박수박수박? - 정답률 83%

public class WatermelonFor {

	public static void main(String[] args) {
		
		/*
		 * 길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을
		 * 완성하세요. 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.
		 * 
		 * 제한 조건
		 * - n은 길이 10,000이하인 자연수입니다.
		 */
		

		//입력받아야됨
		Scanner sc = new Scanner(System.in);
		System.out.println("[문제 Lv.1 : 수박수박수박수박수박? (정답률 83%)]");
		System.out.print("반복할 횟수를 입력해주세요>>");
		int n = sc.nextInt();
		//n이 홀수이면 '수'를 출력, n이 짝수이면 '박'을 출력
		for (int i = 1; i < n+1; i++) {
			if(i % 2 == 0) {
				System.out.print("박");
			}else {
				System.out.print("수");
			}
		}
		
		
	}//main end
}//class end
