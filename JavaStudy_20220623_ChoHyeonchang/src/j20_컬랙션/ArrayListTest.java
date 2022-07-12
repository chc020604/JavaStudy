package j20_컬랙션;

public class ArrayListTest {

	public static void main(String[] args) {
		/*
		 * numbers 10개의 공간을 가진 배열을 만든다. 10개의 공간에는 1,0,4,3,2
		 * 
		 * 값 5를 찾아서 제거를 하고 뒤에 있는 값들을 앞로 정렬하는 프로그램을 작성하시오 값 5를 제거한다는 의미는 0으로 만들다는 의미이다 정렬
		 * 후에 마지막 인덱스의 값은 0이어야 한다.
		 * 
		 */
		// {1, 4, 3, 2, 0}
		int[] numbers = { 1, 5, 5, 3, 2, 5, 7, 6, 5, 8, 9 };
		int n = 10;
		int[] numbers2 = new int[n];

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 5) {
				for (int j = i; j < numbers.length; j++)
					if (j != numbers.length - 1) {
						numbers[j] = numbers[j + 1];
					} else {
						numbers[j] = 0;
					}

				
				}
					if (numbers[i] == 5) { // 1번 5 뒤에 바로 5가 오면 결과를 냈을 때 5가 하나 살아 남아있게된다.
					i--;                   // -> 한 칸 뒤로 옮겨서 다시 재검을 한다.

			}

			// break; //만약에 배열중에 5가 여러개 있을 때
			// break를 안 걸면 배열 중 5를 다 0으로 바꾸어 버림
			int[] numbers2 = null;

			for (int i = 0; i < numbers.length; i++) {
				if (numbers[numbers.length - i - 1] != 0) {
					numbers2 = new int[numbers.length - i];
					for (int j = 0; j < numbers2.length; j++) {
						numbers2[j] = numbers[j];
					}
					break;
				}

			}
		}

		for (int num : numbers) {
			System.out.print(num);
		}
		System.out.println();

		for (int num : numbers2) {
			System.out.print(num);
		}
	}
}
