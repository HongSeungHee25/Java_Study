package voca;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

//단어장의 기능을 정의한 인터페이스 사용하기 - 자바 단어장 클래스로 구현.
public class JavaVocaNote implements VocaNoteBook{

	//파일에서 읽어온 데이터를 저장할 자료구조 필요합니다.
	private Map<String, JavaVoca> voca; 	//String 은 영어단어, JavaVoca 객체(영어단어, 한글뜻, 레벨)
	
	public JavaVocaNote() {
		voca = new TreeMap<>(); 	//데이터 저장할 map 객체 생성
	}

	@Override
	public Map<String, JavaVoca> getVoca() {	//voca 필드의 getter
		return voca;
	}

	@Override
	public void load(String path) {		//파일에서 단어들 불러오기
		File file = new File(path);
		Scanner fsc = null;
		try {
			fsc = new Scanner(file);
			while(fsc.hasNext()) {
				String temp = fsc.nextLine();
				System.out.println(temp);
				//public 		공공의,공적인,대중 		Beginner
				//읽어온 문자열로 JavaVoca 객체를 만들어서 map에 저장해야 합니다.
				StringTokenizer stk = new StringTokenizer(temp,"\t_");
				String name = stk.nextToken();
				voca.put(name, new JavaVoca(name, stk.nextToken(), stk.nextToken()));
			}
			System.out.println("정상적으로 단어장 파일 읽어오기 끝 😋");
		}catch(FileNotFoundException e) {
			System.out.println("파일로부터 읽어오기 - 입력 예외 🫢: "+e.getMessage());
		}finally {
			if(fsc != null) fsc.close();
		}
	}
	
	@Override
	public void add(JavaVoca voca) { //단어장 항목 데이터를 Map에 추가
		//구현해보세요.
		this.voca.put(voca.getEnglish(), voca);
	}

	@Override
	public void print() {
		System.out.println(String.format("%-20s\t%-20s\t%-20s", "Java 단어 📖","뜻 🤓","레벨 🎚️"));
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		for(String key : voca.keySet()) {
			//itreator 대신에 향상 for사용 가능합니다.map 의 key값만으로 set을 만들어야 합니다.
			JavaVoca vo = voca.get(key);	//key값으로 value를 가져오기
			System.out.println(String.format("%-20s\t%-20s\t%-20s", 
					vo.getEnglish(),vo.getKorean(),vo.getLevel()));
		}
	}

	@Override
	public List<JavaVoca> group(String levle) { //그룹 검색 메소드
		List<JavaVoca> result = new ArrayList<JavaVoca>();
		///그룹 검색은 key 값만으로 안되고 하나씩 검사과정이 필요합니다.
		levle = switch(levle){			//자바 12부터 가능
			case "1" -> "Beginner";
			case "2" -> "Intermediate";
			case "3" -> "Advanced";
			default -> throw new IllegalArgumentException("Unexpected (value = 1 or 2 or 3) : "+levle);
		};
		for(String key : voca.keySet()) {
			JavaVoca vo = voca.get(key);
			if(vo.getLevel().equals(levle))
				result.add(vo);
		}
		
		return result;
	}


	@Override
	public void save(String path) {
		try (PrintWriter writer = new PrintWriter(path)){
			for(JavaVoca voca : voca.values()) {
				writer.println(voca.getEnglish() + "\t" + voca.getKorean() + "\t" + voca.getLevel());
			}
			System.out.println("단어장 파일 정상적으로 저장 완료 😋");
		} catch (FileNotFoundException e) {
			System.out.println("단어장 파일 저장 실패 🫢: "+e.getMessage());
		}
	}

	//단어장 수정기능
	Scanner sc = new Scanner(System.in);
	public void update(String english) {
		if(voca.containsKey(english)) {
			JavaVoca voca = this.voca.get(english);
			System.out.print("새로운 뜻(의미) 입력 ✍🏻  ");
			String korean = sc.nextLine();
			System.out.print("새로운 Level 입력 ✍🏻 ");
			String level = sc.nextLine();
			voca.setKorean(korean);
			voca.setLevel(level);
			System.out.println("단어 수정 완료 🥳");
		}else {
			System.out.println("해당 Java 용어가 단어장에 존재하지 않습니다.😥");
		}
	}
	//단어장 삭제기능
	public void delete(String english) {
		if(voca.containsKey(english)) {
			System.out.print("정말 삭제 하시겠습니까(Y / N)??");
			String key = sc.nextLine();
			switch (key) {
			case "Y":
				voca.remove(english);
				System.out.println("단어 삭제 완료 😶‍🌫️");
				break;
			case "N":
				System.out.println("삭제하기 취소되었습니다.");
				break;
			}
		}else {
			System.out.println("해당 Java 용어가 단어장에 존재하지 않습니다.😥");
		}
	}
}
