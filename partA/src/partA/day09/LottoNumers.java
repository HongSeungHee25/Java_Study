package partA.day09;

import java.util.Random;

public class LottoNumers {

	public static void main(String[] args) {
		
		int[] lottoNumbers = new int[6];	//로또 번호를 저장할 배열 생성
		Random random = new Random();		//난수 생성을 위한 Random 객체 생성
		int i = 0;		//인덱스 변수 i 초기화
		
		while (i<6) {	//인덱스 변수 i가 6이 될 때까지 반복
			int randomNumber = random.nextInt(45)+1;	//1~45 범위의 난수 생성
			
			for(int j = 0; j < i; j++) {	//lottoNumbers 배열에 있는 숫자인지 확인
				if(lottoNumbers[j] == randomNumber) {
					randomNumber = -1;	//lottoNumbers 배열에 있는 숫자일 경우 -1로 초기화
					break;				//중복된 숫자가 있으므로 더 이상 비교할 필요 없음
				}
			}
			if(randomNumber != -1) {	//lottoNumbers 배열에 없는 숫자일 경우
				lottoNumbers[i] = randomNumber;	//lottoNumbers 배여에 저장
				i++;			//다음 요소에 저장하기 위해 인덱스 변수 i 증가
			}
		}
		//로또 번호 출력
		System.out.print("로또 번호 : ");
		for(int number : lottoNumbers) {
			System.out.print(number + " " );
		}
			
	}

}
