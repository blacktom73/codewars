package main.java.hu.mitro.hidepassword;

public class PasswordHider {

	public static String hidePasswordFromConnection(String urlString) {
		StringBuilder sb = new StringBuilder(urlString);
		int lengthOfPassword = 0;
		int startingPosition = sb.indexOf("password=") + 9;
		int userPosition = sb.indexOf("user=") - 1;
		if (userPosition > startingPosition) {
			lengthOfPassword = sb.substring(startingPosition, userPosition).length();
		} else {
			lengthOfPassword = sb.substring(startingPosition).length();
		}
		sb.delete(startingPosition, (startingPosition + lengthOfPassword));
		for (int i = startingPosition; i < (startingPosition + lengthOfPassword); i++) {
			sb.insert(i, '*');
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(hidePasswordFromConnection(
				"jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?user=root&password=12345"));
		System.out.println("---");
		System.out.println(hidePasswordFromConnection(
				"jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?password=12345&user=root"));
	}

}
