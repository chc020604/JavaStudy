package j13_상속.animal;

public class ForEach {

	public static void main(String[] args) {
		String[] names = new String[4];
		names[0] = "김준일";
		names[0] = "김준이";
		names[0] = "김준삼";
		names[0] = "김준사";
		
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		String name = names[0];
		System.out.println(name);
		name = names[1];
		System.out.println(name);
		
		System.out.println();
		
		for(String n : names) {
			System.out.println(n);
		}
		
		

	}

}
