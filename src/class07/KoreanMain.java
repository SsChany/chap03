package class07;

public class KoreanMain {

	public static void main(String[] args) {
		// korean 객체 생성
		Korean kor1 = new Korean("대한민국", "홍길동", "123456-7892837");
		
		// korean 객체 생성
		Korean kor3 = new Korean("김길동", "123456-71252837");

		// korean 객체의 값 읽기
		System.out.println("국적 : " + kor1.nation);
		System.out.println("성명 : " + kor1.name);
		System.out.println("주민번호 : " + kor1.ssn);
		System.out.println();

		// 두번째 korean 객체 생성
		Korean kor2 = new Korean("대한민국", "김철수", "951206-4687248");

		// korean 객체의 값 읽기
		System.out.println("국적 : " + kor2.nation);
		System.out.println("성명 : " + kor2.name);
		System.out.println("주민번호 : " + kor2.ssn);
		System.out.println();
		
		// korean 객체의 값 읽기
				System.out.println("국적 : " + kor3.nation);
				System.out.println("성명 : " + kor3.name);
				System.out.println("주민번호 : " + kor3.ssn);
	}

}
