package partA.day08;

import java.util.Scanner;

public class A33StringSearch {

	public static void main(String[] args) {

		String lyrics = "다른 문을 열어 따라갈 필요는 없어\r\n"
				+ "넌 너의 길로, 난 나의 길로 음\r\n"
				+ "하루하루마다 색이 달라진 느낌\r\n"
				+ "밝게 빛이 나는 길을 찾아\r\n"
				+ "I'm on my way\r\n"
				+ "넌 그냥 믿으면 돼\r\n"
				+ "I'm on my way\r\n"
				+ "보이는 그대로야\r\n"
				+ "너는 누군가의 dreams come true\r\n"
				+ "제일 좋은 어느 날의 데자뷰\r\n"
				+ "머물고픈 어딘가의 낯선 뷰\r\n"
				+ "I'll be far away\r\n"
				+ "That's my\r\n"
				+ "Life is 아름다운 갤럭시\r\n"
				+ "Be a writer 장르로는 판타지\r\n"
				+ "내일 내게 열리는 건 big, big 스테이지\r\n"
				+ "So that is who I am\r\n"
				+ "Look at me, look at me\r\n"
				+ "Look at me now";
		
		//lyrics = "****korABcd**korSecurity   kor!!! korea";
		String find = "way";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("찾을 문자열 입력하세요 >>>");
		find = sc.nextLine();
		//find = "\r\n";
		int count = 0;	//찾은 횟수
		int index, fromIndex = 0; //찾은 위치 = index , lyrics 의 찾기 시작할 위치의 인덱스 = fromIndex
		//status 는 while 반복을 제어하는 변수 초기값은 true
		boolean status = true; //while문을 위한 변수

		//반복문 시작
		while(status) {
			//lyrics 문자열에서 find("way")를 찾기.
			//fromIndex는 lyrics의 몇번째부터 찾을 것인가를 나타내며 초기값은 0
			index = lyrics.indexOf(find, fromIndex); //indexOf가 찾는것 -> fromIndex에 초기값을 0으로 줬기때문에 처음부터 find를 찾음을 나타냄
			System.out.println("fromIndex = "+fromIndex+", index = "+index);
			System.out.println("텍스트 출력 : "+index);
			//조건문 시작
			if(index != -1) { //indexOf()메소드 결과값이 -1 일때는 
				count++;
				fromIndex = index + find.length();
			}else {
				status = false;
			}
		}//while
		
		System.out.println(find+" 문자열을 총 "+count+"회 찾았습니다.");
	}//main

}//class
