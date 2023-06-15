package codingtest;

import java.util.Scanner;

//작성자 : 홍승희

//코딩 테스트 : Lv.1 핸드폰 번호 가리기 - 정답률 84%
public class HidePhoneNumber {

	public static void main(String[] args) {

		/*
		 * 프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
		 * 전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를
		 * 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.
		 * 
		 * 
		 * 제한 조건
		 * phone_number는 길이 4 이상, 20이하인 문자열입니다.
		 * 
		 */
		
		//String 타입으로 '핸드폰번호' 를 제시
		//맨 뒷 4자리를 빼고 전부 '*'로 표시
		
		Scanner sc = new Scanner(System.in);
		System.out.println("[문제 Lv.1 : 핸드폰 번호 가리기 (정답률 84%)]");
		System.out.print("이름을 입력해주세요 >> ");
		String name = sc.nextLine();
		System.out.print("핸드폰 번호를 입력해주세요 >> ");
		String phNum = sc.nextLine();
		
		//	원하는 답 >>	*********5678
		String result = "";
		//1) 맨 뒤 4자리를 제외하고 *로 채운다	
			//동일한 자릿수의 *을 출력한다. ex) 010-1234-5678 >> 13자리 / * X 13 출력
		//2) 맨 뒤 4자리를 원래 잇는 숫자로 바꾼다.
		
		
		for (int i = 0; i < phNum.length()-4; i++) {
			//동일한 자릿수의 *을 출력한다. ex) 010-1234-5678 >> 13자리 / * X 13 출력
			result += "*";
		}
		System.out.println(result);//'*'이 9개
		
		//맨 뒤 4자리를 원래 있는 숫자로 바꾼다.
		for (int i = phNum.length()-4; i < phNum.length(); i++) {
			result += phNum.charAt(i);
		}
		System.out.println(name+"님의 핸드폰 번호 : "+result+" 입니다. \n감사합니다.");
		
		
		
	}

}
