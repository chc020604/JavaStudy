package j13_상속.animal;

public class DowncastingMain2 {   //업캐스팅이 된 것만 다운캐스팅이 될 수 있다.
	
	public static void main(String[] args) {
		Animal[] animals = new Animal[3];
		
		animals[0] = new Animal();  //animal이 animal로 다운캐스팅이 될 수 없다
		animals[1] = new Human();	//animal이 human으로 다운캐스팅 될 수 있지만 Tiger로 다운캐스팅 될 수는 없다.
		animals[2] = new Tiger();
		
		for(Animal animal : animals) { //forEach: 현재 인덱스가 필요한 경우 쓸 수 없음
			animal.move();
		}
		
		System.out.println();
		
		// for(Animal human : animals)
			
					
		    for(Animal a : animals) {
			if(a instanceof Human) {
			Human human = (Human) a;	
			human.readBooks();
			
			}else if(a instanceof Tiger) {
				Tiger tiger = (Tiger) a;
				tiger.hunting();
				
			}else {
				System.out.println("Downcasting 하지 않음");
			}
				
		}
	
	}

}
