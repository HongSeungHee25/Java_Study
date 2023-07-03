package partD.io;


//open api 로 받은 응답데이터 json 형식에 대한 데이터 저장 클래스 정의
//json 형식 : open api 로 제공되는 데이터를 표현하는 형식 중 하나. 가장 간단한 문자열 형식.
//			json 은 문자열이므로 이 것을 자바 클래스로 변환하는 과정이 필요함. gson 라이브러리 사용.
public class CurrencyRate {

	private int result;
	private String cur_unit;
	private String cur_nm;
	private String ttb;
	private String tts;
	
	
	//생성자
	public CurrencyRate(int result, String cur_unit, String cur_nm, String ttb, String tts) {
		this.result = result;
		this.cur_unit = cur_unit;
		this.cur_nm = cur_nm;
		this.ttb = ttb;
		this.tts = tts;
	}
	//toString 재정의
	@Override
	public String toString() {
		return "CurrencyRate{        \n" +
                "result=" + result +  "\n" +
                ", cur_unit='" + cur_unit + "\'\n" +
                ", cur_nm='" + cur_nm + "\'\n" +
                ", ttb='" + ttb + "\'\n" +
                ", tts='" + tts + "\'\n" +
                "}";
	}
	
}
