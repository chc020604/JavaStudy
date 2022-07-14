package j21_익명.익명메소드;

public class LambadaTest {

	public static void main(String[] args) {
		
		// -> :new에서 생성과 앞에 있는 public int plus가 ->로 바뀐거라고 보면 된다
		//     (메소드를 딱 하나만 쓸 수 있다)
		PlusOperation plusOperation = (int a, int b) -> {return a + b; };
		System.out.println(plusOperation.sub(10, 20));
		
		PlusOperation2 subOperation = (int a, int b) -> {return a - b; };
		System.out.println(plusOperation.sub(40, 10));
		
		// 매개변수 타입 생략 가능
		PlusOperation2 subOperation2 = (a, b) -> {return a - b; };
		System.out.println(plusOperation.sub(40, 10));
		
		// 리턴 생략 가능 (조건 : 메소드 구변부에 return 외에는 다른 로직이 들어가면 안됨)
		// 		바로 리턴을 하고 싶은 경우에만 중괄호,리턴 생략 가능하다.(sysout같은게 들어가면 안됨)
		PlusOperation2 subOperation3 = (a, b) -> a - b;
		System.out.println(plusOperation.sub(40, 10));
		
		// 매개변수가 하나 있을 때 괄호도 생략 가능.
		PlusOperation3 subOperation4 = a -> a - 10 ;
		System.out.println(plusOperation.sub(40, 10));
	}

}
