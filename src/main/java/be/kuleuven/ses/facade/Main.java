package be.kuleuven.ses.facade;// I also want a Cow and two Cats - see README.md

import be.kuleuven.ses.facade.animals.Chicken;

public class Main {
	public static void main(String[] args) {
		Chicken chick = new Chicken();
		System.out.println("Feeding the chicken");
		chick.feed();
	}
}
