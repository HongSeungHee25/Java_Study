package partA.day06;

import partA.day07.A28ChangeMoneyTest;

public class ChangeMoney {
/*
 * main메소드는 만들지 않습니다. -> MyUtility 클래스 처럼 사용하기 위한 목적입니다.
 * 환전금액 구하기 메소드 만들어 보세요.
 * 
 * 메소드 인자는 2개 : int 바꿀금액, double 환율
 * 리턴값 : double 환전된 금액. 소수점 1자리로 반올림.
 * 						
 * 일본 : 원화 <-> 엔화     wonToYen, yenToWon 메소드
 * 미국 : 원화 <-> 달러화 	 wonToDollar, dollarToWon 메소드
 */
	//엔화 -> 원화
	public static double yenToWon(int yen, double wonrateY) {
		double tempWY = Math.round(yen*wonrateY*10)/10.0;
		System.out.println("엔화 : "+yen+"¥ , 원화 : "+tempWY+"￦");
		return tempWY;
		
	}
	//달러 -> 원화
	public static double dollarToWon(int dollar, double wonrateD) {
		double tempWD = Math.round(dollar*wonrateD*10)/10.0;
		System.out.println("달러 : ＄"+dollar+" , 원화 : "+tempWD+"￦");
		return tempWD;
		
	}
	//원화 -> 엔화
	public static double wonToYen(int won, double rateY) {
		double tempY = Math.round(won/rateY*10)/10.0;
		System.out.println("원화 : "+won+"￦ , 엔화 : "+tempY+"¥");
		return tempY;
	}
	//원화 -> 달러
	public static double wonToDollar(int won, double rateD) {
		double tempD = Math.round(won/rateD*10)/10.0;
		System.out.println("원화 : "+won+"￦ , 달러 : ＄"+tempD);
		return tempD;
		
	}
/*
 * // 일본 엔화 환율 상수 private static final double JPY_RATE = 100067.40; // 미국 달러 환율
 * 상수 private static final double USD_RATE = 748.60;
 * 
 * 
 * public static double wonToYen(int won) { double yen = won / JPY_RATE; return
 * Math.round(yen * 10) / 10.0; // 소수점 첫째자리에서 반올림 }
 * 
 * public static int yenToWon(double yen) { int won = (int) (yen * JPY_RATE);
 * return won; }
 * 
 * public static double wonToDollar(int won) { double dollar = won * USD_RATE;
 * return Math.round(dollar * 10) / 10.0; // 소수점 첫째자리에서 반올림 }
 * 
 * public static int dollarToWon(double dollar) { int won = (int) (dollar /
 * USD_RATE); return won; } public static void main(String[] args) {
 * 
 * }
 */
	public static void main(String[] args) {
	}

}
