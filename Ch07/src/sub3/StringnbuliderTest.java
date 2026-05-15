package sub3;

/*
 * 
 * 날짜 : 2026/04/11
 * 이름 : 홍유원
 내용 : Java 내장클래스 실습 - StringBuilder
*/

public class StringnbuliderTest {
	 public static void main(String[] args) {
		
		 // string 불변성(immutable)으로 인한 메모리 낭비
		 String str = "Java";
		 System.out.println("str: " + str);
		 
		 str += "Programming";
		 System.out.println("str: " + str);
		 
		 // StringBulider로 메모리 절약
		 StringBuilder sb = new StringBuilder("java");
		 System.out.println("sb : " + sb.hashCode());
		 
		 sb.append("Programming");
		 System.out.println("sb : " + sb.hashCode());
	}

}
