package labben;

public class User {
	String username;
	String password;

	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public void createPost() {
	}

	public void deletePost() {
	}

	public void viewAllPost() {
	}

	public void viewOwnPost() {
	}

	public void interactWithPosts() {
	}

	// Static method to validate user credentials
	public static boolean validateCredentials(String username, String password) {

		String[][] userList2 = { { "jnash", "123" }, { "akim", "789" } };

		for (int i = 0; i < userList2.length; i++) {
			if (username.equals(userList2[i][0]) && password.equals(userList2[i][1])) {
				return true;
			}
		}

		return false;

	}
}
