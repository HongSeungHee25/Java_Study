package partD.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
 
//FileOutputStream 클래스는 출력 스트림 OutputStream 의 자식 클래스입니다.
//바이트 기반 스트림 //표준입력 - System.in , 표준출력 - System.out 이 2개는 콘솔이라고 부르며 기본 입출력 장치입니다.
//예시 1 : 입력장치 - 콘솔 -> 프로그램 -> 출력장치 - 파일
public class D02FileOutPutStream {

	public static void main(String[] args) {
		int count = 0;
		int b;
		System.out.println("파일에 저장할 내용을 입력하세요. ↓");
		OutputStream fo = null;
		try {
			fo = new FileOutputStream("C:/IOExam/d02.txt");		
			//출력장치 파일시스템은 경로와 파일명으로 객체 생성 
			while((b = System.in.read()) != -1) {
				count++;
				fo.write(b);
			}
		} catch (IOException e) {
			System.err.println("입출력 오류 : "+e.getMessage());
		}
//		}finally {
//			if(fo != null) {
//				try {
//					fo.close();		//파일 출력 장치에 대한 close 꼭 필요. - 지금은 없어도 정상동작 하지만 파일 입력 등 다른 실행과
//									//동시에 일어날때는 실행에 오류가 생길 수 있습니다.
//				} catch (IOException e2) {
//				}
//			}
//		}
		System.out.println(count + " 바이트 파일에 저장.");
		
	}

}
