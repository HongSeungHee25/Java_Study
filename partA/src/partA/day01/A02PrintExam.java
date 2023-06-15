package partA.day01;

public class A02PrintExam {

	public static void main(String[] args) {
		System.out.println("::: 나의 소울 푸드 :::");
		myFood();
		System.out.println("\n::: 나의 반려 동물 :::"); // println, print + line 은 출력 + 줄바꿈
		myAnimal();
	}
	
	public static void myFood() {
		// \n은 줄바꿈 기능의 문자
		System.out.println("1. 피자\n2. 마라탕\n3. 치킨");
		// \t는 일정 간격 띄어쓰기 기능의 문자(8칸)
		System.out.println("---tap으로 구분---");
		System.out.println("123456781234567812345678");
		System.out.println("1. 피자\t2. 마라탕\t3. 치킨\t");
	}

	public static void myAnimal() {
		System.out.println("1. 강아지\n2. 고양이\n3. 원숭이");
		System.out.println("---tap으로 구분---");
		System.out.println("1. 강아지\t2. 고양이\t3. 원숭이\t");
	}
}
