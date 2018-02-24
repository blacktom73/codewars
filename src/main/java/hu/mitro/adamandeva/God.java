package main.java.hu.mitro.adamandeva;

/***
 * According to the creation myths of the Abrahamic religions, Adam and Eva were the first Humans to
 * wander the earth. You have to do God’s job. The creation method must return an array of length 2
 * containing objects representing Adam and Eva. The first object in the array should be an instance
 * of the class Man. The second should be an instance of the class Woman. Both objects have to be
 * subclasses of Human. Your job is to implement the Human, Man and Woman classes.
 *
 * @author Mitró Tamás
 */
public class God {

	public static Human[] create() {
		Man Adam = new Man();
		Woman Eva = new Woman();
		Human[] humans = { Adam, Eva };
		return humans;
	}
}

class Human {
}

class Man extends Human {
}

class Woman extends Human {
}