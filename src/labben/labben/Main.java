package labben;

public class Main {
	public static void main(String[] args) {
		LoginIF loginIF = new LoginIF();
		Users.initializeUsers();
		loginIF.enterCredentials();
	}
}
