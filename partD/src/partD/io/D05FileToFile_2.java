package partD.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//바이트 기반 스트림  //
//예시 4: 입력장치- 파일 => 프로그램 =>  출력장치 - 파일
public class D05FileToFile_2 {
 //byte 배열을 프로그램 버퍼로 사용할 것인가? 선택해서 하세요
 
 public static void main(String[] args) {
    
    int count = 0;
    
    try (
       //파일 입력 스트림(입력 장치)   
       InputStream fin = new FileInputStream("C:/IOExam/dog.png"); //복사할 파일
       //파일 출력 스트림(출력 장치)   
        OutputStream fout = new FileOutputStream("C:/IOExam/dog_copy2.png"); //복사 후 생성할 파일
    ){
       int b;
       while ((b = fin.read()) != -1){
          count++;
          fout.write(b);
       }
       
    }catch (IOException e) {
          System.out.println("입출력 오류 : " + e.getMessage());
      }
        System.out.println(count + " 바이트 파일 복사 완료.");
    
    
 }//main

}//class
