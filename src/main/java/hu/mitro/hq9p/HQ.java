package main.java.hu.mitro.hq9p;

/***
 *
 * @author Mitró Tamás You task is to implement an simple interpreter for the notorious esoteric
 *         language HQ9+ that will work for a single character input:
 * 
 *         If the input is 'H', return 'Hello World!' If the input is 'Q', return the input If the
 *         input is '9', return the full lyrics of 99 Bottles of Beer. It should be formatted like
 *         this:
 * 
 *         99 bottles of beer on the wall, 99 bottles of beer. Take one down and pass it around, 98
 *         bottles of beer on the wall. 98 bottles of beer on the wall, 98 bottles of beer. Take one
 *         down and pass it around, 97 bottles of beer on the wall. 97 bottles of beer on the wall,
 *         97 bottles of beer. Take one down and pass it around, 96 bottles of beer on the wall. ...
 *         ... ... 2 bottles of beer on the wall, 2 bottles of beer. Take one down and pass it
 *         around, 1 bottle of beer on the wall. 1 bottle of beer on the wall, 1 bottle of beer.
 *         Take one down and pass it around, no more bottles of beer on the wall. No more bottles of
 *         beer on the wall, no more bottles of beer. Go to the store and buy some more, 99 bottles
 *         of beer on the wall.
 * 
 *         For everything else, don't return anything (return null in C#, None in Rust).
 * 
 *         (+ has no visible effects so we can safely ignore it.)
 * 
 */
public class HQ {
	public static String HQ9(char code) {
		switch (code) {
			case 'H':
				return "Hello World!";
			case 'Q':
				return "" + code;
			case '9':
				return beerSong();
			default:
				return null;
		}
	}

	public static String beerSong() {
		int beers = 99;
		StringBuilder sb = new StringBuilder();
		while (beers > 1) {
			if (beers != 2) {
				sb.append(beers + " bottles of beer on the wall, " + beers
						+ " bottles of beer.\n");
				sb.append("Take one down and pass it around, " + (beers - 1)
						+ " bottles of beer on the wall.\n");
			} else {
				sb.append(beers + " bottles of beer on the wall, " + beers
						+ " bottles of beer.\n");
				sb.append("Take one down and pass it around, " + (beers - 1)
						+ " bottle of beer on the wall.\n");
			}
			beers--;
		}
		sb.append(beers + " bottle of beer on the wall, " + beers + " bottle of beer.\n");
		sb.append(
				"Take one down and pass it around, no more bottles of beer on the wall.\n");
		sb.append("No more bottles of beer on the wall, no more bottles of beer.\n");
		sb.append("Go to the store and buy some more, 99 bottles of beer on the wall.");
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(HQ9('H'));
		System.out.println(HQ9('Q'));
		System.out.println(HQ9('9'));
	}
}