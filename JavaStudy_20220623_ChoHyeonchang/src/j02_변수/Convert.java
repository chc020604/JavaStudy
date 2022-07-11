package j02_변수;

public class Convert {

	public static void main(String[] args) {
		int num1 = 10;
		double dNum1 = num1;     // 묵시적 형변환 (업캐스팅)
		int num2 = (int) dNum1;  // 명시적 형변환 (다운캐스팅)
		char c = (char) num2;
		
		System.out.println("정수: " + num1);
		
		System.out.println("실수: " + (int) dNum1);
		// 다운캐스팅 시 소수점 이하의 데이터 손실이 일어났음
		

	}

}
