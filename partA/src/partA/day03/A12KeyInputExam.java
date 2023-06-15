package partA.day03;

import java.util.Scanner;

//A10 번 클래스를 age, point 를 키보드 입력 받아 업데이트 하세요.
public class A12KeyInputExam {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int age;

		System.out.print("나이를 입력 해주세요>>");
		age = sc.nextInt();
		
		boolean isAdult = false;	
		
		System.out.println("조건식 미리 확인 : "+(age >= 20));
		if(age >= 20) {	
			isAdult = true;	
		}
		System.out.println("isAdult : "+isAdult);
		
		sc.close();
		
		Scanner sc1 = new Scanner(System.in);
		int point;		
		System.out.print("포인트를 입력해주세요>>");
		point = sc1.nextInt();
							
		if(point >= 70) {
			System.out.println("VIP 회원입니다.");
			point += 100;
		}else {		
			System.out.println("일반 회원입니다.");
			point += 50;
		}System.out.println("고객님의 최종 포인트는 "+point +"입니다.");
		
		sc1.close();
	}

}
