package model;

public class ElectricCar extends Car {

	private int chargerType;
	private double batteryDuration;

	public ElectricCar(double basePrice, double sellPrice, String brand, int vehicleModel, double cylinderCapacity,
			double mileage, int newOrUsed, String plaque, int vehicleType, int carStyle, int doorsNumber,
			boolean polirazedWindows, int type, int chargerType, double batteryDuration) {

		super(basePrice, sellPrice, brand, vehicleModel, cylinderCapacity, mileage, newOrUsed, plaque, vehicleType,
				carStyle, doorsNumber, polirazedWindows, type);

		this.chargerType = chargerType;
		this.batteryDuration = batteryDuration;
	}

	public int getChargerType() {
		return chargerType;
	}

	public void setChargerType(int chargerType) {
		this.chargerType = chargerType;
	}

	public double getBatteryDuration() {
		return batteryDuration;
	}

	public void setBatteryDuration(double batteryDuration) {
		this.batteryDuration = batteryDuration;
	}

	@Override
	public double calculateConsumption() {
		double batteryConsumption = 0;

		if (getChargerType() == 1) {
			batteryConsumption = (getBatteryDuration() + 13) * (getCylinderCapacity() / 100);
		} else if (getChargerType() == 2) {
			batteryConsumption = (getBatteryDuration() + 18) * (getCylinderCapacity() / 100);
		}

		return batteryConsumption;
	}

	@Override
	public double calculatePrice() {
		double finalPrice = 0;
		
		if (getDocuments().isEmpty()) {
			
			finalPrice += soatAdditionalCost;
			
		}
			finalPrice += getBasePrice() + (getBasePrice() * electicAdditional);
		
		if(getNewOrUsed() == 2) {
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
		String charger = "";
		
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
		msg += "\nBattery duration: " + batteryDuration + " hours";
		msg += "\nBattery consumption: " + calculateConsumption();
		if(chargerType == 1) {
			charger = "Fast";
		}else if(chargerType == 2) {
			charger = "Regular";
		}
		
		msg += "\nCharger type: " + charger;
		msg += "\nFinal price:  " + calculatePrice();
		
		return msg;
	}
	
	
	
}
