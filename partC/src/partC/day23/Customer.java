package partC.day23;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Customer {
	
	private String id;
	private String name;
	private int age;
	
	private void name() {
		
	}

	public Customer(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	
}
