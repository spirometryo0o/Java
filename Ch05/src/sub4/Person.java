package sub4;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void work() {
		System.out.println("purson is working");
	}
	
	public void introduce() {
		System.out.println("제 이름은 [" + this.name + "] 이고 나이는 [" + this.age + "]세 입니다.");
	}
	
}
