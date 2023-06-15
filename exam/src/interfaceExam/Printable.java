package interfaceExam;

//인터페이스는 "interface"키워드를 사용하여 정의하며, 메소드 시그니처만을 포함하고 있기때문에 메소드의 구현 내용은 없습니다.
public interface Printable {
//예시 코드
	void print(); //추상 메소드 선언
	int getNumberOfPages();
	
//위의 예시에서 "Printable"인터페이스는 "print()"메소드와 "getNumberOfPages()" 메소드를 정의하고 있습니다.
//이 인터페이스를 구현하는 클래스는 이 두 메소드를 모두 구현해야 합니다. 구현 클래스 -> Printer
}
