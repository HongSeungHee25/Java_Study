package partA.day04;

//A08 예제를 for문으로 바꾸기
public class A17AlphbetPrintFor {

	public static void main(String[] args) {
		
		System.out.println("1) 제어변수 타입을 int 로 하기");
		char start = 'A';
		for(int i = 0; i < 26; i++) { 	//실행횟수는 26번 실행합니다.
			System.out.print(start++);
			System.out.print((char)('A'+i)); 	//'A' + i는 정수입니다.(i가 정수이므로 큰 타입으로 형식이 정해집니다)
		}
		
		System.out.println("\n\n1) 제어변수 타입을 int 로 하기");
		//int num;
		for(int num = 65;num <= 90; num++) {
			System.out.print((char)num);
		}
		System.out.println("\n\n::: 알파벳 숫자로 출력하기 :::");
		for(int num = 'A';num <= 'Z'; num++) {
			System.out.print(num);
		}
		
		System.out.println("\n\n2) 제어변수 타입을 char 로 하기");
		//char ch;
		for(char ch = 'a'; ch <= 'z'; ch++) 
			System.out.print(ch);
			
		for(char ch = 'z'; ch >= 'a'; ch--) 
			System.out.print(ch);
		
		System.out.println("\n\n3) 대문자이어서 소문자 출력하기 A~Z, a~z");
		for(char ch = 'A'; ch <='z'; ch++)
			if(!(ch>=91 && ch<=96))
				System.out.print(ch); //ch가 91~96(특수문자)일때는 출력하지 않습니다.
	}

}
