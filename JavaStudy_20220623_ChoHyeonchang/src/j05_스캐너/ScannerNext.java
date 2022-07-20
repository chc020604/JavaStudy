package j05_스캐너;

import java.util.Scanner;

public class ScannerNext {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//null: 문자열의 값이 비었다.
		String str1 = null;
		String str2 = null;
		char c = 0;
		int i = 0;
		double d = 0;
		boolean b = false;
		
		
	//next는 띄어쓰기를 사용하면 다음 스케너로 넘어감
	//nextLine은 띄어쓰기,엔터(줄바꿈)를 포함하는 거라 다음 스케너로 안 넘어감
		
		System.out.print("문자열(s, e -> x): ");
		str1 = scanner.next();
		scanner.nextLine(); //버퍼를 비움
		
		System.out.print("문자열(s, e -> o): ");
		str2 = scanner.next();
		
		System.out.print("문자: ");
		c = scanner.next().charAt(0);
				
		System.out.print("정수: ");
		i = scanner.nextInt();
		
		System.out.print("실수: ");
		d = scanner.nextDouble();
		
		System.out.print("논리: ");
		b = scanner.nextBoolean();
		
		System.out.println();
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(c);
		System.out.println(i);
		System.out.println(d);
		System.out.println(b);
		
	}

}
