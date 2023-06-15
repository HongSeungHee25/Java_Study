package map;

public class Subway {
	//부모클래스 지하철 인스턴스 필드 생성
	static int subwayLine;		//지하철 노선
	static String subwayStation; //지하철 역
	
	
	
	public static int getSubwayLine() {
		return subwayLine;
	}
	public static void setSubwayLine(int subwayLine) {
		Subway.subwayLine = subwayLine;
	}
	public static String getSubwayStation() {
		return subwayStation;
	}
	public static void setSubwayStation(String subwayStation) {
		Subway.subwayStation = subwayStation;
	}
	
	@Override
	public String toString() {
		return String.format("지하철 노선 : %d 호선 , 지하철 역 : %s", subwayLine,subwayStation);
	}
	public void search() {
		
	}
	
}
