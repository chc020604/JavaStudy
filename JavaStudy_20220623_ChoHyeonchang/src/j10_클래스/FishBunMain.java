package j10_클래스;

public class FishBunMain {
//자료형은 변수를 담을 수 있는 크기
	public static void main(String[] args) {
		
		new FishBun();
		FishBun fishbun = new FishBun();  //생성
		FishBun fishbun2 = new FishBun(); //생성
		
		System.out.println(fishbun);
		System.out.println (fishbun2);
		
		fishbun.material = "팥";  //.을 찍으면 이 주소로 찾아가라 라는 뜻임
		fishbun2.material = "슈크림";
		
		System.out.println(fishbun.material);
		System.out.println(fishbun2.material);
		}

}
