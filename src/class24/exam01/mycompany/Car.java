package class24.exam01.mycompany;

import class24.exam01.hankook.SnowTire;
import class24.exam01.hyundai.Engine;
import class24.exam01.kumho.BigwidthTire;
import class24.exam01.kumho.Tire;

//import class24.exam01.hankook.SnowTire;
//import class24.exam01.hyundai.Engine;
//import class24.exam01.kumho.BigwidthTire;

//import class24.exam01.hankook.SnowTire;
//import class24.exam01.hyundai.Engine;
//import class24.exam01.kumho.BigwidthTire;


public class Car {

	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigwidthTire tire2 = new BigwidthTire();
	
	
	Tire tire10 = new Tire(); 	// kumho 같은 클래스 타입으로 두개의 import가 안된다 :
	Tire tire11 = new Tire(); 	// kumho 패키지의 Tire를 쓰려면 아래와 같이 복잡한 과정을 거처야 한다
	
	
	class24.exam01.kumho.Tire tire3 = new class24.exam01.kumho.Tire();
	class24.exam01.hankook.Tire tire4 = new class24.exam01.hankook.Tire();

	public static void main(String[] args) {
		Car myCar = new Car();
	}
}
