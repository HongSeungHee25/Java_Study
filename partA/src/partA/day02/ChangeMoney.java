package partA.day02;

public class ChangeMoney {

	public static void main(String[] args) {
		
		//과제 
		//여행을 가려면 환전을 해야합니다.
		//일본 : 원화 -> 엔화  wonToYen , yenToWon
		//미국 : 원화 -> 달러화 wonToDollar, dollarToWon
		
		//원화 환전 기본 금액(4월20일 기준)
		double KRW_JP;
		double KRW_USA;
		KRW_JP = 9.84;
		KRW_USA = 1323.28;
		
		//일본,미국 환전 
		int JPmoney;
		int USAmoney;
		JPmoney = 100000; //원화 환전 금액
		USAmoney = 100000; //원화 환전 금액
		
		//엔화,달러 원화로 환전(4월20일 기준)
		int japan = (int)(JPmoney / KRW_JP);
		int USA = (int)(USAmoney / KRW_USA);
		System.out.println("::: 원화 10만원 환전 :::");
		System.out.println("일본여행 가기전 엔화 환전 금액은 : "+japan+"엔화");
		System.out.println("미국여행 가기전 달러 환전 금액은 : "+USA+"달러\n");
		
		//여행에서 돌아왔습니다. 남은돈은 원화로 환전
		//엔화 -> 원화, 달러화 -> 원화
		int JPleftmoney = 5062; //엔화 남은돈 
		int USAleftmoney = 25; //달러 남은돈
		
		//엔화와 달러에서 원화로 환전(4월20일 기준)
		double KR1 = 9.82;
		double KR2 = 1321.58;
		
		double JPch1 = JPleftmoney * KR1;
		double USAch1 = USAleftmoney * KR2;
		System.out.println("::: 여행 후 남은 금액 엔화 5062엔, 달러 25달러 :::");
		System.out.println("일본여행 돌아온 후 남은금액 원화로 환전 금액은 : "+JPch1+"원");
		System.out.println("미국여행 돌아온 후 남은금액 원화로 환전 금액은 : "+USAch1+"원");
		
	}

}
