package model;

public class Motorcycle extends Vehicle {

	private MotorcycleType mcType;
	private double mcGasolineCapacity;

	public Motorcycle(double basePrice, double sellPrice, String brand, int vehicleModel, double cylinderCapacity,
			double mileage, int newOrUsed, String plaque, int vehicleType, int mcType, double mcGasolineCapacity) {

		super(basePrice, sellPrice, brand, vehicleModel, cylinderCapacity, mileage, newOrUsed, plaque, vehicleType);

		switch (mcType) {
		case 1:
			this.mcType = MotorcycleType.STANDART;
			break;
		case 2:
			this.mcType = MotorcycleType.SPORT;
			break;
		case 3:
			this.mcType = MotorcycleType.SCOOTER;
			break;
		case 4:
			this.mcType = MotorcycleType.CROSS;
		}

		this.mcGasolineCapacity = mcGasolineCapacity;
	}

	public MotorcycleType getMcType() {
		return mcType;
	}

	public void setMcType(MotorcycleType mcType) {
		this.mcType = mcType;
	}

	public double getMcGasolineCapacity() {
		return mcGasolineCapacity;
	}

	public void setMcGasolineCapacity(double mcGasolineCapacity) {
		this.mcGasolineCapacity = mcGasolineCapacity;
	}

	@Override
	public double calculateConsumption() {

		double gasolineConsumption = getMcGasolineCapacity() * (getCylinderCapacity() / 75);

		return gasolineConsumption;
	}

	@Override
	public double calculatePrice() {
		double finalPrice = 0;
		
		if (getDocuments().isEmpty()) {
			
			finalPrice += soatAdditionalCost;
			
		}
			
		finalPrice += (getBasePrice() * motoAdditionalCost) + getBasePrice();
		
		if(getNewOrUsed() == 2) {
			finalPrice += finalPrice - (finalPrice * motoDiscount);
		}
		
		return finalPrice;
	}

	@Override
	public String toString() {
		String msg = "";
		String usedOrNew = "";
		
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
		msg += "\nMotorcycle type: " + mcType;
		msg += "\nGasoline capacity: " + mcGasolineCapacity;
		msg += "\nGasoline consumption: " + calculateConsumption();
		msg += "\nFinal price: " + calculatePrice();
		
		return msg;
	}
	
	
}
