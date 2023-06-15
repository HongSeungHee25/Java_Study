package partC.day22.example;

import java.util.List;
import java.util.Map;

public interface AddressBook {
//인터페이스로 기능 정의-추가, 등급별 검색, 전체보기
	
	Map<String, Customer> getCustomer();  		
	void add(Customer cust);
	public void print();
	List<Customer> group(String group);
	void load(String path);
	void save(String path);
	Customer remove(String key);
}
