package partA.day07;

import java.util.Scanner;

import partA.day06.ChangeMoney;

public class A28ChangeMoneyTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean status = true;
		double rateY = 10.02; //엔화 환전율 -> 04.27일 기준
		double rateD = 1339.00;	//달러 환전율 -> 04.27일 기준
		double won; //환전금액 계산 변수
		int money;	//환전할 금액 사용자에게 입력받기
		int yen;	//남은 엔화 사용자에게 입력받기
		int dollar; //남은 달러 사용자에게 입력받기
		
		while(status) {
			System.out.println("환영합니다.환전소에 오셨습니다.");
			System.out.println("1.여행가기 전 환전하기 | 2.여행 끝 남은 돈 환전하기 | 3.종료");
			System.out.print("선택해주세요>>");
			int num = sc.nextInt();
			
			switch(num) {
			case 1:
				System.out.println("1.엔화로 환전 | 2.달러로 환전 ");
				System.out.print("선택해주세요>>");
				int num2 = sc.nextInt();	//원화 -> 엔화,달러
				if(num2 == 1) {
					System.out.print("일본 여행을 가시는군요:) 환전금액을 입력해주세요>>");
					money = sc.nextInt();
					won = ChangeMoney.wonToYen(money, rateY);
					System.out.println("원화 "+money+"원 엔화로 환전 금액은 "+won+"엔 입니다.\n");
				}else {
					System.out.print("미국 여행을 가시는군요:) 환전금액을 입력해주세요>>");
					money = sc.nextInt();
					won = ChangeMoney.wonToDollar(money, rateD);
					System.out.println("원화 "+money+"원 달러로 환전 금액은 "+won+"달러 입니다.\n");
					}break;
					
			case 2:
				System.out.println("1.엔화를 원화로 환전 | 2.달러를 원화로 환전 ");
				System.out.print("선택해주세요>>");
				int num3 = sc.nextInt();	//엔화,달러 -> 원화로 환전
				if(num3 == 1) {
					System.out.print("즐거운 여행되셨나요??남은 엔화를 입력해주세요>>");
					yen = sc.nextInt();
					won = ChangeMoney.yenToWon(yen, rateY);
					System.out.println(yen+"엔을 원화로 환전 금액은 "+won+"원 입니다.\n");
				}else {
					System.out.print("즐거운 여행되셨나요??남은 달러를 입력해주세요>>");
					dollar = sc.nextInt();
					won = ChangeMoney.dollarToWon(dollar, rateD);
					System.out.println(dollar+"달러를 원화로 환전 금액은 "+won+"원 입니다.\n");
				}
				break;
			case 3:
				System.out.println("환전이 완료되었습니다. 즐거운 여행되세요😊");
				System.out.println("프로그램 종료합니다.");
				status = false;
				break;
			}
		}
	}
}
