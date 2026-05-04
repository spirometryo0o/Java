package sub1;

public class Book {

	/*
	 문제1. 아래 요구사항을 충족하는 Book 클래스를 정의하세요.
	 
	 <속성>
	 - title (String): 책 제목
	 - author (String): 저자 이름
	 - copies (int): 이용 가능한 복사본 수
	 */
	
	String title;
	String author;
	int copies;
	
	public boolean borrowBook() {
		
		if(copies > 0) {
			copies --;
			return true;
		}else {
			return false;
		}
	}	
		
	public void returnBook() {
		copies++;
	}	
		
	public void show() {
		System.out.println("책제목 : " + this.title); 
		System.out.println("책저자 : " + this.author);
		System.out.println("복사본 : " + this.copies);
	}
}
	
	 
	 

	

