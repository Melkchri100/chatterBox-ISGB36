package labben;

public class Controller {
	public void verifyUserCredentials(String username, String password) {

		boolean correctLogin = User.validateCredentials(username, password);

		if (correctLogin) {
			System.out.println("Correct login");
		} else {
			System.out.println("Incorrect login");
		}
	}

	public void verifyPost() {

	}

	public void getAllPosts() {

	}

	public void getOwnPosts() {

	}
}
