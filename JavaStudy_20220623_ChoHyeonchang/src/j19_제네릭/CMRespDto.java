package j19_제네릭;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CMRespDto<T> {
	private int code;
	private String msg;
	private T data;
}
