package model;

import java.util.ArrayList;

public class AutomotiveCompanyController {

	private ArrayList<Vehicle> vehicles;

	public AutomotiveCompanyController() {

		vehicles = new ArrayList<>();
	}

	/**pre
	 *<strong>Description:</strong> the registerGasolineCar method is used to create all the things that the
	 *gasoline car have.
	 *<strong>pre:</strong> N/A
	 *<strong>pos:</strong> N/A
	 *@param basePrice <strong>double</strong> this variable is used to save the base price of the vehicle.
	 *@param sellPrice <strong>double</strong> this variable is used to save the sell price of the vehicle.
	 *@param brand <strong>String</strong> this variable is used to save the brand of the vehicle added.
	 *@param vehicleModel <strong>int</strong> this variable is used to save the car model year.
	 *@param cylinderCapacity <strong>double</strong> this variable is used to save the cylinder capacity that the car have.
	 *@param mileage <strong>double</strong> this variable is used to save the mileage that the car have.
	 *@param newOrUsed <strong>int</strong> this variable is used to save if the car is new or if it is used.
	 *@param plaque <strong>String</strong> this variable is used to save the plaque of the vehicle.
	 *@param vehicleType <strong>int</strong> this variable is used to save the type of the vehicle.
	 *@param carStyle <strong>int</strong> this variable is used to save the style of the car.
	 *@param doorsNumber <strong>int</strong> this variable is used to save the doors quantity of the car.
	 *@param polarizedWindows <strong>boolean</strong> this variable is used to save if the car have polarized windows or not.
	 *@param type <strong>int</strong> this variable is used to save the the type of the vehicle.
	 *@param tankCapacity <strong>double</strong> this variable is used to save the tank capacity of the car.
	 *@param gasolineType <strong>int</strong> this variable is used to save the type of gasoline that the car have.
	 *@return vehicles <strong>arrayList</strong> this value returns a true boolean that indicates that the method 
	 ends its function.
	 *pre
	*/
	
	public boolean registerGasolineCar(double basePrice, double sellPrice, String brand, int vehicleModel,
			double cylinderCapacity, double mileage, int newOrUsed, String plaque, int vehicleType, int carStyle,
			int doorsNumber, boolean polirazedWindows, int type, double tankCapacity, int gasolineType) {

		return vehicles.add(
				new GasolineCar(basePrice, sellPrice, brand, vehicleModel, cylinderCapacity, mileage, newOrUsed, plaque,
						vehicleType, carStyle, doorsNumber, polirazedWindows, type, tankCapacity, gasolineType));

	}
	
	/**pre
	 *<strong>Description:</strong> the registerElectricCar method is used to create all the things that the
	 *electric car have.
	 *<strong>pre:</strong> N/A
	 *<strong>pos:</strong> N/A
	 *@param basePrice <strong>double</strong> this variable is used to save the base price of the vehicle.
	 *@param sellPrice <strong>double</strong> this variable is used to save the sell price of the vehicle.
	 *@param brand <strong>String</strong> this variable is used to save the brand of the vehicle added.
	 *@param vehicleModel <strong>int</strong> this variable is used to save the car model year.
	 *@param cylinderCapacity <strong>double</strong> this variable is used to save the cylinder capacity that the car have.
	 *@param mileage <strong>double</strong> this variable is used to save the mileage that the car have.
	 *@param newOrUsed <strong>int</strong> this variable is used to save if the car is new or if it is used.
	 *@param plaque <strong>String</strong> this variable is used to save the plaque of the vehicle.
	 *@param vehicleType <strong>int</strong> this variable is used to save the type of the vehicle.
	 *@param carStyle <strong>int</strong> this variable is used to save the style of the car.
	 *@param doorsNumber <strong>int</strong> this variable is used to save the doors quantity of the car.
	 *@param polarizedWindows <strong>boolean</strong> this variable is used to save if the car have polarized windows or not.
	 *@param type <strong>int</strong> this variable is used to save the the type of the vehicle.
	 *@param chargerType <strong>int</strong> this variable is used to save the charger type that the vehicle have.
	 *@param batteryDuration <strong>double</strong> this variable is used to save the duration of the battery.
	 *@return vehicles <strong>arrayList</strong> this value returns a true boolean that indicates that the method 
	 ends its function.
	 *pre
	*/

	public boolean registerElectricCar(double basePrice, double sellPrice, String brand, int vehicleModel,
			double cylinderCapacity, double mileage, int newOrUsed, String plaque, int vehicleType, int carStyle,
			int doorsNumber, boolean polirazedWindows, int type, int chargerType, double batteryDuration) {

		return vehicles.add(
				new ElectricCar(basePrice, sellPrice, brand, vehicleModel, cylinderCapacity, mileage, newOrUsed, plaque,
						vehicleType, carStyle, doorsNumber, polirazedWindows, type, chargerType, batteryDuration));

	}
	
	/**pre
	 *<strong>Description:</strong> the registerHybridCar method is used to create all the things that the
	 *hybrid car have.
	 *<strong>pre:</strong> N/A
	 *<strong>pos:</strong> N/A
	 *@param basePrice <strong>double</strong> this variable is used to save the base price of the vehicle.
	 *@param sellPrice <strong>double</strong> this variable is used to save the sell price of the vehicle.
	 *@param brand <strong>String</strong> this variable is used to save the brand of the vehicle added.
	 *@param vehicleModel <strong>int</strong> this variable is used to save the car model year.
	 *@param cylinderCapacity <strong>double</strong> this variable is used to save the cylinder capacity that the car have.
	 *@param mileage <strong>double</strong> this variable is used to save the mileage that the car have.
	 *@param newOrUsed <strong>int</strong> this variable is used to save if the car is new or if it is used.
	 *@param plaque <strong>String</strong> this variable is used to save the plaque of the vehicle.
	 *@param vehicleType <strong>int</strong> this variable is used to save the type of the vehicle.
	 *@param carStyle <strong>int</strong> this variable is used to save the style of the car.
	 *@param doorsNumber <strong>int</strong> this variable is used to save the doors quantity of the car.
	 *@param polarizedWindows <strong>boolean</strong> this variable is used to save if the car have polarized windows or not.
	 *@param type <strong>int</strong> this variable is used to save the the type of the vehicle.
	 *@param tankCapacity <strong>double</strong> this variable is used to save the tank capacity of the car.
	 *@param gasolineType <strong>int</strong> this variable is used to save the type of gasoline that the car have.
	 **@param chargerType <strong>int</strong> this variable is used to save the charger type that the vehicle have.
	 *@param batteryDuration <strong>double</strong> this variable is used to save the duration of the battery.
	 *@return vehicles <strong>arrayList</strong> this value returns a true boolean that indicates that the method 
	 ends its function.
	 *pre
	*/

	public boolean registerHybridCar(double basePrice, double sellPrice, String brand, int vehicleModel,
			double cylinderCapacity, double mileage, int newOrUsed, String plaque, int vehicleType, int carStyle,
			int doorsNumber, boolean polirazedWindows, int type, int chargerType, double batteryDuration,
			double tankCapacity, int gasolineType) {

		return vehicles.add(new HybridCar(basePrice, sellPrice, brand, vehicleModel, cylinderCapacity, mileage,
				newOrUsed, plaque, vehicleType, carStyle, doorsNumber, polirazedWindows, type, chargerType,
				batteryDuration, tankCapacity, gasolineType));

	}
	
	/**pre
	 *<strong>Description:</strong> the registerMotrocycle method is used to create all the things that the
	 *motrocycle car have.
	 *<strong>pre:</strong> N/A
	 *<strong>pos:</strong> N/A
	 *@param basePrice <strong>double</strong> this variable is used to save the base price of the vehicle.
	 *@param sellPrice <strong>double</strong> this variable is used to save the sell price of the vehicle.
	 *@param brand <strong>String</strong> this variable is used to save the brand of the vehicle added.
	 *@param vehicleModel <strong>int</strong> this variable is used to save the car model year.
	 *@param cylinderCapacity <strong>double</strong> this variable is used to save the cylinder capacity that the car have.
	 *@param mileage <strong>double</strong> this variable is used to save the mileage that the car have.
	 *@param newOrUsed <strong>int</strong> this variable is used to save if the car is new or if it is used.
	 *@param plaque <strong>String</strong> this variable is used to save the plaque of the vehicle.
	 *@param vehicleType <strong>int</strong> this variable is used to save the type of the vehicle.
	 *@param mcType <strong>int</strong> this variable is used to save the motorcycle type.
	 *@param mcGasolineCapacity <strong>double</strong> this variable is used to save the tank capacity that the motorcycle have.
	 *@return vehicles <strong>arrayList</strong> this value returns a true boolean that indicates that the method 
	 ends its function.
	 *pre
	*/

	public boolean registerMotorcycle(double basePrice, double sellPrice, String brand, int vehicleModel,
			double cylinderCapacity, double mileage, int newOrUsed, String plaque, int vehicleType, int mcType,
			double mcGasolineCapacity) {

		return vehicles.add(new Motorcycle(basePrice, sellPrice, brand, vehicleModel, cylinderCapacity, mileage,
				newOrUsed, plaque, vehicleType, mcType, mcGasolineCapacity));

	}

	/**pre
	 *<strong>Description:</strong> the registerSoat method is used to create all the things that the
	 *soat of the car have.
	 *<strong>pre:</strong> the user needs to create a car first in order to use this option.
	 *<strong>pos:</strong> N/A
	 *@param choice <strong>int</strong> this variable is used to save the car that the user wants to add the document.
	 *@param documentType <strong>int</strong> this variable is used to save the document type that the user will register.
	 *@param documentPrice <strong>double</strong> this variable is used to save the price of the document.
	 *@param documentDate <strong>int</strong> this variable is used to save the year of the document.
	 *@param hedgingPrice <strong>double</strong> this variable is used to save the insurance cover of the document.
	 *@return vehicles <strong>arrayList</strong> this value returns a true boolean that indicates that the method 
	 ends its function.
	 *pre
	*/
	
	public boolean registerSoat(int choice, int documentType, double documentsPrice, int documentsDate,
			double hedgingPrice) {

		return vehicles.get(choice - 1).addDocumentSoat(choice, documentType, documentsPrice, documentsDate,
				hedgingPrice);

	}

	/**pre
	 *<strong>Description:</strong> the registerPropertyCard method is used to create all the things that the
	 *property card of the car have.
	 *<strong>pre:</strong> the user needs to create a car first in order to use this option.
	 *<strong>pos:</strong> N/A
	 *@param choice <strong>int</strong> this variable is used to save the car that the user wants to add the document.
	 *@param documentType <strong>int</strong> this variable is used to save the document type that the user will register.
	 *@param documentPrice <strong>double</strong> this variable is used to save the price of the document.
	 *@param documentDate <strong>int</strong> this variable is used to save the year of the document.
	 *@return vehicles <strong>arrayList</strong> this value returns a true boolean that indicates that the method 
	 ends its function.
	 *pre
	*/
	
	public boolean registerPropertyCard(int choice, int documentType, double documentsPrice, int documentsDate) {

		return vehicles.get(choice - 1).addDocumentPropertyCard(choice, documentType, documentsPrice, documentsDate);

	}

	/**pre
	 *<strong>Description:</strong> the registerMechanicalTechnician method is used to create all the things that the
	 *mechanical technician of the car have.
	 *<strong>pre:</strong> the user needs to create a car first in order to use this option.
	 *<strong>pos:</strong> N/A
	 *@param choice <strong>int</strong> this variable is used to save the car that the user wants to add the document.
	 *@param documentType <strong>int</strong> this variable is used to save the document type that the user will register.
	 *@param documentPrice <strong>double</strong> this variable is used to save the price of the document.
	 *@param documentDate <strong>int</strong> this variable is used to save the year of the document.
	 *@param gasLevel <strong>double</strong> this variable is used to save the gas levels that the vehicle produce.
	 *@return vehicles <strong>arrayList</strong> this value returns a true boolean that indicates that the method 
	 ends its function.
	 *pre
	*/
	
	public boolean registerMechanicalTechnician(int choice, int documentType, double documentsPrice, int documentsDate,
			double gasLevel) {

		return vehicles.get(choice - 1).addDocumentMechanicalTechnician(choice, documentType, documentsPrice,
				documentsDate, gasLevel);

	}

	/**pre
	 *<strong>Description:</strong> the showVehiclesList method is use to show to the user the vehicles that he/she can choose
	  in order to add a new document.
	 *<strong>pre:</strong> this method needs the creation of a vehicle.
	 *<strong>pos:</strong> N/A
	 *@return msg <strong>String</strong> this variable is use to save the message that the user will see in the program.
	 *pre
	*/
	
	public String showVehiclesList() {

		String vehiclesRegistered = "";

		for (int i = 0; (i < vehicles.size()); i++) {

			vehiclesRegistered += "\n" + (i + 1) + ". ";

			vehiclesRegistered += vehicles.get(i).getBrand() + " - " + vehicles.get(i).getVehicleModel();

			if (vehicles.get(i) instanceof GasolineCar) {

				vehiclesRegistered += " - (Gasoline car).";

			} else if (vehicles.get(i) instanceof ElectricCar) {

				vehiclesRegistered += " - (Electric car).";

			} else if (vehicles.get(i) instanceof HybridCar) {

				vehiclesRegistered += " - (Hybrid car).";

			} else if (vehicles.get(i) instanceof Motorcycle) {

				vehiclesRegistered += " - (Motorcycle).";

			}

		}

		return vehiclesRegistered;

	}
	
	/**pre
	 *<strong>Description:</strong> the showInfoDocuments method is use to show to the user the documents information
	 *<strong>pre:</strong> this method needs the creation of a vehicle.
	 *<strong>pre:</strong> this method needs the creation of a document.
	 *<strong>pos:</strong> N/A
	 *@param choice <strong>int</strong> this variable is used to choose which car what car do the user wants to see the documents for .
	 *@return msg <strong>String</strong> this variable is use to save the message that the user will see in the program.
	 *pre
	*/

	public String showInfoDocuments(int choice) {
		String msg = "";

		if (!vehicles.get(choice - 1).showDocumentsInfo().equals("")) {
			msg += "Document's status:\n";
			msg += vehicles.get(choice - 1).showDocumentsInfo();
			msg += vehicles.get(choice - 1).documentStatus();
			
		} else {
			msg = "There are no documents registered for this vehicle";
		}
		return msg;
	}
	
	/**pre
	 *<strong>Description:</strong> the showPriceCalculation method is use to show to the user the final price of the vehicle
	 *<strong>pre:</strong> this method needs the creation of a vehicle.
	 *<strong>pos:</strong> N/A
	 *@param choice <strong>int</strong> this variable is used to choose which car what car do the user wants to see the final price for .
	 *@return msg <strong>String</strong> this variable is use to save the message that the user will see in the program.
	 *pre
	*/
	
	public String showPriceCalculation(int choose) {
		String msg = "";
		
		if(vehicles.get(choose - 1) instanceof GasolineCar) {
			msg = "The final cost is: " + vehicles.get(choose - 1).calculatePrice();
		}else if(vehicles.get(choose - 1) instanceof HybridCar) {
			msg += "The final cost is: " + vehicles.get(choose - 1).calculatePrice();
		}else if(vehicles.get(choose - 1) instanceof ElectricCar) {
			msg += "The final cost is: " + vehicles.get(choose - 1).calculatePrice();
		}else if(vehicles.get(choose - 1) instanceof Motorcycle) {
			msg += "The final cost is: " + vehicles.get(choose - 1).calculatePrice();
		}
		
		return msg;
	}

	/**pre
	 *<strong>Description:</strong> the showAllVehiclesReport method is use to show to the user the vehicles report.
	 *<strong>pre:</strong> this method needs the creation of a vehicle.
	 *<strong>pos:</strong> N/A
	 *@return msg <strong>String</strong> this variable is use to save the message that the user will see in the program.
	 *pre
	*/
	
	public String showAllVehiclesReport() {
		String msg = "";
		for(int i = 0; i < vehicles.size(); i++) {
			
			if(vehicles.get(i) instanceof ElectricCar) {
				msg += "\nElectric car report:\n";
				msg += vehicles.get(i).toString();
			}else if(vehicles.get(i) instanceof GasolineCar) {
				msg += "\nGasoline car report:\n";
				msg += vehicles.get(i).toString();
			}else if(vehicles.get(i) instanceof HybridCar) {
				msg += "\nHybrid car report;\n";
				msg += vehicles.get(i).toString();
			}else if(vehicles.get(i) instanceof Motorcycle) {
				msg += "\nMotrocycle report:\n" + vehicles.get(i);
				msg += vehicles.get(i).toString();
			}
		}
		
		return msg;
	}
	
}
