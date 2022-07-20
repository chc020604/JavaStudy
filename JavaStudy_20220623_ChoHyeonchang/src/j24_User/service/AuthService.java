package j24_User.service;

import j24_User.controllor.dto.SigninDto;
import j24_User.controllor.dto.SignupDto;

public interface AuthService {
	public boolean checkUsername(String username) throws Exception;
	public int createUser(SignupDto signupDto) throws Exception;
	public SigninDto login(String username, String password) throws Exception;
}
