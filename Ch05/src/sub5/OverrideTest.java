package sub5;

import javax.swing.colorchooser.ColorChooserComponentFactory;

/*
 * 날짜 : 2026/05/04
 * 이름 : 홍유원
 * 내용 : Java overriding 실습
 */



class AAA {
	public void method1() {
		system.out.println("AAA:method1...");
		}

	public void method2() {
		system.out.println("AAA:method1...");
		}
	public void method3() {
		system.out.println("AAA:method1...");
		}
}

class BBB extends AAA {

	@Override
	public void method1() {
		system.out.println("BBB:method1...");
		}
	@Override
	public void method2() {
		system.out.println("BBB:method1...");
		}
	public void method3() {
		system.out.println("BBB:method1...");
		}
}

class CCC extends BBB{
	//@Override 이노테이션 - Override 메서드를 표시하는 키워드, 기능은 없음
	public void method1() {
		system.out.println("CCC:method1...");
		}

	public void method2() {
		system.out.println("CCC:method1...");
		}
	public void method3(int a, int b) {
		system.out.println("CCC:method1...");
		}
}
	
public class OverrideTest {

	public static void main(String[] args) {
		CCC c = new CCC();
		
		c.method1();
		c.method2();
		c.method3();
		c.method3(1);
		c.method3(1,2);
		
		
		//Car Override 매서드 실습
		sedan avante - new Sedan("아반테","흰색", 0, 1500);
		avante.speedUp(260);
		avnte.drive();
		
		Truck poter = new Truck("포터", "흰색", 0, 0);
		poter.speedUp(200);
		poter.show();
		
	}
