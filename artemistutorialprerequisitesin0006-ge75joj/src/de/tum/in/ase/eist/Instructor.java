package de.tum.in.ase.eist;

public class Instructor extends Person {

	// Done: implement according to problem statement
	public Instructor(String name, int age, String tumId) {
		super(name, age, tumId);
	}
	
	public void teach(String content) {
		this.say("Please learn " + content);
	}
	
}
