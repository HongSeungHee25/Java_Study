package partA.day11;

import java.util.Arrays;
//수업 11일차 개인 테스트
public class MyArrayUtility {

	public static void main(String[] args) {
		
		int[] numbers = {56,45,77,34,89,23,90};
		
		int k=3; int value=999;
		System.out.println("1. 지정된 인덱스와 값으로 데이터 중간 삽입 결과");
		dataAdd(numbers,k,value);
		System.out.println(Arrays.toString(numbers));
		
		k=2;
		System.out.println("2. 지정된 인덱스로 데이터 제거 결과");
		dataRemove(numbers,k);
		System.out.println(Arrays.toString(numbers));

		k=3;
		System.out.println("3. 지정된 인덱스로 데이터 제거 결과");
		dataRemove(numbers,k);
		System.out.println(Arrays.toString(numbers));
		
		System.out.println("4. 지정된 인덱스와 값으로 데이터 중간 삽입 결과");
		k=4; value=99;
		dataAdd(numbers,k,value);
		System.out.println(Arrays.toString(numbers));
	
		System.out.println("5. 지정된 인덱스와 값으로 데이터 중간 삽입 결과");
		k=3; value=9999;
		dataAdd(numbers,k,value);
		System.out.println(Arrays.toString(numbers));
	}

	private static void dataRemove(int[] numbers, int k) {
		for(int i=k;i<numbers.length-1;i++) {
			numbers[i]=numbers[i+1];
		}
		numbers[numbers.length-1]=0;
	}
	private static void dataAdd(int[] numbers, int k, int value) {
		for(int i=numbers.length-1;i>3;i--) {
			numbers[i]=numbers[i-1];
		}
		numbers[k]=value;
		
	}

}
