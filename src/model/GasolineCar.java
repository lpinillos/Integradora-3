package model;

public class GasolineCar extends Car {

	private double tankCapacity;
	private int gasolineType;

	public GasolineCar(double basePrice, double sellPrice, String brand, int vehicleModel, double cylinderCapacity,
			double mileage, int newOrUsed, String plaque, int vehicleType, int carStyle, int doorsNumber,
			boolean polirazedWindows, int type, double tankCapacity, int gasolineType) {

		super(basePrice, sellPrice, brand, vehicleModel, cylinderCapacity, mileage, newOrUsed, plaque, vehicleType,
				carStyle, doorsNumber, polirazedWindows, type);

		this.tankCapacity = tankCapacity;
		this.gasolineType = gasolineType;
	}

	public double getTankCapacity() {
		return tankCapacity;
	}

	public void setTankCapacity(double tankCapacity) {
		this.tankCapacity = tankCapacity;
	}

	public int getGasolineType() {
		return gasolineType;
	}

	public void setGasolineType(int gasolineType) {
		this.gasolineType = gasolineType;
	}

	@Override
	public double calculateConsumption() {

		double gasolineConsumption = getTankCapacity() * (getCylinderCapacity() / 150);

		return gasolineConsumption;
	}

	@Override
	public double calculatePrice() {
		double finalPrice = getBasePrice();

		if (getDocuments().isEmpty()) {

			finalPrice += soatAdditionalCost;

		}

		if (getNewOrUsed() == 2) {
			finalPrice += finalPrice - (finalPrice * usedDiscountCar);
		}

		return finalPrice;
	}

	@Override
	public String toString() {
		String msg = "";
		String usedOrNew = "";
		String style = "";
		String windows = "";
		String type = "";
		String gasoline = "";
		
		msg += "\nBrand: " + getBrand();
		msg += "\nModel: " + getVehicleModel();
		msg += "\nBase price: " + getBasePrice();
		msg += "\nSelling price: " + getSellPrice();
		msg += "\nCylinder capacity: " + getCylinderCapacity();
		msg += "\nKilometer: " + getMileage();
		
		if(getNewOrUsed() == 1) {
			usedOrNew = "a new";
		}else {
			usedOrNew = "an used";
		}
		
		msg += "\nIs " + usedOrNew + " vehicle";
		msg += "\nPlaque: " + getPlaque();
		
		if(getCarStyle() == 1) {
			style = "Sedan";
		}else {
			style = "Van";
		}
		
		msg += "\nCar style: " +style;
		msg += "\nDoors number: " + getDoorsNumber();
		
		if(getPolirazedWindows() == true) {
			windows = "Yes";
		}else {
			windows = "No";
		}
		
		msg += "\nHave polarized windows? " + windows;
		
		if(getType() == 1) {
			type = "Gasoline car";
		}else if(getType() == 2) {
			type = "Electric car";
		}else if(getType() == 3) {
			type = "Hybrid car";
		}
		
		msg += "\nCar type: " + type;
		msg += "\nTank capacity: " + tankCapacity;
		
		if(gasolineType == 1) {
			gasoline = "Extra";
		}else if(gasolineType == 2) {
			gasoline = "Regular";
		}else if(gasolineType == 3) {
			gasoline = "Diesel";
		}
		
		msg += "\nGasoline type: " + gasoline;
		msg += "\nGasoline consumption: " + calculateConsumption();
		msg += "\nFinal price: " + calculatePrice();
		
		return msg;
	}
	
	
}
