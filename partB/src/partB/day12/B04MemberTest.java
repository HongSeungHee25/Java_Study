package partB.day12;

import java.util.Arrays;

public class B04MemberTest {

	public static void main(String[] args) {
		Member momo = new Member();
		System.out.println("::momo 객체의 초기상태::");
		System.out.println(momo.getid()); 
		System.out.println(momo.getname());
		System.out.println(momo.getage()); 
		System.out.println(momo.getpoint());
		System.out.println(momo.getmessage());
		
		System.out.println("momo 객체의 필드값 set.....");
		momo.setid("momo");
		momo.setage(27);
		momo.setname("김모모");
		momo.setpoint(567.4);
		String[] msg = {"hi","hello","헬로우","하이"};
		momo.setmessage(msg);
		
		System.out.println("::momo 객체의 현재상태::");
		System.out.println(momo.getid()); 
		System.out.println(momo.getname());
		System.out.println(momo.getage()); 
		System.out.println(momo.getpoint());
		System.out.println(momo.getmessage());
		//배열값으로 문자열 리턴하는 메소드
		System.out.println(Arrays.toString(momo.getmessage()));	
		System.out.println(":::momo 객체 현재 상태:::");
		System.out.println(momo.member());
	}

}
