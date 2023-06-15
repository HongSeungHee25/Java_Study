package partB.day15;

public class B15AShapeTest {

	//코드가 실행결과가 이해가 안되면 소스파일 ctrl + 클릭 하면서 확인하면서 이해하기
	//딱 한줄만 꼽아서 그 한줄만 파고들면서 이해하면 다른것도 이해가 조금씩 됨.
	public static void main(String[] args) {
		
		//AShape aShape = new AShape();	//오류 : 추상클래스는 객체 생성 못함.
		
		AShape otri = new OTriangle();
		AShape ocir = new OCircle(16.5);
		System.out.println("=================================");
		System.out.println("=================================");
		AShape oladder = new OLadderShape("모모사다리꼴",11,13,23);
		System.out.println("=================================");
		AShape[] shapes = new AShape[5];		//AShape 구현객체를 참조할 배열
		
		//위 3개 객체 참조값을 배열 요소에 저장하기.		
		shapes[0] = otri;
		shapes[1] = ocir;
		shapes[2] = oladder;
		shapes[3] = new OCircle(16);
		System.out.println("=================================");
		shapes[4] = new OLadderShape("사나사다리꼴",15,22,25);
		System.out.println("=================================");
		
		otri.shapeName = "삼각형";  shapes[0].width = 20;  shapes[0].height = 16;
		System.out.println("AShape 배열에 저장된 도형 객체 출력(1)");
		for(int i=0;i<shapes.length;i++)
			System.out.println(shapes[i].toString());
			
		System.out.println("=================================");
		System.out.println("AShape 배열에 저장된 도형 객체 출력(2)");
		for(AShape s : shapes)		//shapes 자료구조에서 순서대로 1개씩 가져와 변수 s에 참조
			System.out.println(s.toString());
		//System.out.println("넓이 = "+ s.area());
		
		System.out.println("=================================");
		System.out.println(":::instanceof 복습문제 1:::");
		//instanceof 복습문제
		//shapes 배열의 객체들을 하나씩 검사하여
		//1) OLadderShape 객체인 경우 iamLadder() 메소드 실행하세요. index를 사용하는 for문 사용.
		for(int i = 0; i < shapes.length; i++) {
			if(shapes[i] instanceof OLadderShape) {
				OLadderShape temp = (OLadderShape)shapes[i];
				temp.iamLadder();
			}
		}
		System.out.println("=============0번 인덱스 객체 바꾸기=============");
		shapes[0] = new OCircle();
		
		System.out.println("=================================");
		System.out.println(":::instanceof 복습문제 2:::");
		//2) OCircle 객체인 경우 iamCircle() 메소드를 실행하세요. 향상 for문 사용합시다.
		for(AShape s : shapes) {
			if(s instanceof OCircle) {
				OCircle temp = (OCircle)s;
				temp.iamCircle();
			}
		}
	
	}

}
