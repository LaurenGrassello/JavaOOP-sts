package com.laurenodalen.zookeeper2;

class Bat extends Mammals {
	
	public Bat() {
		super();
		this.energyLevel = 300;
	}

	public void fly() {
		this.energyLevel -= 50;
		System.out.println("Bat wing flutter!");
		super.display();	
	}
	
	public void eatHumans() {
		this.energyLevel += 25;
		System.out.println("The bat had a yummy human for lunch");
		super.display();
	}
	
	public void attackTown() {
		this.energyLevel -= 100;
		System.out.println("The bat has attacked the town!");
		super.display();
	}
	
	
}


