package codingtest;

import java.util.Arrays;
import java.util.Collections;

//작성자 : 홍승희

// 코딩테스트 : Lv.1 문자열 내림차순으로 배치하기
public class StringDescendingOrder {
	
	public String solution(String s) {
	//문제 : 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.	
	//s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
		
	//제한 사항 : str은 길이 1 이상인 문자열입니다.
		
	//입출력 예 : s = "Zbcdefg", return = "gfedcbZ"
		
		Character[] chars = new Character[s.length()];
		for(int i = 0; i < s.length(); i++) {
			chars[i] = s.charAt(i);
		}
		Arrays.sort(chars, Collections.reverseOrder());
		
		StringBuilder sb = new StringBuilder(chars.length);
		for(char c : chars) {
			sb.append(c);
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		StringDescendingOrder solution = new StringDescendingOrder();
		String s = "Zbcdefg";
		String result = solution.solution(s);
	}
}
