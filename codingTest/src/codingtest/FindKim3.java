package codingtest;

import java.util.Arrays;

public class FindKim3 {

	public static void main(String[] args) {

		/*
		 * String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아, 
		 * "김서방은 x에 있다"는 String을 반환하는 함수, solution을 완성하세요. 
		 * seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.
		 */
		
		/*
		 * 제한 사항
		 * - seoul은 길이 1 이상, 1000 이하인 배열입니다.
		 * - seoul은 원소 길이 1 이상, 1000 이하인 배열입니다.
		 * - "Kim"은 반드시 seoul 안에 포함되어 있습니다.
		 */
		
		 String[] seoul = new String[10];
		 
		 int result = 0;
		 
		 int index = Arrays.asList(seoul).indexOf("Kim");
	        if (index != -1) {
	            result = index;
	        }
	     String answer = "김서방은 " + result + "에 있다";

		
		
		
		
		//String형 배열 seoul의 element(원소) 중
		
		//kim의 인덱스 번호를 반환 (답)
		//1. for문을 돌린다
		
		//1 + 2 를 해서 정답을 "1+2는 3이다"
		//1+2=2
		
		
		
		//- seoul은 원소 길이 1 이상, 20 이하인 배열입니다.
		
		
		//"Kim"의 위치 x를 찾아, "김서방은 x에 있다"는 String을 반환
		//단, seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.
		
		
		
		
		
	}
}
