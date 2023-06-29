package partD.io;

import java.io.IOException;

//바이트 기반 스트림 //표준입력 - System.in , 표준출력 - System.out 이 2개는 콘솔이라고 부르며 기본 입출력 장치입니다.
//예시 1 : 입력장치 - 콘솔 -> 프로그램 -> 출력장치 - 콘솔
public class D01StdIO {

	public static void main(String[] args) {
		System.out.println("출력할 내용을 입력하세요. ↓");
		int count = 0; 
		int b = 0;
		try {
//			while((b = System.in.read()) != -1) {	//이렇게 조건식을 쓰면 16,17번 라인을 실행하게 됨.
		while(true) {
			//read() 읽어온 데이터는 0~255 의 값. 저장만 int 타입 변수로 합니다.
			b = System.in.read();					//read() 로 입력받은 것은 변수 b에 저장합니다.
			if(b == -1) break;						//b = -1 이면 입력 종료.(EOF : End Of File)
			count++;
			//System.out.write(b);					//b를 출력합니다.
				System.out.print((char)b);			//1바이트씩만 처리한다. -멀티바이트 문자(한글과 같은 다국어문자) 인코딩 못함.
		}
		} catch (IOException e) {
			System.err.println("입출력오류 : "+e.getMessage());
		}
		System.out.println("==="+count+" 바이트 전달.===");
	}

}
/*
 * read()는 입력 메소드, write()는 출력 메소드 입니다. 
 * 실행 할때 입력한 것은 버퍼라는 메모리에 순서대로 엔터를 치면 
 * 버퍼에서 나옵니다.(출력됩니다.)
 * 한글 3바이트, 영문/기호 1바이트, 엔터 2바이트. 
 * 이클립스 : 키보드 입력종료(ctrl + z), 인텔리제이 키보드 입력종료(ctrl + d)
 * 첫번째 실행에서 ctrl + z 가 잘 동작하나 다시 실행하면 ctrl + z 동작안하는 것은 이클립스(해당버전) 오류 입니다.
 * 코드를 살짝 수정해서 다시 실행시키세요.
 */
