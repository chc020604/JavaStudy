package j13_상속.animal;

public class AnimalMain {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Animal human = new Human();      //업캐스팅
		Animal tiger = new Tiger();
		System.out.println();
		
		double d = 10;
		
		animal.move();
		human.move();
		tiger.move();
		System.out.println();
		
//		human.readBooks();
//		tiger.hunting();

	}

	
}
