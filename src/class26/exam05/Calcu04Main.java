package class26.exam05;

public class Calcu04Main {

	public static void main(String[] args) {
		
		int[] intArr = new int[5];
		intArr[0] = 15;
		intArr[1] = 15;
		intArr[2] = 15;
		intArr[3] = 15;
		intArr[4] = 15;
		
		double[] dbArr = new double[5];
		dbArr[0] = 15;
		dbArr[1] = 15;
		dbArr[2] = 15;
		dbArr[3] = 15;
		dbArr[4] = 15;
		
		// 계산기 객체 생성
		Calcu04 cal = new Calcu04();
		
		//계산기 객체의 오버로딩 메소드 호출
		int[] arr2 = cal.tenPlus(intArr);
		double[] arr3 = cal.tenPlus(dbArr);
		
		// 두 배열의 값을 출력하세요❤❤❤❤❤❤❤❤❤
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println();
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		
		
	}		
}