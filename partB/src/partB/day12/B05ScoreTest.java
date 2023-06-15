package partB.day12;

import java.util.Scanner;

public class B05ScoreTest {
	
	public static void main(String[] args) {
		//Score 객체를 생성하고 
		//각 필드의 값을 키보드로 입력받아 저장하기
		//총점, 평균(소수점 2자리) 구하기
		//모든 필드값, 총점, 평균 출력하기
		
		//인스턴스 필드와 인스턴스 메소드는 객체를 생성해야 사용할 수 있습니다.
		Score Sco = new Score();
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력해주세요>>");
		Sco.setname(sc.next());
		System.out.print("국어점수를 입력해주세요>>");
		Sco.setkorea(sc.nextInt());
		System.out.print("영어점수를 입력해주세요>>");
		Sco.setenglish(sc.nextInt());
		System.out.print("과학점수를 입력해주세요>>");
		Sco.setsciense(sc.nextInt());
		System.out.println("::: "+Sco.getname()+"님에 시험점수 통계 :::");
		System.out.println(Sco.member());
		
	}
}
