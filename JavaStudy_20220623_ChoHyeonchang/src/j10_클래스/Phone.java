package j10_클래스;
//순서가 중요 하다
public class Phone { // 변수들을 Phone 이라는 클래스의 소유로 만듦,  
	                 // 게터와 세터한테 사용 허락 권한을 주는 것 이다.
	private String company;
	private String model;
	private int version;
	private String color;
	
	public Phone() {
		System.out.println("기본생성자로 메모리 할당");
	}
	
	public Phone(String company, String model, int version, String color) { // alt + shift + s -> GCuF 클릭)
		this.company = company;
		this.model = model;
		this.version = version;
		this.color = color;
	}

	// alt + shift + s (제네레이트 케터 세터)
	
	public String getCompany() {
		return removeCompanyWord();
	}
	
	private String removeCompanyWord() {
		return company == null ? null : company.substring(0, company.indexOf("회사"));
	}
	public void setCompany(String company) {
		this.company = madeCompanyName(company);
	}
	
	private String madeCompanyName(String company) {
		return company + "회사";
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void showInfo( ) {
		System.out.println("제조사: " + company);
		System.out.println("모델: " + model);
		System.out.println("버전: " + version);
		System.out.println("색상: " + color);
		System.out.println();
	}
}
