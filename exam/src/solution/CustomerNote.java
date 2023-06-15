package solution;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class CustomerNote implements CustomerAddressBook{

	private Map<String, Customer> customer;
	
	public CustomerNote() {
		customer = new TreeMap<String, Customer>();
	}
	@Override
	public Map<String, Customer> getCustomer() {
		return customer;
	}

	@Override
	public List<Customer> group(String group) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(Customer person) {
		// TODO Auto-generated method stub
		
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
				StringTokenizer stk = new StringTokenizer(temp, "\t_()");
				String name = stk.nextToken();
				
			}
		}catch(FileNotFoundException e) {
			
		}
	}

	@Override
	public void save(String File) {
		// TODO Auto-generated method stub
		
	}

}
