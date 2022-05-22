package model;

public abstract class Car extends Vehicle{

	private int carStyle;
	private int doorsNumber;
	private boolean polirazedWindows;
	private int type;
	
	public Car(double basePrice, double sellPrice, String brand, int vehicleModel, double cylinderCapacity,
			double mileage, int newOrUsed, String plaque, int vehicleType, int carStyle, int doorsNumber, boolean polirazedWindows,
			int type) {
		
		super(basePrice, sellPrice, brand, vehicleModel, cylinderCapacity, mileage, newOrUsed, plaque, vehicleType);
		
		this.carStyle = carStyle;
		this.doorsNumber = doorsNumber;
		this.polirazedWindows = polirazedWindows;
		this.type = type;
	}

	public int getCarStyle() {
		return carStyle;
	}

	public void setCarStyle(int carStyle) {
		this.carStyle = carStyle;
	}

	public int getDoorsNumber() {
		return doorsNumber;
	}

	public void setDoorsNumber(int doorsNumber) {
		this.doorsNumber = doorsNumber;
	}

	public boolean getPolirazedWindows() {
		return polirazedWindows;
	}

	public void setPolirazedWindows(boolean polirazedWindows) {
		this.polirazedWindows = polirazedWindows;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
	
}
