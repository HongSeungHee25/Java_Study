package partA.day09;

import java.util.Arrays;
import java.util.Scanner;

//String 배열
//1) String 배열이 저장하는 값은 String 객체에 대한 참조값 입니다. *중요*
//2) 
public class A35StringArray {

	public static void main(String[] args) {
		
		String[] keywords = {"continue","break","switch","for","while","static","void"};
		
		//출력
		for(int i=0; i<keywords.length;i++)	//.length = 필드 > 배열의 길이 
			System.out.println(String.format("i=%d, keywords[%d] = %s(길이 : %d)\n", 
					i,i,keywords[i],keywords[i].length())); //.length = 메소드 > 문자열의 길이
		
		
		System.out.println(Arrays.toString(keywords));
		Arrays.sort(keywords); //String 타입 배열도 정렬 가능.
		System.out.println(Arrays.toString(keywords));
		
		//데이터 저장
		Scanner sc = new Scanner(System.in);
		String[] names = new String[10];
		System.out.println(Arrays.toString(names)); //★★★★★
		int i;	//메소드 지역변수
		for(i=0; i<names.length;i++) {		//for(int i=0; ~~~) i는 for 블럭 지역변수
			System.out.print("이름을 입력하세요.(종료 : end) >>>");
			names[i] = sc.nextLine();
			//end 입력하면 for 중단.
			if(names[i].equals("end")) break;  //참조타입은 == 등가 비교가 내용비교가 아닙니다. 내용비교를 할려면 .equals 를 사용
				
			//사용자 입력을 받아 문자열 객체를 생성하고 names 배열 요소가 문자열 객체를 참조
			System.out.println(String.format("i=%d, names[%d] = %s(길이 : %d)\n",
					i,i,names[i],names[i].length()));
		}
		System.out.println("i = "+i+" 에서 for문이 종료되었습니다.");
	}

}
