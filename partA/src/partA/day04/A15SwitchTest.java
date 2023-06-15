package partA.day04;

import java.util.Scanner;

//switch 는 if 조건식이 equal (==) 을 여러번 검사하는 경우에 사용.
//조건식에서 검사하는 값은 정수 (byte,short,int,long),char, 문자열 형식만 가능합니다.

public class A15SwitchTest {

	public static void main(String[] args) {
		
		int menu = 3;
		
		switch(menu) {
		case 1:    //menu == 1 ?
			System.out.println("👜장바구니👜");
			break; //아래의 명령어들을 실행하지 않고 switch{..}를 끝냅니다.
		case 2:    //menu == 2 ?
			System.out.println("♥️찜 상품♥️");
			break;
		case 3:    //menu == 3 ?
			System.out.println("🚚🚚배송 조회🚚🚚");
			break;
		case 4:    //menu == 4 ?
			System.out.println("💸구매 목록💸");
			break;
		case 5:    //menu == 4 ?
			System.out.println("🔚프로그램 종료🔚");
			break;
			
			default://값이 1,2,3,4,5 모두 아닌경우
				System.out.println("😢잘못된 선택입니다.😢");
				break;
		}	//switch 끝
	}	//main 끝

}	//class 끝
