package be.kuleuven.ses.facade.animals;

public class Chicken {
	private int amountOfSeedsEaten = 0;
	public void feed(int seeds) {
		amountOfSeedsEaten+= seeds;
		System.out.println("Pook pok? Pok! " + amountOfSeedsEaten);
	}
}
