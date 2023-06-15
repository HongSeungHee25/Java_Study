package javavoca;

public class JavaVoca {
	
	//---필드 선언부---//		private로 선언하세요
	//영어 단어 english
	private String english;
	//의미 , 뜻 korean
	private String korean;
	//레벨 level (Beginner , Intermediate  , Advanced  중 하나의 문자열만 저장하기)
	private String level;
	//---생성자---//
	public JavaVoca(String english, String korean, String level) {
		this.english = english;
		this.korean = korean;
		this.level = level;
	}
	//---인스턴스필드---//
	//toString() 재정의		단어장 입/출력시 형식
	@Override
	public String toString() {
		return english+"\t"+korean+"\t"+level;
	}
	//getter, setter
	//단, setLevel(String Level)은 인자로 "1","2","3"을 받아 그에 맞는 문자열로 필드값 저장하기
	public String getEnglish() {
		return english;
	}
	public void setEnglish(String english) {
		this.english = english;
	}
	public String getKorean() {
		return korean;
	}
	public void setKorean(String korean) {
		this.korean = korean;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = switch (level) {
		case "1" -> "Beginner";
		case "2" -> "Intermediate";
		case "3" -> "Advanced";
		default -> throw new IllegalArgumentException("Unexpected (value = 1 or 2 or 3) : " + level);
		};
		
		}
	}