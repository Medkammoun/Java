package test;

public class Bat {
	private int energyLevel;

	public Bat() {
		this.energyLevel = 300;
	}

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	public void fly() {
		System.out.println("the bat taking off");
		setEnergyLevel(getEnergyLevel()-50);
	}
	public void eatHumans() {
		setEnergyLevel(getEnergyLevel()+25);
	}
	public void attackTown() {
		System.out.println("the town on fire");
		setEnergyLevel(getEnergyLevel()-100);
	}
	
	
}
