package partB.day13;

import java.util.Random;

//작성자 - 홍승희
public class B05ScoreWhileTest2 {
	
	public static void main(String[] args) {
		//Score 배열을 선언해서 구현해보기 
		//1) 선언해놓은 점수로 출력하기
		
		Score[] zoo = new Score[5];
	
		Score dog = new Score("뽀삐",95,85,98);
		Score cat = new Score("제리",92,100,87);
		Score monkey = new Score("숭숭",85,95,74);
		Score tiger = new Score("아호",75,97,86);
		Score Panda = new Score("러바오",100,65,81);
		
		zoo[0] = dog;
		zoo[1] = cat;
		zoo[2] = monkey;
		zoo[3] = tiger;
		zoo[4] = Panda;
		
		System.out.println(":::배열의 참조하는 객체의 필드값 출력:::");
		for(int i = 0; i < zoo.length; i++) {
			if(zoo[i] != null)
				System.out.println(zoo[i].member());
		}
		//2) 랜덤으로 점수 줘서 출력하기
		System.out.println("★☆★☆★☆랜덤으로 출력하기★☆★☆★☆");
		Random random = new Random();
		
		for(int i = 0; i < zoo.length; i++) {
			int korea = random.nextInt(101);
			int english = random.nextInt(101);
			int science = random.nextInt(101);
			
			if(zoo[i] != null) {
				zoo[i].setkorea(korea);
				zoo[i].setenglish(english);
				zoo[i].setsciense(science);
				System.out.println(zoo[i].member());
			}else {
				System.out.println("zoo["+i+"] is null");
			}//else 
		}//for
	}//main
}//clsee
