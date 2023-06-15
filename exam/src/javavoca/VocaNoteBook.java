package javavoca;

import java.util.List;
import java.util.Map;

public interface VocaNoteBook {

	
	Map<String, JavaVoca> getVoca();
	//단어장에 있는 모든 단어를 가져오는 메서드입니다. 
	//'JavaVoca'객체들을 단어와 매핑한 'Map'을 반환합니다.
	void add(JavaVoca voca);
	//단어장에 새로운 단어를 추가하는 메서드입니다.
	//'JavaVoca'객체를 매개변수로 받아 단어장에 추가합니다.
	public void print();
	//단어장의 모든 단어를 출력하는 메서드입니다.
	//출력 형식은 구현에 따라 다를 수 있습니다.
	List<JavaVoca>group(String group);
	//특정 그룹에 속한 단어들을 가져오는 메서드입니다. 매개변수로 그룹 이름을 받고,
	//해당 그룹에 속한 단어들을 'List<JaveVoca>'형태로 반환합니다.
	void load(String path);
	//파일에서 단어장을 불러오는 메서드입니다.
	//매개변수로 파일 경로를 받아 해당 파일에서 단어장을 읽어옵니다.
	void save(String path);
	//단어장을 파일에 저장하는 메서드입니다.
	//매개변수로 파일 경로를 받아 해당 경로를 단어장에 저장합니다.
	JavaVoca remove(String key);

	
}