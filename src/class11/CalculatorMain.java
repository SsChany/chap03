package class11;

public class CalculatorMain {

	public static void main(String[] args) {

		//1. 계산기(Calculator) 객체 생성
		Calculator myCalc = new Calculator();
		
		//2. 계산기 전원 켜기 powerOn() 메소드 호출
		// 전달받는 값이 없으므로 메소드만 호출하면 됨.
		myCalc.powerOn();

		//3.덧셈
		//3-1. 덧셈 메소드 호출하면서 인자값으로 5와 6을 전달
		//3-2. 덧셈 결과를 반환 받아 result 변수에 대입
		int result = myCalc.plus(5, 6);
		System.out.println("덧셈 결과 :" + result);
		
		//전달할 값을 저장할 변수 선언
		int x = 10;
		int y = 4;
		
		//4. 나눗셈
		//4-1. 나눗셈에 사용할 숫자 변수 x와 y값 제공
		//4-2. 나눗셈 결과를 리턴 받아 result2 변수에 대입
		double result2 = myCalc.divide(x, y);
		System.out.println("나눗셈 결과  : " + result2);
		
		//5. 곱셈
		
		//6. 빼애애애앨셈
		int result4 = myCalc.subtraction(484,2);
		System.out.println("뺄셈 결과 : " + result4);
		
		//5. 계산기 전원 끄기
		//리턴값이 없는 powerOff() 메소드 호출
		myCalc.poweroff();
		
		
	}

}