package j06.조건;

public class IfElse1 {

	public static void main(String[] args) {
		int num = 6;
		
		int num2 =
				5;
		
		// 명령어를 여러게 한번에 사용하려고 하면 중괄호로 묶어줘야 한다.
		
		if(num > 5) {
			System.out.println("5보다 큽니다.");
			System.out.println("현재 num변수의 값은" + num + "입니다");
		
		}else {
			System.out.println("5보다 크지 않습니다.");

//      if가 없으면 else는 쓸 수 없다, 하지만 if는 혼자 쓸 수 있다.
//      [= if(num <= 5) System.out.println("5보다 크지 않습니다."); ]
		}
		
		
	}

}
