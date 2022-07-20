package j24_User.session;

import j24_User.controllor.dto.SigninDto;
import lombok.Data;

@Data
public class PrincipalUser {
	private static PrincipalUser instance = null;
	
	private SigninDto user; 
	
	public PrincipalUser() {}
	
	public static PrincipalUser getInstance() {
		if(instance == null) {
			instance = new PrincipalUser();
		}
		return instance;
	}
}
