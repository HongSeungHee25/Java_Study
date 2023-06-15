package Test2_3;

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

public class CustomerNote implements CustomerAddressBook{

	//CustomerNote 클래스
	//	>> Customer 객체들을 저장할 컬렉션필드 Map과 AddressBook 인터페이스 기능을 구현하기
	
	//파일에서 읽어온 데이터를 저장할 자료구조가 필요
	private Map<String, Customer> customer;
	//'Map'인터페이스를 구현한 'customer'필드를 선언합니다.
	//'String'을 키로,'Customer'객체를 값으로 갖는 맵입니다.
	
	
	//생성자
	public CustomerNote() {
		customer = new TreeMap<String, Customer>();
		//생성자 내부에서 'customer'필드를 'TreeMap'객체로 초기화합니다.
		//'TreeMap'은 키를 기준으로 정렬된 맵을 구현하는 클래스입니다.
	}
	//---VocaNoteBook 인터페이스의 추상메소드 재구현---//
	
	
	@Override  //txt 파일에 저장된 Map 객체 가져오는 메소드
	public Map<String, Customer> getCustomer() {
	//'getCustomer'메서드를 오버라이딩하여 구현합니다.
		return customer;
		//'customer'필드를 반환합니다.
	}
	
	
	
	//파일 입력 load()
	@Override
	public void load(String path) {
	//파일을 읽어오는 'load'메서드입니다.	
	//'String'타입의 'path'매개변수로 파일의 경로를 받습니다.
		File file = new File(path);
		//'path'를 사용하여 새로운 'File'객체를 생성합니다.
		//이 때, 'path'는 파일의 경로를 나타냅니다.
		Scanner fsc = null;
		//'Scanner'객체인 'fsc'를 초기화합니다.
		//파일 스캔을 위해 사용됩니다.
		try {
		//파일을 스캔하면서 예외 처리와 파일 스트림의 종료를 담당하는 블록
			fsc = new Scanner(file);
			//'Scanner'객체를 생성하여 'file'에서 입력을 받을 준비를 합니다.
			while(fsc.hasNext()) {
			//'Scanner'객체를 사용하여 파일을 한 줄씩 읽어옵니다.
			//'hasNext'메서드를 사용하여 읽어올 줄이 남아있는지 확인합니다.
				String temp = fsc.nextLine();
				//다음 줄을 읽어 'temp'변수에 저장합니다.
				System.out.println(temp);
				//읽어온 데이터 화면에 출력합니다.(테스트용)
				StringTokenizer stk = new StringTokenizer(temp,"(\t_)");
				//'temp'문자열을 탭('\t')과 언더바('_')를 구분자로 사용하여 분리하는
				//'StringTokenizer' 객체를 생성하여 분리합니다.
				String name = stk.nextToken();
				//'stk'객체에서 다음 토큰을 가져와서 'name'변수에 저장합니다.
				customer.put(name, new Customer(name, stk.nextToken(),stk.nextToken()));
				//'customer'맵에 새로운 'Customer'객체를 추가합니다.
				//'name'을 키로 사용하고, 'stk'객체에서 가져온 두 개의 토큰을 이용하여
			}	//'Customer'객체를 생성하여 값으로 설정합니다.
				System.out.println("단어 "+customer.size()+"개를 읽어와 저장했습니다.");
				//'size()'는 문자 수를 계산해줍니다.
				System.out.println("정상적으로 파일 읽어오기 끝");
			}catch(FileNotFoundException e) {
			//파일을 찾을 수 없는 경우 발생하는 예외 처리합니다.	
				System.out.println("입력 예외 : "+e.getMessage());
			}finally {
				if(fsc != null) fsc.close();
			}
	}//load end
	
	//전체보기에 사용할 print()
		@Override
		public void print() {
		//파일을 출력하는 'print()'메서드입니다.
			System.out.println(String.format("%-20s\t%-20s\t%-20s", "이름","주소","등급"));
			//포맷 문자열을 사용하여 "이름","주소","등급"을 포함한 헤더를 출력합니다.
			//%s 는 문자열 포맷을 나타내며, -20 은 왼쪽 정렬을 의미합니다. \t 은 탭 문자를 나타냅니다.
			System.out.println("=========================================================");
			for(String key : customer.keySet()) {
			//'customer'맵의 모든 키에 대해 반복합니다.
				Customer cs = customer.get(key);
				//'customer'맵에서 해당 키에 해당하는 값을 가져와 'cs'변수에 저장합니다.
				System.out.println(String.format("%-20s\t%-20s\t%-20s",cs.getName(),cs.getAddress(),cs.getGrade()));
			}
		}
	
	
	//등급별 검색 group()
		@Override
		public List<Customer> group(String level) {
		//'level'값을 기준으로 그룹을 검색하는 'group'메서드입니다.
		//메서드는 'List<Customer>'를 반환합니다.
			List<Customer> result = new ArrayList<Customer>();
			//결과를 저장할 빈 리스트인 'result'를 생성합니다.
			level = switch(level) { //'level' 값에 따라 'switch'문을 사용하여 해당하는 그룹을 설정합니다.
			case "1" -> "일반 고객";
			case "2" -> "직원";
			case "3" -> "VIP";
			default -> throw new IllegalArgumentException("Unexpected (value =1 or 2 or 3) : "+level);
	 		};
	 		for(String key : customer.keySet()) {
	 		//'customer'맵의 모든 키에 대해 반복합니다.
	 			Customer cs = customer.get(key);
	 			//'customer'맵에서 해당 키에 해당하는 값을 가져와 'cs'변수에 저장합니다.
	 			if(cs.getGrade().equals(level))
	 			//'cs'객체의 등급('getGrade()')이 'level'값과 일치하는 경우에만 
	 				result.add(cs);
	 				//'result'리스트에 추가합니다.
	 		}
			return result;
			//'result'리스트에 반환합니다.
		}
//group end
	
	
	
	//기능 정의/추가 add()
	@Override
	public void add(Customer person) {
	//'Customer'객체를 추가하는 'add'메서드입니다.
	//매개변수로 'Customer'객체인 'person'을 받습니다.
	//반환값이 없는 'void' 타입입니다.
		customer.put(person.getName(), person);
		//'customer'맵에 'person'객체를 추가합니다.
		//'person.getName()'을 키로 사용하여 'person'객체를 맵에 저장합니다.
	}

	
	
	//파일 출력 save()
	@Override
	public void save(String path) {
	//'save'메소드는 주소록을 파일에 저장하는 기능을 수행합니다.
	//'path'는 저장할 파일의 경로를 나타냅니다.
		File file = new File(path);
		//주어진 'path'를 사용하여 'File'객체를 생성합니다.
		PrintWriter pw = null;
		//객체 초기화
		try {
			pw = new PrintWriter(file);
			Iterator<String> iterator = customer.keySet().iterator(); 
			while(iterator.hasNext()) {
				String key = iterator.next();
				Customer cm = customer.get(key);
				pw.println(cm);
			}
			System.out.println("이름 "+customer.size()+"개를 파일에 저장했습니다.");
			System.out.println("정상적으로 주소록 파일 저장하기 끝");
		}catch(FileNotFoundException e) {
			System.out.println("출력 예외 : "+e.getMessage());
		}finally {
			if(pw != null) pw.close();
		}
		
		
		//try-catch문으로 파일 출력(저장)
	}//save end



	
	
	
}//class end
