package sub4;



public class Sedan extends Car {

	private int cc; // 배기량
	
	public Sedan(String name, String color, int speed, int cc) {
		super(name, color, speed); // 부모 Car의 생성자 호출 : 컨트롤 누르고 커서 슈퍼에 올리기
		this.cc=cc;
	}

	public void drive() {
		System.out.println("sedan drive!!!");
		System.out.println("차량 배기량 : " + this.cc);
		super.show(); // 부모(super)의 show() 호출
		
	}
	
	
}
