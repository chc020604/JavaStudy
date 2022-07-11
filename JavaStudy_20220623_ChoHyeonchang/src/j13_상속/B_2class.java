package j13_상속;

public class B_2class extends Aclass {
	private int number;
	
	public B_2class() {
		System.out.println("B_2 생성");
		System.out.println(super.number); //부모 상속 넘버
		
		// 그냥 number를 쓸 수도 있지만 알아보기 어렵기에 부모에게 상속받았다는 증거로 super.을 붙혀준다
		
		System.out.println(this.number); //B2클래스 자신의 넘버
	}
}
