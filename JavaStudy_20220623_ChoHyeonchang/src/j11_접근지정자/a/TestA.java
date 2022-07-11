package j11_접근지정자.a;
//접근지정자 종류 1.default 2.public 3.private 4.protected
public class TestA {
	private String name;	//변수명이 같을 땐 매개 변수가 우선순위이다.
	
	
	public TestA() {
		
	}
	public TestA(String name) {
		//기본생성자
		this.name = name;
		//this는 자기 자신의 주소를 의미 한다.
		System.out.println(this);
	}
	
	public void test() {
		System.out.println(name);
		
	}
}
