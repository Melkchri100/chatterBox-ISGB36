package labben;

import java.util.Scanner;

public class Controller {
	public void verifyUserCredentials(String username, String password) {

		boolean correctLogin = Users.validateCredentials(username, password);
		Scanner scan = new Scanner(System.in);
		if (correctLogin) {
			System.out.println("Correct login");
			Posts.initializePosts();
			User.userChoices(username, password);
		}
	    else {
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
