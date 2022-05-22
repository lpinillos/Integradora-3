package model;

public class HybridCar extends Car{

	private int chargerType;
	private double batteryDuration;
	private double tankCapacity;
	private int gasolineType;
	
	public HybridCar(double basePrice, double sellPrice, String brand, int vehicleModel, double cylinderCapacity,
			double mileage, int newOrUsed, String plaque, int vehicleType, int carStyle, int doorsNumber, boolean polirazedWindows,
			int type, int chargerType, double batteryDuration, double tankCapacity,
			int gasolineType) {
		
		super(basePrice, sellPrice, brand, vehicleModel, cylinderCapacity, mileage, newOrUsed, plaque, vehicleType, carStyle,
				doorsNumber, polirazedWindows, type);
		
		this.chargerType = chargerType;
		this.batteryDuration = batteryDuration;
		this.tankCapacity = tankCapacity;
		this.gasolineType = gasolineType;
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
		
		double gasolineConsumption = getTankCapacity() * (getCylinderCapacity()/180);
		
		return gasolineConsumption;
	}
	
	public double batteryConsumptionCalculation() {
		double batteryConsumption = 0;
		
		if (getChargerType() == 1) {
			batteryConsumption = getBatteryDuration() * (getCylinderCapacity()/200);
		}else if(getChargerType() == 2) {
			batteryConsumption = (getBatteryDuration() + 7) * (getCylinderCapacity()/200);
		}
		
		return batteryConsumption;
	}

	@Override
	public double calculatePrice() {
		double finalPrice = 0;
		
		if (getDocuments().isEmpty()) {
			
			finalPrice += soatAdditionalCost;
			
		}
			
		finalPrice += (getBasePrice() * hybridAdditional) + getBasePrice();
		
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
		String gasoline = "";
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
		msg += "\nCar type: " + type;
		msg += "\nBattery duration: " + batteryDuration + " hours";
		msg += "\nBattery consumption: " + batteryConsumptionCalculation();
		if(chargerType == 1) {
			charger = "Fast";
		}else if(chargerType == 2) {
			charger = "Regular";
		}
		
		msg += "\nCharger type: " + charger;
		msg += "\nFinal price: " + calculatePrice();
		
		return msg;
	}
	
	
}
