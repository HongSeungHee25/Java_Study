package test;

import java.util.Scanner;

public class Problem {
	
	//평가 메소드 
	public void evaluation() {
		Scanner sc = new Scanner(System.in);
		boolean status = true;
		int count = 0;
		int count2 = 0;
		while(status) {
			System.out.println("[과정평가형]정보처리산업기사 취득과정A");
			System.out.println("1. 시험을 시작합니다. | 2. 재시험을 봅니다. | 3. 종료합니다.");
			System.out.print("선택해주세요 >>>");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.println("--------------------------------------------------------------");
				System.out.println("1. 효율적인 프로그램 개발을 위해 필요한 프로그램을 모아 놓은 집합체로서, \n필요할 때 찾아서 쓸 수 있도록 모듈화 되어 제공되는 프로그램을 의미하는 것은?");
				System.out.println("① 라이브러리 | ② 프레임워크 | ③ 샘플코드 | ④ 패키지");
				System.out.print("답 : ");
				int num1 = sc.nextInt();
				if(num1 == 1) {
					count+=10;
				}else {
					count+=0;
				}
				System.out.println("--------------------------------------------------------------");
				System.out.println("2. SW 개발 과정을 관리하는 오픈소스 기반의 도구 중 형상관리도구에 속하지 않는 것은?");
				System.out.println("① SVN | ② CVS | ③ StarUML | ④ Git");
				System.out.print("답 : ");
				int num2 = sc.nextInt();
				if(num2 == 3) {
					count+=10;
				}else {
					count+=0;
				}
				System.out.println("--------------------------------------------------------------");
				System.out.println("3. 다음 중 UI 개발 도구가 아닌 것은 무엇인가?");
				System.out.println("① 파워포인트 | ② 와이어프레임 | ③ 스토리보드 | ④ 엑셀");
				System.out.print("답 : ");
				int num3 = sc.nextInt();
				if(num3 == 4) {
					count+=10;
				}else {
					count+=0;
				}
				System.out.println("--------------------------------------------------------------");
				System.out.println("4. 다음 중 웹 브라우저가 아닌것은 무엇인가?");
				System.out.println("① 인터넷익스플로러 | ② 파이어폭스 | ③ 크롬 | ④ 이클립스");
				System.out.print("답 : ");
				int num4 = sc.nextInt();
				if(num4 == 4) {
					count+=10;
				}else {
					count+=0;
				}
				System.out.println("--------------------------------------------------------------");
				System.out.println("5. 다음 중 데이터 모델링 절차에 포함되지 않는 것은?");
				System.out.println("① 개념 데이터 모델링 | ② 논리 데이터 모델링 | ③ 속성 데이터 모델링 | ④ 데이터 베이스 구축");
				System.out.print("답 : ");
				int num5 = sc.nextInt();
				if(num5 == 3) {
					count+=10;
				}else {
					count+=0;
				}
				System.out.println("--------------------------------------------------------------");
				System.out.println("6. UI 설계 원칙 중 누구나 쉽게 이해하고 사용할 수 있어야 한다는 것을 무엇이라 하는가?");
				System.out.println("① 학습성 | ② 유효성 | ③ 직관성 | ④ 유연성");
				System.out.print("답 : ");
				int num6 = sc.nextInt();
				if(num6 == 3) {
					count+=10;
				}else {
					count+=0;
				}
				System.out.println("--------------------------------------------------------------");
				System.out.println("7. 소프트웨어 요구사항 품질 특성이 아닌 것은 무엇인가?");
				System.out.println("① 특이성 | ② 일반성 | ③ 명확성 | ④ 추적성");
				System.out.print("답 : ");
				int num7 = sc.nextInt();
				if(num7 == 1) {
					count+=10;
				}else {
					count+=0;
				}
				System.out.println("--------------------------------------------------------------");
				System.out.println("8. UI 테스트를 위해 시행하는 테스트가 아닌 것은?");
				System.out.println("① 단위 테스트 | ② 일일 테스트 | ③ 통합 테스트 | ④ 기능 테스트");
				System.out.print("답 : ");
				int num8 = sc.nextInt();
				if(num8 == 2) {
					count+=10;
				}else {
					count+=0;
				}
				System.out.println("--------------------------------------------------------------");
				System.out.println("9. 애플리케이션의 배포 단위, 형식에 따라 소스코드를 컴파일, 패키징하며, \n배포하는 스크립 트를 제공하고 수행하는 도구를 무엇이라 하는가?");
				System.out.println("① 빌드 도구 | ② 테스트 도구 | ③ 소스코드 품질 측정도구 | ④ 테스트 커버리지 측정도구");
				System.out.print("답 : ");
				int num9 = sc.nextInt();
				if(num9 == 1) {
					count+=10;
				}else {
					count+=0;
				}
				System.out.println("--------------------------------------------------------------");
				System.out.println("10. JAVA의 데이터 타입 중에서 성격이 다른 하나는?");
				System.out.println("① byte | ② double | ③ short | ④ int");
				System.out.print("답 : ");
				int num10 = sc.nextInt();
				if(num10 == 2) {
					count+=10;
				}else {
					count+=0;
				}System.out.println("\n>>>총 점수는 : "+count+"점 입니다.<<<");
				if(count >= 80) {
					System.out.println("합격 입니다.\n");
				}else {
					System.out.println("불합격 입니다.\n");
				}
				break;
			case 2:
				System.out.println("/n::: 재시험을 시작합니다. :::");
				System.out.println("--------------------------------------------------------------");
				System.out.println("1. 윈도우즈 운영체제의 '명령 프롬프트'에서 기본 명령어의 종류를 확인할 때 사용하는 명령어는 무엇인가?");
				System.out.println("① help | ② manual | ③ dir | ④ cmd");
				System.out.print("답 : ");
				int nun1 = sc.nextInt();
				if(nun1 == 1) {
					count2+=10;
				}else {
					count2+=0;
				}
				System.out.println("--------------------------------------------------------------");
				System.out.println("2. 사용자 측면에서의 요구사항이며 주로 기능 개선에 대한 내용으로, \n사용자가 원하는 목표를 위하여 시스템에서 수행해야 하는 내용을 기술하는 것을 무엇이라 하는가?");
				System.out.println("① 내비게이션 | ② 유즈케이스 | ③ 사용상 | ④ 정보구조");
				System.out.print("답 : ");
				int nun2 = sc.nextInt();
				if(nun2 == 2) {
					count2+=10;
				}else {
					count2+=0;
				}
				System.out.println("--------------------------------------------------------------");
				System.out.println("3. 데이터를 효과적으로 이용할 수 있도록 정리, 보관하기 위한 기본 소프트웨어로서 \n데이터베이스를 관리하기 위해 필요한 수행과정인 데이터의 추가, 변경, 삭제, 검색 등의 기능을 집대성한 소프트웨어 패키지를 무엇이라 하는가?");
				System.out.println("① JDBC | ② DBM | ③ DBA | ④ DBMS");
				System.out.print("답 : ");
				int nun3 = sc.nextInt();
				if(nun3 == 4) {
					count2+=10;
				}else {
					count2+=0;
				}
				System.out.println("--------------------------------------------------------------");
				System.out.println("4. 품질 요구사항 특성으로 알맞지 않은 것은?");
				System.out.println("① 기능성(Functionality) | ② 신뢰성(Reliability) | ③ 적절성(Suitality) | ④ 유지 보수성(Maintainability)");
				System.out.print("답 : ");
				int nun4 = sc.nextInt();
				if(nun4 == 3) {
					count2+=10;
				}else {
					count2+=0;
				}
				System.out.println("--------------------------------------------------------------");
				System.out.println("5. 연계 방식 분류에서 직접 연계가 아닌 것은?");
				System.out.println("① DB Link | ② JDBC | ③ 화면 링크 (Link) | ④ Socket");
				System.out.print("답 : ");
				int nun5 = sc.nextInt();
				if(nun5 == 4) {
					count2+=10;
				}else {
					count2+=0;
				}
				System.out.println("--------------------------------------------------------------");
				System.out.println("6. 트랜잭션(Transaction)의 특성으로 알맞지 않은 것은?");
				System.out.println("① 원자성 | ② 일관성 | ③ 지속성 | ④ 응용성");
				System.out.print("답 : ");
				int nun6 = sc.nextInt();
				if(nun6 == 4) {
					count2+=10;
				}else {
					count2+=0;
				}
				System.out.println("--------------------------------------------------------------");
				System.out.println("7. 다음 중 DML 문장이 아닌 것은?");
				System.out.println("① INSERT | ② UPDATE | ③ DROP | ④ DELETE");
				System.out.print("답 : ");
				int nun7 = sc.nextInt();
				if(nun7 == 3) {
					count2+=10;
				}else {
					count2+=0;
				}
				System.out.println("--------------------------------------------------------------");
				System.out.println("8. 소프트웨어 환경을 구축하기 위한 시스템 소프트웨어 중 \nJava 관련 응용 프로그램을 기동하기 위한 인터프리터 환경을 무엇이라 하는가?");
				System.out.println("① JVM | ② Web Server | ③ WAS | ④ 운영체제");
				System.out.print("답 : ");
				int nun8 = sc.nextInt();
				if(nun8 == 1) {
					count2+=10;
				}else {
					count2+=0;
				}
				System.out.println("--------------------------------------------------------------");
				System.out.println("9. 애플리케이션 배포 단위로 알맞지 않은 것은?");
				System.out.println("① jar | ② war | ③ ear | ④ release");
				System.out.print("답 : ");
				int nun9 = sc.nextInt();
				if(nun9 == 4) {
					count2+=10;
				}else {
					count2+=0;
				}
				System.out.println("--------------------------------------------------------------");
				System.out.println("10. 테스트 기법으로 알맞지 않은 것은?");
				System.out.println("① 휴리스틱 평가 | ② 페이퍼 프로토타입 평가 | ③ 선호도 평가 | ④ 효능 평가");
				System.out.print("답 : ");
				int nun10 = sc.nextInt();
				if(nun10 == 4) {
					count2+=10;
				}else {
					count2+=0;
				}System.out.println("\n>>>재시험 점수는 : "+count2+"점 입니다.<<<");
				if(count2 >= 80) {
					System.out.println("합격 입니다.\n");
				}else {
					System.out.println("불합격 입니다.\n");
				}
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				status = false;
				break;
			}
			
		}//while
		}//메소드
	}//클래스
