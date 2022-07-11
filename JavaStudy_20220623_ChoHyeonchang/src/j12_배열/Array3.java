package j12_배열;

import j10_클래스.Phone;

public class Array3 {

	public static void main(String[] args) {
		Phone[] phones = new Phone[10]; //해당 클래스에 주소를 넣는 공간 (10개를 만들었음)
		for(int i = 0; i < phones.length; i++) {
			System.out.println(phones[i]);
		}

		for(int i = 0; i < phones.length; i++) {
			phones[i] = new Phone();
		}
		
		phones[2].setCompany("삼성");
		phones[5].setCompany("LG");
		phones[7].setCompany("애플");
		
		for(int i = 0; i < phones.length; i++) {
			if(phones[i].getCompany() == null) {
				continue;
			}
			phones[i].showInfo(); 
			
		}
		
	}

}
