package j10_클래스;

public class CarMain {

	public static void main(String[] args) {
		/*
		 * 차량 3대
		 * 
		 * 기아자동차
		 * k3
		 * 화이트
		 * 
		 * 현대자동차
		 * 쏘나타
		 * 블랙
		 * 
		 * BMW
		 * 520d
		 * 레드
		 * 
		 */

		Car car = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		
		car.company = "기아자동차";
		car.model = "k3";
		car.color = "화이트";
		
		car2.company = "현대자동차";
		car2.model = "쏘나타";
		car2.color = "블랙";
		
		car3.company = "BMW";
		car3.model = "520d";
		car3.color = "레드";
		
		car.showInfo();
		car2.showInfo();
		car3.showInfo();
			
	}

}
