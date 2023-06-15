package interfaceExam;

//인터페이스를 구현하는 클래스는 "implements" 키워드를 사용하여 인터페이스를 구현할 수 있습니다.
public class Printer implements Printable{
//예시 코드
	@Override
	public void print() {
		System.out.println("Printing...");
	}

	@Override
	public int getNumberOfPages() {
		return 10;
	}
	
//위의 예시에서 "Printer"클래스는 "Printable"인터페이스를 구현하고 있습니다. 따라서 "Printer"클래스는 "print()"메소드와 
//"getNumberOfPages()"메소드를 구현해야 합니다. 구현된 메소드는 각각 "Printing..."출력하고, 10을 반환하도록 정의되어 있습니다.
	


}
