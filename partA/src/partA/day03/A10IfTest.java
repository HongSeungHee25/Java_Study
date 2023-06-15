package partA.day03;

//if 조건문 시작 : 형식1 => if(조건식){참일때 실행하는 명령문들....}
public class A10IfTest {

	public static void main(String[] args) {
		
		int age = 26; //데이터를 소스코드에 직접 써서 하는 것을 하드코딩이라고 합니다.
					  //여러 다양한 값을 테스트하려면 불편합니다. 사용자 입력으로 업데이트 
		boolean isAdult = false;	
		
		System.out.println("조건식 미리 확인 : "+(age >= 20));
		if(age >= 20) {	//age가 16이면 거짓 , age가 26이면 참
			isAdult = true;	//age가 16이면 실행 안함, age가 26이면 실행 함
		}
		System.out.println("isAdult : "+isAdult);
		
		System.out.println("=====회원 확인=====");
		int point = 70;		//요구사항 : 1. point가 70이상이면 VIP, 70미만이면 일반회원
							//		   2. VIP 회원이면 이벤트 포인트 100포인트 추가, 일반회원은 50포인트 지급
		if(point >= 70) {
			System.out.println("VIP 회원입니다.");
			point += 100;
		}else {		//point < 70 일때 실행
			System.out.println("일반 회원입니다.");
			point += 50;
		}System.out.println("고객님의 최종 포인트는 "+point +"입니다.");
	}

}
