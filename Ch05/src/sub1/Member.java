package sub1;

public class Member {

	//속성
	String name;
	int age;
	boolean isActive;
	
	
	//메서드
	public void activate() {
		this.isActive = true;	
	}
	
	public void deactivate() {
		isActive = false;
	}
	public boolean isadult() {
		if(age >= 20) {
			return true;
		}else {
			return false;

		
		}
	}
	
	public void show() {
		System.out.println("이름 : " );
		System.out.println("나이 : " );
		System.out.println("이름 : " );
	}
}



