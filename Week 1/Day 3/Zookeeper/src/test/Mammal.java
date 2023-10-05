package test;

public class Mammal {
	private int energyLevel;
	
	
	public Mammal() {
		this.energyLevel = 100;
	}

	
	public void displayEnergy() {
		System.out.println("Energy Level : " + getEnergyLevel());
	}
	
	

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}

}
