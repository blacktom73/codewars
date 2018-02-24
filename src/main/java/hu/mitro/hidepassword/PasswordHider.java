package main.java.hu.mitro.hidepassword;

/***
 * We have to create a function that receives a connection string with password included and you
 * have to mask the password i.e. change password by asterisks.
 *
 * Preconditions: non empty valid url password always next to string section password= assume
 * password will not contain ampersand sign for sake of simplicity to make it more real it has non
 * ASCII characters "password=" and "user" will occur only once
 *
 * empty passwords are not validated but best solutions take empty passwords into account
 *
 * Example: input jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?user=root&password=12345
 *
 * output jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?user=root&password=*****
 *
 * Extra readings: https://alvinalexander.com/java/jdbc-connection-string-mysql-postgresql-sqlserver
 * 
 * @author Mitró Tamás
 *
 */
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
