package TeamHomework;

public class OOP {
	public static void main(String[] args) {
		
//각자 조사해온 분야의 개념 중 문제에 사용할 개념을 정해서 작성 후 출제
	//ex) 캡슐화에 대해 문제를 낸다고 가정
		/*
			사용할 개념
				- 접근제어자를 사용한 데이터 은닉
		  		- 메소드 캡슐화
		  		- 등등...
		 */
		
		/*
			문제 (문제, 조건 및 예시 등 지문으로 작성)
			▶ 새로운 홈페이지 로그인 창을 만들려고 한다.
			   홈페이지 로그인 창에는 ID 와 password 를 입력하여 로그인하는 기능이 필요하다.
			   
			   알맞은 접근 제어자를 사용하여 ID , password 를 선언하고,
			   로그인하는 기능을 캡슐화하여 logIn() 메소드로 작성하세요.
			   (단, 클래스명은 LogInWindow 로 한다.)
		 */
		///////////////////////////////////////////////////////////////////////
		/*
		public class LogInWindow {
			private String ID;
			private String password;
			
			public void getID(){
				return ID;
			}
			
			public void setID(String id){
				this.ID = id;
			}
			
			public void getPassword(){
				return password;
			}
			
			public void setPassword(String pw){
				this.password = pw;
			}
			
			protected void logIn(){
				System.out.println("로그인되었습니다.");
			}
		}
		*/
		///////////////////////////////////////////////////////////////////////

		
		
	//예시 끝----------------------------------------------
//		━━ 다형성 ━━ [승희]
		/*
			사용할 개념
				- 상속
		  		- 업캐스팅, 다운캐스팅
		  		- 오버라이딩
		  		- instanceOf
		*/		
		
		/*
			문제 (문제, 조건 및 예시 등 지문으로 작성)
			설명 ▶ 'Elementary' 클래스와 'HighSchool' 클래스가 'Teacher'클래스를 상속받고 
			 	  'sound()' 메소드를 오버라이딩하고 있는 예시입니다.
			문제 ▶ 'main' 메소드를 완성하세요. 
				 1) 'Teacher'클래스를 상속받은 'Elementary' 클래스와 'HighSchool' 클래스 업캐스팅하기
				 2) 업캐스팅 된 'Elementary' 클래스에서 'sound()'메소드 호출
				 3) 'instanceOf'와 '다운캐스팅'을 활용하여 'Elementary' 클래스에 'run()' 메소드 호출 
				 4) 'HighSchool' 클래스의 업캐스팅한 'sound()'메소드 호출 후 3)번과 동일하게 'raiseHand()' 메소드 호출
		*/
		
		// 코드를 각자 이클립스에서 구현 후 아래 주석 사이에 전체 내용 복붙
		///////////////////////////////////////////////////////////////////////
		/*
		class Teacher {
		    public void sound() {
		        System.out.println("선생님께서 수업을 진행하신다.");
		    }
		}

		class Elementary extends Teacher {
		    @Override
		    public void sound() {
		        System.out.println("초등학생이 수업시간에 떠든다.");
		    }
		    
		    public void run() {
		        System.out.println("초등학생이 정신없이 뛰어다닌다.");
		    }
		}

		class HighSchool extends Teacher {
		    @Override
		    public void sound() {
		        System.out.println("고등학생이 질문을 한다.");
		    }
		    
		    public void raiseHand() {
		        System.out.println("고등학생이 질문을 하려고 손을 든다.");
		    }
		}

		public class CastingExample {
		    public static void main(String[] args) {
		     
		       Teacher teacher1 = new Elementary();
		       Teacher teacher2 = new HighSchool();
		    
		       teacher1.sound(); // "초등학생이 수업시간에 떠든다." 출력

		        
		        if (teacher1 instanceof Elementary) {
		            Elementary elementary = (Elementary) teacher1; // 다운캐스팅
		            elementary.run(); // "초등학생이 정신없이 뛰어다닌다." 출력
		        }
		        
		        teacher2.sound(); // "고등학생이 질문을 한다." 출력
		        
		        if (teacher2 instanceof HighSchool) {
		            HighSchool highSchool = (HighSchool) teacher2; // 다운캐스팅
		            highSchool.raiseHand() ; // "고등학생이 질문을 하려고 손을 든다." 출력
		        }
		    }
		}
		*/
		///////////////////////////////////////////////////////////////////////
		//예시 끝----------------------------------------------
		
//		━━ 캡슐화 ━━ [재민]
		/*
			사용할 개념
				- 
		  		- 
		 */
		
		/*
			문제 (문제, 조건 및 예시 등 지문으로 작성)
			▶ 
		 */
		
		// 코드를 각자 이클립스에서 구현 후 아래 주석 사이에 전체 내용 복붙
		///////////////////////////////////////////////////////////////////////
		
		
		///////////////////////////////////////////////////////////////////////
		
		
//		━━ 상속 ━━ [혜림]
		/*
			사용할 개념
				- 
		  		- 
		 */
		
		/*
			문제 (문제, 조건 및 예시 등 지문으로 작성)
			▶ 
		 */
		
		// 코드를 각자 이클립스에서 구현 후 아래 주석 사이에 전체 내용 복붙
		///////////////////////////////////////////////////////////////////////
		
		
		///////////////////////////////////////////////////////////////////////
		
		
//		━━ 추상화 ━━ [종협]
		/*
			사용할 개념
				- 
		  		- 
		 */
		
		/*
			문제 (문제, 조건 및 예시 등 지문으로 작성)
			▶ 
		 */
		
		// 코드를 각자 이클립스에서 구현 후 아래 주석 사이에 전체 내용 복붙
		///////////////////////////////////////////////////////////////////////
		
		
		///////////////////////////////////////////////////////////////////////
		
		
		
	
		
		
	//위에서 다룬 내용들을 종합하여 종합 문제 작성 후 출제
		//종합문제
		
		
		
		
		
		
		
		
		
	}//main end
}//main class end
