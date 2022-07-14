package j21_익명.익명메소드;

public class sub {

	public static void main(String[] args) {

		PlusOperation2 subOperation2 = (int a, int b) -> {return a - b;};
		System.out.println(subOperation2.sub(10,20));
		
		
	}

}
