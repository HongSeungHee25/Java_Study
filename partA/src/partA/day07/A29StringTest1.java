package partA.day07;

import java.util.Random;
import java.util.Scanner;

public class A29StringTest1 {

	public static void main(String[] args) {
		
		//문자열 데이터를 위한 변수 선언
		String name = "momo";
		String address = "Seoul";
		String message = "Hi~ Hello~!!";
		String message1 = "안녕!!";
		
		System.out.println("name = "+name);
		System.out.println("address = "+address);
		System.out.println("message = "+message);
		
		//Scanner sc = new Scanner(System.in);
		//System.out.println("받은 메시지 : "+message1);
		//System.out.print("메시지 입력하세요>>>");
		//message = sc.nextLine();
		//System.out.println("보낸 메시지 : "+message);
		
		System.out.println("::::String 의 핵심기능 메소드::::");
		System.out.println("1. 문자열의 길이를 구해주는 메소드 - length");	 //리턴 타입은 int타입이다
		System.out.println("message.length() = "+message.length());
		System.out.println("address.length() = "+address.length());
		System.out.println("name.length() = "+name.length());
		
		System.out.println("2. 문자열을 구성하는 문자들이 같은지 비교하는 메소드 - equals"); //리턴 타입은 boolean타입이다
		System.out.println("name.equals(\"momo\") = "+name.equals("momo")); //name이 "momo와 같은지 참 또는 거짓 리턴
		System.out.println("name.equals(\"Momo\") = "+name.equals("Momo"));
		System.out.println("address.equals(\"Seoul\") = "+address.equals("Seoul"));
		System.out.println("address.equals(\"seoul\") = "+address.equals("seoul"));
		
		System.out.println("3. 대소문자 변환 메소드 - toUpperCase, toLowerCase");
		//리턴 타입은 String타입이다
		System.out.println("name.toUpperCase() = "+name.toUpperCase());		//모든 문자들을 대문자로 변환
		System.out.println("address.toUpperCase() = "+address.toUpperCase());
		System.out.println("name.toLowerCase() = "+name.toLowerCase());		//모든 문자들을 소문자로 변환
		System.out.println("address.toLowerCase() = "+address.toLowerCase());
		
		System.out.println("4. 문자열의 특정 위치의 문자 1개를 가져오기 - charAt");
		int i = 0;	//문자열의 첫번째 문자 위치는 0으로 시작을 합니다. 위치는 index 라고 합니다.
		System.out.println("name.charAt(0) = "+name.charAt(i));	//i = 0
		i++;
		System.out.println("name.charAt(0) = "+name.charAt(i));	//i = 1
		i++;
		System.out.println("name.charAt(0) = "+name.charAt(i));	//i = 2
		i++;
		System.out.println("name.charAt(0) = "+name.charAt(i));	//i = 3
		
		
		//참고 : 아래와 같은 원시타입 age 는 메소드가 없습니다.
		//int age = 23;
		
	}

}
