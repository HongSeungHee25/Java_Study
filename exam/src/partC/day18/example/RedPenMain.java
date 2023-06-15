package partC.day18.example;

import java.util.*;

//05.16 보충 강의
public class RedPenMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int problemNum;
		int score;

		System.out.println("초등학교 2학년을 위한 2자리 사칙연산 문제 프로그램 빨간펜 입니다.");
		System.out.println("-----------------------------");
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("-----------------------------");
		System.out.print("풀 문제 개수를 정해주세요 >>> ");
		problemNum = sc.nextInt();

		RedPen[] redPens = new RedPen[problemNum]; // RedPen 객체를 담을 배열
		int[] myAnswers = new int[problemNum]; // 입력한 답을 담을 배열
		int[] correctAnswers = new int[problemNum]; // RedPen의 answer()메소드로 구한 답을 담을 배열


		
		
		for (int i = 0; i <problemNum; i++) {	// 배열의 길이 (풀 문제 수)만큼 반복하는 for문
				// RedPen 객체 생성하여 redPens 배열에 넣기
			redPens[i] = new RedPen('+');
				// 배열이 참조하는 객체의 make() 메소드 호출
			redPens[i].make();
				// 배열이 참조하는 객체의 answer() 메소드를 호출하여 리턴값을 correctAnswers[] 배열에 담기
			correctAnswers[i] =redPens[i].answer();
			System.out.print("문제" + (i + 1) + ". " + redPens[i].getN1() + " " + redPens[i].getOp() + " "
					+ redPens[i].getN2() + "= 답 입력 => ");	// 실행 예시 출력문 (ex : 문제1. 10 + 20 = 답 입력 =>)
			
			myAnswers[i] = sc.nextInt();	// Scanner 객체로 int 값 입력하고, 입력한 값은 myAnswer 배열에 저장

			if (correctAnswers[i] == myAnswers[i]) {	// 입력한 값 담은 배열과, answer()메소드로 계산된 값이 담긴 배열 비교해서
					// 같으면 객체의 isCorrect필드를 true로 만들어주기 (setter 사용)
				cnt++;	// 같으면 답이 맞은 것이니 cnt 값 증가
			}	// if
		}	// for
		System.out.println("-----------------------------");

		score = (int) (Math.ceil(100 / problemNum) * cnt);	// 점수는 100점 만점 기준 한 문제 점수는 (총점/문제수), (한 문제 점수*맞은 문제수cnt)
		System.out.println("채점합니다. 맞은 갯수 " + cnt + "(" + score + "점)");	

		System.out.println(":::틀린 문제 정답보기:::");
		
		// 틀린 문제 출력할 반복문
		for (int i = 0; i < problemNum; i++) {
			if (!redPens[i].isCorrect()) {	// 배열에 들어있는 객체의 isCorrect 필드값이 false 인경우 실행되어야함
												// isCorrect값은 false여야하지만 if()안에는 true여야 조건문이 실행되기 때문에
												// 앞에 ! 붙이기 (isCorrect값이 false면 if는 true가 되어 실행되게끔)
				System.out.println("문제" + (i + 1) + ". " + redPens[i].getN1() + " " + redPens[i].getOp() + " "
						+ redPens[i].getN2() + " = " + correctAnswers[i]);
				// 화면에 보이는 출력문. 정답은 answer()메소드 사용해도 되지만 윗for문을 돌리면서 이미 저장된 값 사용
			} // if

		} // for

	}// main
}
