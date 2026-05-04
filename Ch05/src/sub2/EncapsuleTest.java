package sub2;


/**
 *  날짜 : 2025/04/29
 *  이름 : 홍유원
 *  내용 : Java 캡슐화 실습
 */
public class EncapsuleTest {

	public static void main(String[] args) {
		
		// 객체 생성
		Car sonata = new Car("소나타", "흰색", 0);  // sonata - 외부변수, 참조변수 // 생성자 초기화
		
		Car avante = new Car("아반테", "검정", 0); 
		
		// 세터 초기화
		avante.setBrand("아반테");  // 안전하게 세터로 수정
		avante.setColor("검정");
		avante.setSpeed(0);
		
		System.out.println("차량명 : " + avante.getBrand());
		System.out.println("차량색 : " + avante.getColor());
		System.out.println("현재속도 : " + avante.getSpeed());
		
		// 객체 초기화 -> 캡슐화된 속성을 생성자로 초기화
		//sonata.Brand = "소나타";
		//sonata.Color = "흰색";
		//sonata.Speed = 0;
		
		// 속성값 수정
		sonata.setColor("은색");
		
		sonata.show();
		avante.show();
		
		
		//Account 객체 생성
		Account kb = new Account("국민은행", "101-12-1110", "김유신", 10000); 
		Account wr = new Account("우리은행", "101-12-2220", "김춘추", 20000);
		kb.show();
		wr.show();
		
		
		//book 객체 생성
		Book = new Book 
		
		
		
		//Member 객체 생성
		Member kim = new Member("김유신", 23, false);
		Member lee = new Member("이순신", 33, true);
		
		
		/*
		 <속성>
		- title (String): 영화 제목
		- director (String): 감독 이름
		- rating (double) : 영화 평점(0.0 ~ 10.0 사이의 값)
		- availableSeats (int) : 예약 가능한 좌석 수
		
		<생성자>
		- 모든 인스턴스 변수를 초기화하는 생성자
		
		<매서드>
		reserveSeat()
		- 예약 가능한 좌석이 있으면 availableSeats를 1 감소시키고 true를 반환
		- 예약 가능한 좌석이 없으면 false를 반환
		
		cancelReservation()
		- availableSeats를 1 증가
		
		showDetails()
		- 모든 멤버 변수 값을 출력
		*/
		
	}
}
