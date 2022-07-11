package j17_최상위클래스;

import java.util.Objects;

public class User {
	private int usercode;
	private String username;
	
	public User() {
		
	}

	public User(int usercode, String username) {
		super();
		this.usercode = usercode;
		this.username = username;
	}

	public int getUsercode() {
		return usercode;
	}

	public void setUsercode(int usercode) {
		this.usercode = usercode;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(usercode, username);
	}
	 
	@Override
	public boolean equals(Object obj) {
		//주소비교
		if(this == obj) {
			return true;
		}
		//매개변수가 null 인지 확인
		if(obj == null) {
			return false;
		}
		//서로의 인스턴스가 같은지 확인
		if(this.getClass() != obj.getClass()) {
			return false;
		}
		
//		if(!(obj instanceOf User)) {
//			return false;                  :위에 코드랑 같은 역할이다
//		}                                   (곧 사라질 명령어라서 위에꺼 써라)
		
		 User user = (User) obj;
		 return usercode ==  user.usercode
				&& Objects.equals(username, user.username);
		
	}

	@Override
	public String toString() {
		return "User [usercode=" + usercode + ", username=" + username + "]";
	}
	// 알트 시프트 s ->  equals and hashCode
}
