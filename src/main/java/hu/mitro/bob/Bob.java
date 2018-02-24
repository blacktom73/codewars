package main.java.hu.mitro.bob;

/***
 * You have to write a function that accepts three parameters: cap is the amount of people the bus
 * can hold excluding the driver, on is the number of people on the bus, and wait is the number of
 * people waiting to get on to the bus. If there is enough space, return 0, and if there isn't,
 * return the number of passengers he can't take.
 * 
 * @author Mitró Tamás
 */
public class Bob {

	public static int enough(int cap, int on, int wait) {
		if ((on + wait) <= cap) {
			return 0;
		} else {
			return on + wait - cap;
		}
	}
}
