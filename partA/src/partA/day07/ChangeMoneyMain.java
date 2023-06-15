package partA.day07;

import java.util.Scanner;

import partA.day06.ChangeMoney;

public class ChangeMoneyMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean status = true;
		ChangeMoney.wonToYen(0, 0);
		
		while(status) {
			System.out.println("환영합니다.환전소에 오셨습니다.");
			System.out.println("1.엔화로 환전 | 2.달러로 환전");
			System.out.print("선택해주세요>>");
			int num = sc.nextInt();
			
			if(num == 1)
				System.out.print("얼마환전 하시겠습니까??");
				
		
		}	
	}
}
