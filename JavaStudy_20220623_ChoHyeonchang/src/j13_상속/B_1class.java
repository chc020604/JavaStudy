package j13_상속;

public class B_1class extends Aclass {
	
	public B_1class() {
//      super(); 부모 클래스(부모를 가르키는 명령어) , 현재 생략 되어있음 , 
//	  (= new Aclass)   무조건 자식 클래스 보다 먼저 실행 되어야 한다
//     		
		
		System.out.println("B_1 생성"); // 자식클래스
		System.out.println(str);
	}
	
	

}
