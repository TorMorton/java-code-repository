package com.skillstorm;

public class Computer {
	
	public String gPU; // graphics processing unit ie RTX 3060
	public String cPU; //computer processing unit ie Intel i7
	public int pSUWattage; //power supply unit watts ie 650W
	public byte gBOfRAM; 
	public boolean isLiquidCooled;
	public int gBOfStorage;
	public String motherBoardType; 
	
	public Computer() {
		super();
	}
	
	public Computer(String gPU, String cPU, int pSUWattage, byte gBOfRAM, boolean isLiquidCooled, int gBOfStorage, String motherBoardType) {
		this.gPU = gPU;
		this.cPU = cPU;
		this.pSUWattage = pSUWattage;
		this.gBOfRAM = gBOfRAM;
		this.isLiquidCooled = isLiquidCooled;
		this.gBOfStorage = gBOfStorage;
		this.motherBoardType = motherBoardType;
		
	}
	
	
	public void bootSystem() {
		System.out.println("This computer's specifications are: ");
		System.out.println("Graphics Processing Unit: " + gPU);
		System.out.println("Computer Processing Unit: " + cPU);
		System.out.println("Power Supply Unit:" + pSUWattage + "W");
		System.out.println("Total GB of RAM: " + gBOfRAM + "GB");
		System.out.println("Liquid Cooled: " + isLiquidCooled);
		System.out.println("Storage Capacity: " + gBOfStorage);
		System.out.println("Motherboard: " + motherBoardType);
	}
	
	public void shutDown(boolean isOn) {
		if (isOn) {
			System.out.println("Shutting down...");
		} else {
			System.out.println("System is shut down");
		}
	}
	
	public void restart() {
		System.out.println("System restarting...Please wait.");
	}

}
