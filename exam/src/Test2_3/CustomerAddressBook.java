package Test2_3;

import java.util.List;
import java.util.Map;

/*

홍길동	서울시 서초구(VIP)
강쯔위	경기도 성남시 분당구(직원)
이모모	서울시 종로구 종로1가(일반고객)

=================================
위와 같은 데이터를 객체로 생성하기 위한 클래스 정의
	*단, 이름(name)은 중복되지 않도록 합니다.	ex) 홍길동1,홍길동2,...

Customer 클래스
	>> String name, address, grade 필드

CustomerNote 클래스
	>> Customer 객체들을 저장할 컬렉션필드 Map과 AddressBook 인터페이스 기능을 구현하기

CustomerAddressBook 인터페이스
	>> 기능 정의/추가, 등급별 검색, 전체보기, 파일입력, 파일출력

*/
public interface CustomerAddressBook {
	
	//AddressBook 인터페이스
	//	>> 기능 정의/추가, 등급별 검색, 전체보기, 파일입력, 파일출력
	//txt 파일에 저장된 Map 객체 가져오기
	Map<String, Customer> getCustomer();
	
	//기능 정의/추가 add()
	void add(Customer person);
	
	//등급별 검색 group()
	List<Customer>group(String level);
	
	//전체보기에 사용할 print()
	public void print();
	
	//파일 입력 load()
	void load(String path);
	
	//파일 출력 save()
	void save(String path);
	
}
