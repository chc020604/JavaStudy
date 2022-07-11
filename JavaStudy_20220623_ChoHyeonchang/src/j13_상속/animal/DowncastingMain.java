package j13_상속.animal;

public class DowncastingMain {   //업캐스팅이 된 것만 다운캐스팅이 될 수 있다.
	
	public static void main(String[] args) {
		Animal[] animals = new Animal[3];
		
		animals[0] = new Animal();  //animal이 animal로 다운캐스팅이 될 수 없다
		animals[1] = new Human();	//animal이 human으로 다운캐스팅 될 수 있지만 Tiger로 다운캐스팅 될 수는 없다.
		animals[2] = new Tiger();
		
		for(int i = 0; i < animals.length; i++) {
			animals[i].move();
		}
		
		System.out.println();
		
		for(int i = 0; i < animals.length; i++) {
			if(animals[i] instanceof Human) {
			Human human = (Human) animals[i];	
			human.readBooks();
			
			}else if(animals[i] instanceof Tiger) {
				Tiger tiger = (Tiger) animals[i];
				tiger.hunting();
				
			}else {
				System.out.println("Downcasting 하지 않음");
			}
				
		}
	
	}

}
