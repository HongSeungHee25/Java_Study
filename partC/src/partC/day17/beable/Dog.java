package partC.day17.beable;

public class Dog implements Runnable{
	
	//부모 인터페이스의 추상메소드 정의하기
	@Override
	public String beAble() {
		return "Runnable";
	}

	private String name;
	
	
	@Override
	public String run(int speed) {
		
		return "name = "+name+",speed = "+speed+" 달리기 잘합니다.";
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	

}
