package com.laurenodalen.zookeeper2;

public class Mammals {
	protected int energyLevel;
	
	public Mammals() {
		this.energyLevel = 100;
	}
	
	public Mammals(int energyLevel) {
		this.energyLevel = energyLevel;
	}

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	public int display() {
		System.out.println(this.energyLevel);
		return this.energyLevel;
	}
	
}