package partD.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

public class D11OpenAPIServerice_imp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String authkey="AluENEwBXPhUPGfCO8dy3cfaqFJD8yb9";         //open api 사용을 위한 인증키-사이트에서 신청
        String searchdate ="20230630";                        //검색날짜
//        int page=1;
        String file="C:/temp/apiJson.txt";                     //전송받은 데이터를 저장할 파일
//http 프로토콜을 이용하여 서버에 연결하기 위한 자바 클래스 입니다.
        HttpURLConnection connection=null;
//StringBuilder 는 문자열 추가할 때 효율성/편의성을 위해서 사용합니다.
        StringBuilder url = new StringBuilder("https://www.koreaexim.go.kr/site/program/financial/exchangeJSON");   
        //open api 서버 주소
        try {
            url.append("?authkey=").append(authkey)            //파라미터 추가. 인증키
                    .append("&searchdate=").append(searchdate)      //        검색날짜
                    .append("&data=AP01");                     //       형식
            URL fullURL = new URL(url.toString());               
            			//최종 url 문자열로 URL(서버에게 보내는 요청 내용) 객체 생성
            connection = (HttpsURLConnection) fullURL.openConnection();         //URL 객체 주소로 연결 요청
            connection.setRequestMethod("GET");                  // 요청 방식 (기본 : GET)
        }catch (IOException e) {
            e.printStackTrace();
        }
      //https://www.koreaexim.go.kr/ir/HPHKIR020M01?apino=2&viewtype=O#tab1
      //https://www.koreaexim.go.kr/ir/HPHKIR020M01?apino=2&viewtype=C&searchselect=&searchword=
      //AluENEwBXPhUPGfCO8dy3cfaqFJD8yb9
      //project structure 에서 gson 라이브러리 추가 .
      //downloads : https://repo1.maven.org/maven2/com/google/code/gson/gson/
      //doc : https://www.javadoc.io/doc/com.google.code.gson/gson/latest/com.google.gson/module-summary.html
		
        String line = null;
        String jsonStr = null;
        try (
        		//HttpURLConnection 객체를 통해 문자기반 입력 스트림 생성하기
        		InputStreamReader ir = new InputStreamReader(connection.getInputStream());
        		//문자기반 파일 출력 스트림
        		PrintWriter pw = new PrintWriter(new File(file));		//자동 flush 기능이 있는 메소드 사용.
        		//문자기반 입출력 보조 스트림
        		BufferedWriter bw = new BufferedWriter(pw);
        		BufferedReader br = new BufferedReader(ir);
        		){
        	while((line = br.readLine())!= null) {		//문자 기반 스트림에는 line 단위로 읽는 메소드가 있습니다.
        		//줄 단위로 읽기. 여기서는 데이터가 1개 라인에 모두 저장하여 사실은 반복문 필요없음.
        		jsonStr = line;
        	}
        	System.out.println("-------------------- HttpsURLConnection 으로 읽어온 응답 문자열 ----------------------");
        	System.out.println(jsonStr);		//콘솔 출력
        	bw.write(jsonStr);					//파일 출력
			bw.flush();		//버퍼를 사용하는 출력일 때는 필요함.	pw 가 flush 기능이 있으므로 여기서는 생략가능.
		} catch (IOException e) {
			e.printStackTrace();
		}
        System.out.println(jsonTolist(jsonStr).size());
        					//문자열을 자바 리스트로 변환하는 메소드 - 개발자 정의
        
	}//main end

	private static List<CurrencyRate> jsonTolist(String jsonStr) {
		//문자열을 자바 리스트로 변환하기 위해 gson 라이브러리 사용
		Gson gson = new Gson();
		List<CurrencyRate> list =
				gson.fromJson(jsonStr, new TypeToken<List<CurrencyRate>>(){}.getType());
		//TypeToken 는 List 등 컬렉션으로 변경할 때 사용합니다.
		
		System.out.println("-------------------- jsonToList 출력 ---------------------");
		for(CurrencyRate temp : list) {
			System.out.println(temp);
		}
		System.out.println("-----------------------------------------------------------");
		return list;
	}

}
