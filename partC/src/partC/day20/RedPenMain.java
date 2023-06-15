package partC.day20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import partC.day18.example.RedPen;

public class RedPenMain {
      //day18 예제에서 배열 사용을 ArrayList로 바꾸겠습니다.
    public static void main(String[] args) {
        
       
         System.out.println("초등학교 2학년을 위한 2자리 사칙연산 문제 프로그램 빨간펜 입니다.");
         System.out.println("---------------------------");
         System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
         System.out.println("---------------------------");
         
         Scanner sc = new Scanner(System.in);
         RedPen[] redPens = new RedPen[5];
         //앞으로 List 선언은 인터페이스 타입으로 선언
        List<RedPen> probs =new ArrayList<>(); //업캐스팅 . 이 객체는 List에 정의된 메소드만 실행 가능
         int result = 0;
         int count = 0;
         
         System.out.println("시작합니다.");
         //첫번째 반복문 문제 갯수만큼
         //1.RedPen 객체 생성해서 참조값을 배열에 대입
         for (int i = 0; i < redPens.length; i++) {
            //redPens[i] = new RedPen('+'); //커스텀 생성자 char을 입력받아서 연산자를 '+'로 준것.
            probs.add(new RedPen('+'));
            //redPens[i].make();   //make() 메소드에 난수값 저장한것.
            probs.get(i).make();
            //2.1번의 객체를 이용해서 문제를 만들고 화면에 출력
            System.out.print("문제"+(i+1)+"번 : " + probs.get(i).problem());
         //   System.out.print(String.format("문제 %d. 답 입력 >>>", i+1,probs.get(i).make()));
            //3.사용자 답 입력하기
            result = sc.nextInt();
            //4.3번에 입력값으로 정답 여부를 판단해서 isCorrect 필드에 값을 저장
            //(정답은 true, 오답은 false)
            //두번째(그냥 한번에 쓴거임) 반복문 배열에 저장된 문제 중에 오답만 문제와 정답을 출력하기
            if(result == probs.get(i).answer()) {
               probs.get(i).setCorrect(true);
               count+=1;
            }else {
               probs.get(i).setCorrect(false);
            }
         }//첫번째 for문
         System.out.println("채점합니다. 맞은 갯수 "+count+"("+count*20+")점");
         System.out.println(":::틀린 문제 정답보기:::");
         for (int i = 0; i < redPens.length; i++) {
            if(probs.get(i).isCorrect() == false) {
               System.out.println("문제"+(i+1)+". "+probs.get(i).problem()+probs.get(i).answer());
               //n1 + " " + op + " " + n2 + " = ";
               //첫번째수 기호 두번째수 =
               // 1+2=
            }
            
        }
   
    }
   }
