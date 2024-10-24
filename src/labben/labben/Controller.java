package labben;

import java.util.Scanner;

public class Controller {
	public void verifyUserCredentials(String username, String password) {

		boolean correctLogin = Users.validateCredentials(username, password);
		Scanner scan = new Scanner(System.in);
		if (correctLogin) {
			System.out.println("Correct login");
			System.out.println("Welcome user\nPress 1 to view all messages\nPress 2 to view your messages\n"
					+ "Press 3 to create Post\nPress anything else to quit");
			try {
				int choice = scan.nextInt();
				scan.nextLine();
				if (choice == 1) {
					Posts.initializePosts();
					Posts.viewAllPosts();
				} else if (choice == 2) {
					Posts.initializePosts();
					Posts.viewOwnPost(username);
				} else if (choice == 3) {
					//CreatePostIF.enterMessage();
				}
				else {
					System.out.println("Quitting application. Goodbye!");
					System.exit(0);
				}

			} catch (Exception e) {
				// If input is not an integer
				System.out.println("Quitting application. Goodbye!");
				System.exit(0);
			}
			
			
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
