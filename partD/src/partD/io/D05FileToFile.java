package partD.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//바이트 기반 스트림 //표준입력 - System.in , 표준출력 - System.out 이 2개는 콘솔이라고 부르며 기본 입출력 장치입니다.
//예시 3 : 입력장치 - 콘솔 -> 프로그램 -> 출력장치 - 파일
public class D05FileToFile {

	public static void main(String[] args) {
		//byte 배열을 프로그램 버퍼로 사용할 것인가? 선택해서 하시오.
		
		int rByte = 0;
		int count = 0;
		
		try (
				//파일 입력 스트림(입력장치)
				InputStream fin = new FileInputStream("C:/IOExam/dog.png");		//복사하고 싶은 파일
				//파일 출력 스트림(출력장치)
				OutputStream fout = new FileOutputStream("C:/IOExam/dog_copy.png");	//복사해서 생성될 파일
				){
			while(true) {
				byte[] buf = new byte[20];
				rByte = fin.read(buf);		//파일 읽어오는거
				fout.write(buf);			//파일 복사하는거(이 클래스에서)
				if(rByte == -1) break;		//파일입력이므로 파일의 끝 EOF 일때 read() 리턴은 -1(종료지점)
				count+=rByte;		
			}
		} catch (IOException e) {
			System.err.println("입출력 오류 : "+e.getMessage());
		}
		System.out.println(count+" 바이트 읽음.");
		
	}

}
