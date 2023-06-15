package partB.day12;

public class B01MySimpleMathExam {
   public static void main(String[] args) {
      //자바의 Math 클래스처럼 MySimpleMath 테스트하기
      // - 클래스 메소드 정의해서 테스트 - 메소드 오버로딩
      
      int result = MySimpleMath.add(23, 45);
      System.out.println("MySimpleMath.add() = " + result);
      System.out.println("MySimpleMath.subtract(23, 45)=" + MySimpleMath.subtract(23, 45));
      System.out.println("MySimpleMath.multiply(23, 45)=" + MySimpleMath.multiply(23, 45));
      System.out.println("MySimpleMath.divide(23, 45)=" + MySimpleMath.divide(23, 45));
      System.out.println("MySimpleMath.remaind(23, 45)=" + MySimpleMath.remaind(23, 45));
      
      double dresult = MySimpleMath.add(23.54, 45.19);
      System.out.println("MySimpleMath.add() = " + dresult);
      System.out.println("MySimpleMath.subtract()=" + MySimpleMath.subtract(23.54, 45.19));
      System.out.println("MySimpleMath.multiply()=" + MySimpleMath.multiply(23.54, 45.19));
      System.out.println("MySimpleMath.divide()=" + MySimpleMath.divide(23.54, 45.19));
      
      System.out.println("static 필드 확인");
      System.out.println("MySimpleMath.pi =" + MySimpleMath.pi);
      //MySimpleMath.pi = 3.15; 오류
      
      System.out.println("MySimpleMath.test =" + MySimpleMath.test);
      MySimpleMath.test = 3.15;  //변경 가능
      System.out.println("MySimpleMath.test(변경 후) =" + MySimpleMath.test);
      
      //String 클래스 메소드의 오버로딩 확인하기
      System.out.println(String.valueOf(true));
      System.out.println(String.valueOf(1234));
      System.out.println(String.valueOf(12.34));
      String doubleToString = String.valueOf(12.34);
      System.out.println(doubleToString);
      char[] testArray = {'a','1','*',' '};
      System.out.println(String.valueOf(testArray));
      System.out.println(String.valueOf(testArray,2,1));
      
   }

}