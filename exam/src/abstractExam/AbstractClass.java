package abstractExam;
//추상 메소드의 사용법 : 
public abstract class AbstractClass {
	public abstract void abstractMethod();
}

class ConcreteClass extends AbstractClass{
	@Override
	public void abstractMethod() {
		//추상 메소드 구현
	}
	//익명 클래스의 사용법 : 
	InterfaceName object = new InterfaceName() {
		//익명 클래스의 정의
		//인터페이스의 메소드 구현 또는 재정의
	};
	//또는
	AbstractClass object1 = new AbstractClass() {
		@Override
		public void abstractMethod() {
		//익명 클래스의 정의
		//추상 클래스의 추상 메소드 구현 또는 재정의
			
		}
	};
}