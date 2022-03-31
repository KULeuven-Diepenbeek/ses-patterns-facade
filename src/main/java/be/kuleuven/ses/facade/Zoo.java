package be.kuleuven.ses.facade;

import be.kuleuven.ses.facade.animals.Chicken;

public class Zoo {

	private Chicken chicken;

	public Zoo() {
		chicken = new Chicken();
	}

	public void attend() {
		System.out.println("Yay, we're going to feed the animals in the zoo!");

		chicken.feed(1234); // this is WRONG, let the zookeeper handle this - how should we know it wants 1234 seeds anyway?
		// we don't know how to feed other animals

		System.out.println("Did the chicken eat our stuff?");
	}

}
