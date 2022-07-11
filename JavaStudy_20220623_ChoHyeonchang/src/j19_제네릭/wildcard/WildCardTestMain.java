package j19_제네릭.wildcard;

import j14_추상.Human;
import j14_추상.Animal;
import j18_lombok.Student;

public class WildCardTestMain {
	// <?>라는 건 나는 다양한 자료형을 사용하겠다는 뜻(String등을 고정하는게 아니라)
	public WildCardTest<?> test(int index){ 
		if(index == 0) {
			return new WildCardTest<Integer>(100); // <>안을 비워줘도 정상적으로 실행이 된다.
		}else if(index == 1) {
			return new WildCardTest<Boolean>(true);
		}else if(index == 2) {
			return new WildCardTest<String>("문자열");
		}else if(index == 3){
			return new WildCardTest<>(Student.builder().student_code(10).build());
		}else {
			return new WildCardTest<>(null); //<>안을 비워주면 오브젝트 타입으로 잡힌다.
		}
	}
						//와일드 카드를 사용 하는데 Animal에서 상속된 것만 가능하게 함
	public WildCardTest<? extends Animal> test2() { 
		return new WildCardTest<>(new Human());
	}
	
	public static void main(String[] args) {
		WildCardTestMain testMain = new WildCardTestMain();
		
		System.out.println(testMain.test(0));
		Student s = (Student) testMain.test(3).getData(); 
					//Student 객채로 바꾸려면 꼭 다운캐스팅을 해줘야 한다 -> (Student)
		System.out.println(s.getStudent_code());
		
		((Human) testMain.test2().getData()).readBooks();;
	}

}
