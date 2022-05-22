package model;

public interface vehiclePriceCalculation {

	final int soatAdditionalCost = 500000;
	final double electicAdditional = 0.20;
	final double hybridAdditional = 0.15;
	final double usedDiscountCar = 0.10;
	final double motoAdditionalCost = 0.04;
	final double motoDiscount = 0.02;
	
	public abstract double calculatePrice();
	
	
}
