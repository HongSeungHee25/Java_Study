##수업 내용 요약

### day17 (5.15)

#### InterfaceA.java
+ 인터페이스 정의 형식
+ 상수필드 public static final , 추상메소드 public abstract : 키워드 생략
+ 인스턴스 메소드 : default 키워드 작성
+ 상수, *추상메소드*, 인스턴스 메소드, static 메소드만 포함하며 모두 접근 한정자 public 입니다.
(*인스턴스 필드*는 인터페이스에 없습니다.)

#### ClassA.java
+ InterfaceA 의 구현 클래스 정의
+ 추상메소드는 모두 정의(구현,implements) 했습니다.

#### C01InterfaceATest.java
+ ClassA 객체 생성
+ 인터페이스 타입으로 변수 선언하는 연습했습니다.

#### beable 패키지
+ Runnable , Thinkable , Cookable 인터페이스 정의
+ 구현 클래스 AI , Dog , People 정의
+ BeAble 인터페이스 정의하여 Runnable , Thinkable ,
Cookable 의 부모 인터페이스로 수정하고 테스트
+ BeAble 인터페이스의 default 메소드 역할 테스트(소스파일 주석 참고하세요.)

#### C02BeAbleTest.java
+ beable 패키지의 구현클래스 객체 생성
+ 인터페이스를 사용한 다형성 연습 : 구현 클래스의 타입체크

#### C03ComparToTest.java
+ 기본형 타입 데이터 비교 : 관계연산 < , >
+ String 타입 데이터 비교 : compareTo 메소드

#### C04MemberCompareTest.java
+ 기본형, String 타입처럼 객체의 비교를 위한 연습
+ Comparable 인터페이스의 compareTo 메소드를 재정의하는 연습
	+ Member 클래스에서 연습 - 비교할 특정 필드를 지정.   
		+ 단점 : 비교할 필드를 고정시켜야 합니다.(name 또는 age 필드 선택)    
		+ 수정사항 : 비교하는 실행시점(Runtime)에서 필드를 정하도록 다른 인터페이스를 사용할 예정.
+ Member 클래스 객체를  compareTo 메소드로 비교

#### C05MySort.java
+ 비교를 사용되는 대표적인 메소드 sort(정렬) 알고리즘 연습
+ 선택 정렬. 인덱스 0부터 시작 가장 작은 값을 순서대로 찾는 방법
+ 정렬 방식 : 기본은 오름차순(작은값 => 큰값) , 내림차순(큰값 => 작은값)

## <참고>

### 다형성을 애플리캐이션에서 구현한다면 필요한 개념들은 아래와 같습니다.

+ 상속 또는 인터페이스 
+ 메소드 오버라이딩(재정의 또는 구현)
+ 업캐스팅 : 자식 클래스 또는 인터페이스의 구현클래스 객체를 부모 타입 변수(배열) 또는
인터페이스 타입 변수(배열)에 참조. 배열은 이후에 다양한 자료구조로 변경되어 데이터를 저장.
+ 다운캐스팅 : 업캐스팅했던 객체를 실제 객체 타입으로 변환.(타입 체크는 InstanceOf 연산)

<hr/>

### day18 (5.16)

#### 참고 : 참조 타입 배열(또는 리스트)의 sort 알고리즘
+ 비교와 교환이다.
+ 비교는 참조타입의 경우 어떤 기준으로 할 것인지 필드를 정해야 한다.(기본형 C03CompareToTest.java 참고)
	+ String 클래스는 필드가 value 변수 1개 이므로 이를 이용하여 이미 재정의 되어 있다.
		+ 개발자가 만든 클래스는 특정 필드를 정해 주어야 한다.
	
+ Comparable 인터페이스는 비교할 객체의 클래스에 미리 compareTo 를 재정의 해야 한다.
+ Comparator 인터페이스는 실행 시점에서 비교 기준 필드를 compare 메소드에서 정한다. 아래 3가지 방법으로 구현 완료!
	+ 1번째 방법 => Comparator 익명 클래스로 구현해서 인터페이스 타입 변수에 대입시킨 후 sort 메소드 2번째 인자는 변수로 지정
		+ 2번째 방법 => Comparator 구현 클래스로 정의해서 sort 메소드 2번째 인자는 구현 클래스 객체 생성(new연산)으로 지정
		+ 3번째 방법 => Comparator 타입의 sort 메소드 2번째 인자를 익명 클래스 객체 생성으로 바로 지정








