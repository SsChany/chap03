package class26.exam05;

public class Calcu01Main {

	public static void main(String[] args) {

		int x = 10;
		int y = 20;
		double x1 = 10.5;
		double y1 = 20.0;

		// 계산기 객체 생성
		Calcu01 ca = new Calcu01();

		// 정수합산
		int intSum = ca.sum(x, y);
		// 실수합산
		double doubleSum = ca.sum(x1, y1);

		System.out.printf("정수 %d와 %d의 합산 결과는 %d 입니다\n", x, y, intSum);
		System.out.printf("실수 %.1f와 %.1f의 합산 결과는 %.1f 입니다", x1, y1, doubleSum);

	}

}
