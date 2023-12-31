package partA.day07;

import java.util.Scanner;

public class A30StringTest2 {
	
	//A29 클래스에서 연습한 String 메소드 활용해 보기
	public static void main(String[] args) {
		//1. 프로그램 사용자에게 메세지 입력받아서 
		Scanner sc = new Scanner(System.in);
		System.out.print("보낼 메시지를 입력해주세요>>");
		String message = sc.nextLine();	
		//2. 총 길이를 알려주고, 
		System.out.println("당신이 입력한 메시지의 문자 갯수는 "+message.length()+"개 입니다.");
		//3. 대문자, 문자, 숫자 각각 포함된 갯수를 알려주기
		int numericCount = 0;
		int upperCaseCount = 0;
		int lowerCaseCount = 0;
		int StringNumber = 0;
		int symbol = 0;
		//3-1. 먼저 for문으로 문자를 1개씩 가져오기.반복횟수는 message 문자열의 길이
		for(int i = 0; i < message.length(); i++){
			char temp = message.charAt(i);		//마지막 i값은 message.length()-1
			System.out.print(temp);
			if(isUpperCase(temp))upperCaseCount++;
			if(isLowerCase(temp))lowerCaseCount++;
			if(isNumeric(temp))numericCount++;
			if(isHangul(temp))StringNumber++;
			if(isSymbol(temp))symbol++;
		}
		System.out.println("\n당신의 메시지는 한글 문자 "+StringNumber+"개, ");
		System.out.println("당신의 메시지는 대문자 "+upperCaseCount+"개, ");
		System.out.println("당신의 메시지는 소문자 "+lowerCaseCount+"개, ");
		System.out.println("당신의 메시지는 특수문자 "+symbol+"개, ");
		System.out.println("당신의 메시지는 숫자 "+numericCount+"개 입니다.");
		
	}

	private static boolean isSymbol(char temp) { //temp 가 특수문자일때 '참', 그렇지 않으면 거짓 리턴
		return temp >= 32 && temp <= 47 || temp >= 58 && temp <= 64 || temp >= 123 && temp <= 126;
	}

	private static boolean isHangul(char temp) { //temp 가 한글일때 '참', 그렇지 않으면 거짓 리턴
		return temp >= 44032 && temp <= 55203;
	}

	private static boolean isNumeric(char temp) { //temp 가 숫자일때 '참', 그렇지 않으면 거짓 리턴
		return temp >= 48 && temp <= 57;
	}

	private static boolean isLowerCase(char temp) { //temp 가 소문자일때 '참', 그렇지 않으면 거짓 리턴
		return temp >= 'a' && temp <= 'z';
	}

	private static boolean isUpperCase(char temp) { //temp 가 대문자일때 '참', 그렇지 않으면 거짓 리턴
		return temp >= 'A' && temp <= 'Z';
	}
	//한글은 '가' ~ '힣' => isHangul
	//특수문자 ' ' ~ '/' 또는 ':' ~ '@' 또는 '[' ~ '`' 또는 '{' ~ '~' => isSymbol

}
