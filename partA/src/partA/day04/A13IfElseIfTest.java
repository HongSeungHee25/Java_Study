package partA.day04;

import java.util.Scanner;

public class A13IfElseIfTest {
//if~else if~else if~....
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int menu;

		System.out.println(":::: 쇼핑몰 사용자 마이페이지 ::::");
		System.out.println("1:장바구니 2:찜 상품 3:배송 조회 4:구매 목록 5:종료");
		System.out.print("선택해주세요 >>>>");
		
		menu = sc.nextInt();
		
		//동일한 값인지 비교 : 관계연산자 == 또는 !=
		if(menu == 1) {
			System.out.println("👜장바구니 입니다.👜");
		}else if(menu == 2) {
			System.out.println("♥️찜 상품 입니다.♥️");
		}else if(menu == 3) {
			System.out.println("🎁배송 조회입니다.🎁");
		}else if(menu == 4) {
			System.out.println("💸구매 목록입니다.💸");
		}else if(menu == 5) {
			System.out.println("🔚프로그램이 종료됩니다.🔚");
		}else {
			System.out.println("😢잘못된 선택입니다.😢");
		}
		System.out.println("메뉴 선택 종료합니다.");
		
		
		Scanner sc1 = new Scanner(System.in);
		int ASCII;
		
		System.out.println(":::: 아스키코드값으로 문자 종류 출력하기 ::::");
		System.out.print("아스키코드 정수값(0~127)을 입력해주세요>>>");
		ASCII = sc1.nextInt();
		
		//0~127 일때만 실행되도록 if문을 중첩시킵니다.
		if(ASCII >= 0 && ASCII < 128) {
			
			if(ASCII >= 65 && ASCII <= 97) {
				char ch = (char) ASCII;
				System.out.println("대문자 입니다.선택하신 정수값의 아스키 코드는 "+ch+"입니다.");
			}else if(ASCII >= 97 && ASCII <= 122) {
				char ch = (char) ASCII;
				System.out.println("소문자 입니다.선택하신 정수값의 아스키 코드는 "+ch+"입니다.");
			}else if(ASCII >= 48 && ASCII <= 57) {
				char ch = (char) ASCII;
				System.out.println("숫자 입니다.선택하신 정수값의 아스키 코드는 "+ch+"입니다.");
			}else {
				char ch = (char) ASCII;
				System.out.println("특수문자 입니다.선택하신 정수값의 아스키 코드는 "+ch+"입니다.");
			}
			
		}else {
			System.out.println("아스키코드값 범위는 0~127 입니다.");
			//보통은 프로그램 안에서 다시 입력 받거나 이 후에 코드는 실행하지 않게 하거나 등등의 방법으로 처리합니다.
		}
	}
	
	

	}


