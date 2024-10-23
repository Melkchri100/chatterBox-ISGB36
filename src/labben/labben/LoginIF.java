package labben;

import java.util.Scanner;

public class LoginIF {
	public void enterCredentials() {
		Scanner scan = new Scanner(System.in);
		System.out.println(
				"Welcome to ChatterBox.\nPress 1 to login\nPress 2 to stay as guest\nPress anything else to quit application");

		try {
			int choice = scan.nextInt();
			scan.nextLine();

			if (choice == 1) {
				System.out.println("Enter username: ");
				String username = scan.nextLine();

				System.out.println("Enter password: ");
				String password = scan.nextLine();

			} else if (choice == 2) {
				System.out.println("Continuing as a guest...");
			} else {
				System.out.println("Quitting application. Goodbye!");
				System.exit(0);
			}
		} catch (Exception e) {
			// If input is not an integer
			System.out.println("Quitting application. Goodbye!");
			System.exit(0);
		} finally {
			scan.close();
		}
	}
}