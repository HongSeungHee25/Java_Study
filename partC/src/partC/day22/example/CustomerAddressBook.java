package partC.day22.example;

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

public class CustomerAddressBook implements AddressBook{
//== > Customer 객체들을 저장할 컬렉션필드 Map과 AddressBook 인터페이스 기능을 구현하기

	private Map<String, Customer> cust;
	
	public CustomerAddressBook() {
		cust = new TreeMap<>();
	}
	
	@Override
	public Map<String, Customer> getCustomer() { 
		return cust;
	}
	
	@Override
	public void load(String path) {
		File file = new File(path);
		Scanner fsc = null;
		try {
			fsc = new Scanner(file);
			while(fsc.hasNext()) {
				String temp = fsc.nextLine();
				System.out.println(temp);
				StringTokenizer stk = new StringTokenizer(temp,"(\t_)");
				String name = stk.nextToken();
				cust.put(name, new Customer(name, stk.nextToken(), stk.nextToken()));
			}
			System.out.println("직원 "+cust.size()+"명을 읽어와 저장했습니다.");
			System.out.println("정상적으로 주소록 읽어오기 끝 😋");
		} catch (FileNotFoundException e) {
			System.out.println("파일로부터 읽어오기 - 입력 예외 🫢: "+e.getMessage());
		}finally {
			if(fsc != null) fsc.close();
		}
	}

	@Override
	public void add(Customer cust) {
		this.cust.put(cust.getName(), cust);
	}

	@Override
	public void print() {	
		System.out.println(String.format("%-20s\t%-20s\t%-20s", "직원 이름 📖","주소 🤓","등급 🎚️"));
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		for(String key : cust.keySet()) {
			Customer c = cust.get(key);
			System.out.println(String.format("%-20s\t%-20s\t%-20s", 
					c.getName(),c.getAddress(),c.getGrade()));
		}
	}

	@Override
	public List<Customer> group(String group) { //그룹 검색 메소드
		List<Customer> result = new ArrayList<Customer>();
		group = switch(group) {
		case "1" -> "인턴";
		case "2" -> "직원";
		case "3" -> "대리";
		case "4" -> "팀장";
		case "5" -> "CEO";
		default -> throw new IllegalArgumentException("Unexpected (value = 1 or 2 or 3 or 4 or 5) : "+group);
		};
		for(String key : cust.keySet()) {
			Customer c = cust.get(key);
			if(c.getGrade().equals(group))
				result.add(c);
		}
		return result;
	}


	@Override
	public void save(String path) {
		File file = new File(path);
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(file);
			Iterator<String> iterator = cust.keySet().iterator();
			while(iterator.hasNext()) {
				String key = iterator.next();
				Customer c = cust.get(key);
				pw.println(c); //c.toString() 재정의한 문자열 리턴.(재정의 없다. 했을때, 패키지명.클래스명@해시코드)
			}
			System.out.println("주소록 정상적으로 저장 완료 😋");
		}catch(FileNotFoundException e) {
			System.out.println("주소록 저장 실패 🫢: "+e.getMessage());
		}finally {
			if(pw != null) pw.close();
		}
	}
	Scanner sc = new Scanner(System.in);
	@Override
	public Customer remove(String key) {
		Customer c = cust.get(key);
		if(c == null) {
			System.out.println("해고할 직원 정보가 없습니다.");
		}else {
			System.out.println("직원 정보를 찾았습니다. => "+c);
			
			System.out.print("정말 해고 하시겠습니까(Y / N)??");
			String y = sc.nextLine();
			
			if(y.equals("Y"))
				c = cust.remove(key);
			System.out.println("정상적으로 해고되었습니다.😶‍🌫️");
		}
		return c;
	}
	public void update(String name) {
		if(cust.containsKey(name)) {
			Customer c = cust.get(name);
			System.out.print("변경된 주소 입력 ✍🏻 ");
			String address = sc.nextLine();
			System.out.print("승진할 등급 입력 ✍🏻 ");
			String grade = sc.nextLine();
			c.setAddress(address);
			c.setGrade(grade);
			System.out.println("직원 정보 수정 완료 🥳");
		}else {
			System.out.println("해당 직원 정보가 존재하지 않습니다.😥");
		}
	}
}
