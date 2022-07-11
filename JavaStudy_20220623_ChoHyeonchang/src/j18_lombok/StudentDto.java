package j18_lombok;

//카멜 표기법 사용 해야 함.

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class StudentDto {
	private int studentCode;
	private String studentName;
	private String studentAddress;
}
