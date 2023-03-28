package class03;

public class CarMain {

	public static void main(String[] args) {

		// Car 객체 생성
		Car myCar = new Car(); // 기본 생성자 호출

		// 필드의 초기값 읽기
		System.out.println("모델명(String) : " + myCar.model);
		System.out.println("색상명(String) : " + myCar.color);
		System.out.println("속도(int) : " + myCar.speed);
		System.out.println("출발여부(boolean) : " + myCar.start);
		System.out.println("최고속도(int) : " + myCar.maxSpeed);
		System.out.println();

		// myCar 객체의 필드에 값저장
		myCar.model = "제네시스";
		myCar.color = "다크블루";
		myCar.speed = 60;
		myCar.start = true;
		myCar.maxSpeed = 300;
		
		// 객체에 저장한 필드값 조회하기
		System.out.println("모델명(String) : " + myCar.model);
		System.out.println("색상명(String) : " + myCar.color);
		System.out.println("속도(int) : " + myCar.speed);
		System.out.println("출발여부(boolean) : " + myCar.start);
		System.out.println("최고속도(int) : " + myCar.maxSpeed);
	}
}
