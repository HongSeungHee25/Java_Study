package map;

public class Line extends Subway{
	
	static int line;
	static String name;
	
	public static int getLine() {
		return line;
	}

	public static void setLine(int line) {
		Line.line = line;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Line.name = name;
	}

	public Line() {}
	
	public Line(int subwayLine, String subwayStation) {
		super.subwayLine = subwayLine;
		super.subwayStation = subwayStation;
	}
	
}
