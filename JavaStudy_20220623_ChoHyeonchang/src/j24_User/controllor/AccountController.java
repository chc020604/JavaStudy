package j24_User.controllor;

import j24_User.controllor.dto.CMRespDto;

public class AccountController {

	public CMRespDto<?> myPage(){
		
		return new CMRespDto<>(1, "마이페이지 로드 성공", null);
	}
}
