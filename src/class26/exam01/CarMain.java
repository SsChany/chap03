package class26.exam01;

public class CarMain {

	public static void main(String[] args) {
		Car myCar1 = new Car("현대차"
				,"그랜저",2000,"white",99999,250,-120);
		System.out.println(myCar1.maker);
		System.out.println(myCar1.model);
		System.out.println(myCar1.cc);
		System.out.println(myCar1.color);
		System.out.println(myCar1.price);
		System.out.println(myCar1.maxSpeed);
		System.out.println(myCar1.speed);
		System.out.println();
		
		
		Car myCar2 = new Car("기아차","k9",3000,"black",959595,300,150);
		System.out.println(myCar2.maker);
		System.out.println(myCar2.model);
		System.out.println(myCar2.cc);
		System.out.println(myCar2.color);
		System.out.println(myCar2.price);
		System.out.println(myCar2.maxSpeed);
		System.out.println(myCar2.speed);
		
		//자동차 객체의 값 출력하는 또다른 방법 (showCarInfo 메소드)
		//첫번째 자동차 객체의 값 출력
		myCar1.showCarInfo();
		System.out.println();
	
		myCar2.showCarInfo();
	
	}

}
