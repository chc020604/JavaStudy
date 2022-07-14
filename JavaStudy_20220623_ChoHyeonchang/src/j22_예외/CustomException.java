package j22_예외;
//                                   런타임이셉션:프로그램 실행중에 예외가 발생하는 경우를 말한다
public class CustomException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public CustomException(String msg) {
		super(msg);
	}
	
	@Override
	public String getMessage() {
		return super.getMessage();
	}
	
}
