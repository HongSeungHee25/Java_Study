package javavoca;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class JavaVocaNote implements VocaNoteBook{
	//파일에서 읽어온 데이터를 저장할 자료구조가 필요합니다.
	//객체명은 voca
	private Map<String, JavaVoca> voca;
	
	//데이터 저장할 map 객체 생성
	public JavaVocaNote() {
		voca = new TreeMap<String, JavaVoca>();
	}
	
	//voca 필드의 getter
	@Override
	public Map<String, JavaVoca> getVoca() {
	//'getVoca'메서드는 'Map<String, JavaVoca>'타입의 맵을 반환합니다. 
	//이 메서드를 호출하면 현재 인스턴스의 'voca'맵을 반환합니다.
		return voca;
		//현재 인스턴스의 'voca'맵을 반환합니다.
		
		//위의 코드는 인터페이스에 선언된 'getVoca()'메서드를 구현하여, 
		//해당 인스턴스의 'voca'맵을 외부에서 조회할 수 있도록 해주는 기능을 제공합니다.
	}
	//---VocaNoteBook의 추상메소드 구현부---//
	
	@Override //단어장 저장 Map 객체 가져오기
	public void add(JavaVoca voca) {
	//'JavaVoca'타입의 인자 'voca'를 받습니다. 반환값은 없습니다.
		this.voca.put(voca.getEnglish(), voca);
		//'this.voca'맵에 'voca'객체를 추가합니다.
		//'voca.getEnglish()'는 'voca'객체의 'English'속성 값을 반환합니다. 
		//이 값을 키로 사용하여 'this.voca'맵에 추가합니다.
		//'voca'객체 자체를 값으로 사용하여 'this.voca'맵에 저장합니다.
		
		//이 코드는 'add(JavaVoca voca)'메서드를 호출하면 전달된 'JavaVoca'객체를 'this.voca'맵에 
		//추가하는 기능을 수행합니다. 'JavaVoca'객체의 'English'속성 값이 키로 사용되며, 객체 자체가 값으로 저장됩니다.
	}

	@Override //단어장 Map 전체 데이터 출력
	public void print() {
		System.out.println(String.format("%-20s\t%-20s\t%-20s", "자바단어","뜻(의미)","레벨"));
		//'%'를 사용하여 포맷 지정자를 지정하고, 각 항목의 값을 인자로 전달합니다.
		//출력 형식은 '%-20s'으로 지정되어 있으며, '자바단어','뜻(의미)','레벨'이 순서대로 출력됩니다.
		for(String key : voca.keySet()) {
		//'voca'맵의 모든 키에 대해 반복합니다.
		//'key'변수에는 각 키가 순차적으로 할당됩니다.
			JavaVoca vo = voca.get(key);
			//'voca'맵에서 현재 'key'에 해당하는 값을 가져와 'vo'변수에 할당합니다.
			System.out.println(String.format("%-20s\t%-20s\t%-20s",vo.getEnglish(),vo.getKorean(),vo.getLevel()));
			//포멧 지정자를 사용하여 'vo'객체의 속성인 'English', 'Korean', 'Level' 값을 포맷화된 문자열로 출력합니다.
			//이 과정을 'voca'맵의 모든 키에 대해 반복합니다.
			
			//이 코드는 'print()'메서드를 호출하면 'voca'맵에 저장된 단어 데이터를 포멧화된 형식으로 출력하는 기능을 수행합니다.
		}
	}
	@Override //단어장 Map 에서 원하는 그룹(레벨)을 찾아서 List 로 리턴하기
	public List<JavaVoca> group(String group) {
	//'String'타입의 인자 'group'을 받습니다. 반환값은 'JavaVoca'객체의 리스트인 'List<JavaVoca>'입니다.
		List<JavaVoca> result = new ArrayList<JavaVoca>();
		//'result'라는 이름의 'ArrayList'객체를 생성합니다. 이 리스트는 'JavaVoca'객체를 담는 용도로 사용됩니다.
		group = switch (group) {
		//'group'값을 검사하여 적절한 문자열로 변경합니다. 
		case "1" -> "Beginner";
		case "2" -> "Intermediate";
		case "3" -> "Advanced";
		default -> throw new IllegalArgumentException("Unexpected (value = 1 or 2 or 3) : " + group);
		};
		for(String key : voca.keySet()) {
		//'voca'맵의 모든 키에 대해 반복합니다.'key'변수에는 현재 반복중인 키가 할당됩니다.
			JavaVoca vo = voca.get(key);
			//'voca'맵에서 현재 키에 해당하는 값을 가져옵니다. 이 값은 'JavaVoca'객체입니다.
			if(vo.getLevel().equals(group))
			//가져온 'JavaVoca'객체의 'Level'속성 값이 'group'값과 일치하는지 확인합니다.
				result.add(vo);
				//일치하는 경우, 해당 객체를 'result'리스트에 추가합니다.
		}
		return result;
		//'result'리스트에 반환합니다. 이 리스트는 'JavaVoca'객체의 그룹을 나타냅니다.
		
		/* 이 코드는 'group(String group)'메서드를 호출하면 전달된 'group'값에 해당하는 'JavaVoca'객체들을 찾아서 리스트로 반환하는
		 * 기능을 수행합니다. 'voca'맵의 모든 키를 반복하면서 해당 키에 대응하는 'JavaVoca'객체의 'Level'속성 값과 'group'값이 일치하는 
		 * 경우에만 'result'리스트에 추가됩니다. 반환되는 'result'리스트는 해당 그룹에 속하는 'JavaVoca'객체들로 구성됩니다.
		 */
	}

	@Override //path로 지정된 경로파일에서 데이터 가져와 단어장 Map 에 저장하기
	public void load(String path) {
		File file = new File(path); 
		//'path'를 사용하여 새로운 'File'객체를 생성합니다. 이 때, 'path'는 파일의 경로를 나타냅니다.
		Scanner fsc = null;
		//'Scanner'객체인 'fsc'를 초기화합니다.
		try {
			fsc = new Scanner(file);
			//'Scanner'객체를 생성하여 'file'에서 입력을 받을 준비를 합니다.
			while(fsc.hasNext()) {
			//입력 파일에서 데이터를 읽을 수 있는 동안 반복합니다.
				String temp = fsc.nextLine();
				//파일에서 한 줄씩 데이터를 읽어와서 'temp'변수에 저장합니다.
				System.out.println(temp);
				//읽어온 데이터를 화면에 출력합니다.
				StringTokenizer stk = new StringTokenizer(temp,"\t_");
				//'temp'문자열을 탭('\t')과 언더바('_')를 구분자로 사용하여 분리하는 'StringTokenizer' 객체를 생성합니다.
				String name = stk.nextToken();
				//'stk'에서 다음 토큰을 가져와서 'name'변수에 저장합니다.
				voca.put(name, new JavaVoca(name, stk.nextToken(), stk.nextToken()));				}
				//'name'과 나머지 두 개의 토큰을 사용하여 'JavaVoca'객체를 생성하고, 'voca'맵에 'name'을 키로 하여 객체를 저장합니다.
			System.out.println("단어 "+voca.size()+"개를 읽어왔습니다.");
			System.out.println("정상적으로 단어장 파일 읽어오기 끝");
		}catch(FileNotFoundException e) {
		//파일을 읽어오는 도중 예외가 발생했을 경우, 예외를 처리합니다.
			System.out.println("입력 예외 : "+e.getMessage());
		}finally {
		//'fsc'객체를 닫습니다. 이는 파일 리소스를 안전하게 해제하는 역할을 합니다.
			if(fsc != null) fsc.close();
		}
	}

	@Override //path로 지정된 경로파일에 단어장 Map 데이터 저장하기
	public void save(String path) {
	//'save'메서드는 'String'타입의 인자 'path'를 받습니다. 이 인자는 파일의 경로를 나타냅니다.
	//반환값은 없습니다.('void')
		File file = new File(path);
		//주어진 'path'를 사용하여 'File'객체를 생성합니다. 이 객체는 파일을 나타냅니다.
		PrintWriter pw = null;
		//'PrintWriter'객체를 초기화합니다.
		try {
			pw = new PrintWriter(file);
			//'file'객체를 사용하여 'PrintWriter'객체를 생성합니다. 이 객체를 통해 파일에 쓰기 작업을 수행 할 수 있습니다.
			Iterator<String> iterator = voca.keySet().iterator();
			//'voca'맵의 모든 키를 가져와서 이를 순회하는 'Iterator'객체를 생성합니다.
			while(iterator.hasNext()) {
			//'iterator'객체의 다음 요소가 있는지 확인하고, 있을 경우에 루프를 반복합니다.
				String key = iterator.next();
				//'iterator'객체로부터 다음 키 값을 가져옵니다.
				JavaVoca vo = voca.get(key);
				//가져온 키 값에 해당하는 'JavaVoca'객체를 'voca'맵에서 찾아옵니다.
				pw.println(vo);
				//'PrintWriter'객체를 사용하여 'vo'객체를 파일에 출력합니다. 이 때, 'JavaVoca'객체의
				//'toString'메서드가 호출되어 출력됩니다.
			}
			System.out.println("단어 "+voca.size()+"개를 파일에 저장했습니다.");
			System.out.println("정상적으로 단어장 파일 저장하기 끝");
		}catch(FileNotFoundException e) {
			System.out.println("출력 예외 : "+e.getMessage());
		}finally {
			if(pw != null) pw.close();
			//사용한 자원을 정리합니다. 'PrintWriter'객체를 닫습니다.
			
			/*  위의 코드는 'save(String path)'메서드를 호출하면 'voca'맵에 저장된 데이터를 파일로 저장하는 기능을 수행합니다.
			 * 'PrintWriter'객체를 사용하여 파일을 쓰기 위한 준비를 하고, 'voca'맵의 모든 키에 대해 순회하면서 해당 키에 해당하는 
			 * 'JavaVoca'객체를 파일에 출력합니다. 파일 저장이 정상적으로 완료되면 저장된 단어의 개수를 출력하고 작업을 종료합니다. 
			 */
		}
	}

	@Override //key를 인자로 받아 단어장 Map 에서 데이터 제거. 삭제된 데이터 value 를 리턴.
	public JavaVoca remove(String key) {
	//'remove'메서드는 'String'타입의 인자 'key'를 받습니다. 이 인자는 삭제할 단어의 키 값을 나타냅니다.
	//반환값은 'JavaVoca'객체입니다.
		Scanner sc = new Scanner(System.in);
		JavaVoca d = voca.get(key);
		//'voca'맵에서 주어진 'key'에 해당하는 값을 가져옵니다. 즉, 삭제할 단어의 'JavaVoca'객체를 'd'에 저장합니다.
		if(d == null) {
		//만약 'd'가 'null'이라면, "찾는 단어가 없습니다"를 출력합니다.
			System.out.println("찾는 단어가 없습니다.");
		}else {
		//만약 'd'가 'null'이 아니라면 "단어를 찾았습니다" 와 'd'의 내용을 출력합니다.
			System.out.println("단어를 찾았습니다. => "+d);
			System.out.print("정말 삭제하시겠습니까?(Y/N) ");
			//사용자에게 삭제 여부를 묻고 사용자로 부터 입력을 받습니다.
			String y = sc.nextLine();
			if(y.equals("Y"))
			//만약 'y'가 "Y"와 같다면, 'voca'맵에서 주어진 'key'에 해당하는 값을 삭제합니다. 
				d = voca.remove(key);
				//삭제된 'JavaVoca'객체를 'd'에 다시 할당합니다. 
		}
		return d;
		//삭제된 'JavaVoca'객체를 반환합니다.
		
	    /* 위의 코드는 'remove(String key)'메서드를 호출하면 'voca'맵에서 주어진 키에 해당하는
		 * 단어를 찾아 삭제하는 기능을 수행합니다. 사용자로부터 삭제 여부를 입력받아 "Y"일 경우에만
		 * 실제로 삭제 작업을 수행하고, 삭제된 'JavaVoca'객체를 반환합니다.
		 */
	}

		
	}