package test;

public class Gorilla {
	private int energyLevel;

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	public void throwSomething() {
		System.out.println("gorilla has thrown something");
		setEnergyLevel(getEnergyLevel()-5);
	}
	
	public void eatBananas() {
		System.out.println("gprilla is satisfied");
		setEnergyLevel(getEnergyLevel()+10);
	}
	public void climb() {
		System.out.println("the gorilla has climbed a tree");
		setEnergyLevel(getEnergyLevel()-10);
	}

	public Gorilla() {
		super();
		this.energyLevel = 100;
	}
	
	

}
