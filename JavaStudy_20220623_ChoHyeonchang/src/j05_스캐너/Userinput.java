package j05_스캐너;
import java.util.Scanner;

public class Userinput {

	public static void main(String[] args) {
		
		
		/*
		 * name
		 * age
		 * birthday(2002 06 04)
		 * phone
		 * email
		 * address
		 * gender
		 * 
		 */

		//여러곳에 커서 지정 하는 방법 (alt + 클릭)
		
		Scanner scanner = new Scanner(System.in);
		//scanner 사용 할 때 꼭 처음에 적혀야 하는 것
		
		String name = null; //null: 문자열의 값이 비었다.(= 0 )
		int age = 0;
		String birthday = null;
		String phone = null;
		String email = null;
		String address = null;
		char gender = 0;
// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ		
		
		System.out.print("이름: ");
		name = scanner.next();
		
		System.out.print("나이: ");
		age = scanner.nextInt();
		scanner.nextLine(); //nextLine 이전에 nextLine이 아닌게 있으면 무조건 적어줘야함
		                    //(버퍼안에 엔터를 지우는 작업)
		
		System.out.print("생년월일: ");
		birthday = scanner.nextLine();
		
		System.out.print("연락처: ");
		phone = scanner.next();
		
		System.out.print("이메일: ");
		email = scanner.next();
		scanner.nextLine(); //nextLine 이전에 nextLine이 아닌게 있으면 무조건 적어줘야함
                            //(버퍼안에 엔터를 지우는 작업)
		
		System.out.print("주소: ");
		address = scanner.nextLine();
		
		System.out.print("성별: ");
		gender = scanner.next().charAt(0);
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
		System.out.println();
		
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("생년월일: " + birthday);
		System.out.println("연락처: " + phone);
		System.out.println("이메일: " + email);
		System.out.println("주소: " + address);
		System.out.println("성별: " + gender);
	}

}
