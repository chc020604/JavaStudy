package j18_lombok;

//스네이크 표기법 사용 해야 함.

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Student {
	private int student_code;
	private String student_name;
	private String student_address;
	
}
