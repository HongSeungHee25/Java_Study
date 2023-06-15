package map;

public class Person{
	
	static String name;	//사람 이름
	static int age;		//사람 나이
	
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		Person.name = name;
	}
	public static int getAge() {
		return age;
	}
	public static void setAge(int age) {
		Person.age = age;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
