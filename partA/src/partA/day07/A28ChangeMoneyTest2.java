package partA.day07;

import java.util.Scanner;

import partA.day06.ChangeMoney;

public class A28ChangeMoneyTest2 {

	public static void main(String[] args) {
		
		int won;
		double changeYen;
		double changeDollar;
		double oneYenWon = 1000.86/100;
		double oneDollarWon = 1338.5;
		
		won = 1_000_000;
		//yen = (won / 9.84);
		//dollar = (won / 1323.38)
		
		System.out.println("========== 일본 여행 출국하기 전 ==========");		
		changeYen = ChangeMoney.wonToYen(won, oneYenWon);
		System.out.println("일본 여행의 환전 금액 = "+changeYen+" 엔 입니다.");
			
		double useYen = 75000;
		int temp = (int)(changeYen-useYen);
		System.out.println("✈️✈️✈️여행 입국 후✈️✈️✈️");
		System.out.println("여행에서 돌아왔습니다. 사용 경비는 "+useYen+"엔 , 남은 금액을 원화로 환전하세요.");
		System.out.println(temp+"엔을 원화로 환전하면 "+ChangeMoney.yenToWon(temp, oneYenWon)+" 원 입니다.");
	}
}
