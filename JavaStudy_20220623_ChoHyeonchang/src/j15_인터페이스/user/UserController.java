package j15_인터페이스.user;

import j15_인터페이스.user.UserService;
import j15_인터페이스.user.UserServiceImpl2;

public class UserController {

	private final UserService userService;
	
	public UserController() {
		this.userService =  new UserServiceImpl2();
	}
	
	public static void main(String[] args) {
		UserController controller = new UserController();
		controller.userService.createUser();
		System.out.println();
		System.out.println(controller.userService.gerUser());
		System.out.println();
		controller.userService.updateUser();
		System.out.println();
		controller.userService.deleteUser();
		
	}
}
