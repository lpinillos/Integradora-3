package ui;

import model.AutomotiveCompanyController;

import java.util.Scanner;

public class AutomotiveCompanyManager {

	public static Scanner reader;
	public static AutomotiveCompanyController automotiveController;

	/**
	 * <strong>Description:</strong> init method is used to initialize the scanner
	 * and the controller.
	 * 
	 */

	public static void init() {
		reader = new Scanner(System.in);
		automotiveController = new AutomotiveCompanyController();
	}

	/**
	 * <strong>Description:</strong> showMenu method is used to show the user
	 * the interface the interface with which it will interact
	 * 
	 */

	public static void showMenu() {
		int exit = 0;
		System.out.println("Welcome to this Automotive aplication!\n");

		while (exit == 0) {
			System.out.println("**************************MENU************************");
			System.out.println("* 1. Register a vehicle                              *");
			System.out.println("* 2. Calculate vehicle selling price                 *");
			System.out.println("* 3. Register vehicle's documents                    *");
			System.out.println("* 4. Show All vehicle report                         *");
			System.out.println("* 5. Show vehicle's documents state                  *");
			System.out.println("* 6. Generate parking lot map                        *");
			System.out.println("* 7. Generate report of the parking lot ocupation    *");
			System.out.println("* 8. Exit                                            *");
			System.out.println("******************************************************");
			int choice = reader.nextInt();

			switch (choice) {
			case 1:
				registerVehicle();
				break;
			case 2:
				if (automotiveController.showVehiclesList().equals("")) {
					System.out.println("There are no vehicles entered yet");
				} else {
					System.out.println("Select the car to calculate the total price");
					System.out.println(automotiveController.showVehiclesList());
					int choose = reader.nextInt();

					System.out.println(automotiveController.showPriceCalculation(choose));
				}
				break;
			case 3:
				registerVehicleDocuments();
				break;
			case 4:
				System.out.println(automotiveController.showAllVehiclesReport());
				break;
			case 5:
				showDocumentsStatus();
				break;
			case 6:
				System.out.println("Still working on this option\n");
				break;
			case 7:
				System.out.println("Still working on this option\n");
				break;
			case 8:
				System.out.println("Thanks for using this program!\n");
				exit++;
				break;
			default:
				System.out.println("Please type a valid option!\n");
			}
		}
	}

	/**
	 * <strong>Description:</strong> main is where all the program runs with the
	 * help of the others methods created.
	 * 
	 * @param args <strong>String []</strong> this variable is part of the main
	 *             method.
	 */
	public static void main(String[] args) {

		init();
		showMenu();

	}

	/**
	 * pre <strong>Description:</strong> the registerVehicle method is use to
	 * register a new vehicle to the program. 
	 * <strong>pre:</strong> N/A
	 * <strong>pos:</strong> N/A 
	 * pre
	 */
	public static void registerVehicle() {
		boolean polirazedWindows = false;
		String plaque = "";

		System.out.println("Please select the vehicle state:");
		System.out.println("1. New");
		System.out.println("2. Used\n");
		int newOrUsed = reader.nextInt();

		while (newOrUsed < 1 || newOrUsed > 2) {
			System.out.println("ERROR, please enter a valid option!\n");
			newOrUsed = reader.nextInt();
		}

		System.out.println("What type of vehicle is the one that you are going to register?");
		System.out.println("1. Car");
		System.out.println("2. Motorcycle\n");
		int vehicleType = reader.nextInt();

		while (vehicleType < 1 || vehicleType > 2) {
			System.out.println("ERROR, please enter a valid option!\n");
			vehicleType = reader.nextInt();
		}

		System.out.println("Please enter the base price of this vehicle\n");
		double basePrice = reader.nextDouble();

		System.out.println("Please enter this vehicle's sell price\n");
		double sellPrice = reader.nextDouble();

		System.out.println("Please enter the brand of this vehicle\n");
		String brand = reader.nextLine();
		brand = reader.nextLine();

		System.out.println("Please enter the model of this " + brand + " brand vehicle\n");
		int vehicleModel = reader.nextInt();

		System.out.println("Please enter this vehicle's cylinder capacity\n");
		double cylinderCapacity = reader.nextDouble();

		System.out.println("Please enter the mileage of this vehicle\n");
		double mileage = reader.nextDouble();

		if (newOrUsed == 2) {
			System.out.println("Please enter the plaque of the vehicle\n");
			plaque = reader.nextLine();
			plaque = reader.nextLine();

			while (plaque.length() > 7) {
				System.out.println("ERROR, please enter a valid plaque!\n");
				plaque = reader.nextLine();
			}

		} else if (newOrUsed == 1) {
			plaque = "xxx-xxx";
		}

		if (vehicleType == 1) {
			System.out.println("Please enter the car type");
			System.out.println("1. Sedan");
			System.out.println("2. Van\n");
			int carStyle = reader.nextInt();

			while (carStyle < 1 || carStyle > 2) {
				System.out.println("ERROR, please enter a valid option!\n");
				carStyle = reader.nextInt();
			}

			System.out.println("How many doors does this car have?\n");
			int doorsNumber = reader.nextInt();

			System.out.println("Does this car have polirazed windows?");
			System.out.println("1. Yes");
			System.out.println("2. No\n");
			int pWindows = reader.nextInt();

			while (pWindows < 1 || pWindows > 2) {
				System.out.println("ERROR, please enter a valid option!\n");
				pWindows = reader.nextInt();
			}

			if (pWindows == 1) {
				polirazedWindows = true;
			}

			System.out.println("What is the car type?\n1. Gasoline car\n2. Electric car\n3. Hybrid car\n");
			int type = reader.nextInt();

			while (type < 1 || type > 3) {
				System.out.println("ERROR, please enter a valid option!\n");
				type = reader.nextInt();
			}

			if (type == 1) {
				System.out.println("Please enter the car's tank capacity (in galons)\n");
				double tankCapacity = reader.nextDouble();

				System.out.println("What type of gasoline does this car use?");
				System.out.println("1. Extra");
				System.out.println("2. Regular");
				System.out.println("3. Diesel\n");
				int gasolineType = reader.nextInt();

				while (gasolineType < 1 || gasolineType > 3) {
					System.out.println("ERROR, please enter a valid option!\n");
					gasolineType = reader.nextInt();
				}

				if (automotiveController.registerGasolineCar(basePrice, sellPrice, brand, vehicleModel,
						cylinderCapacity, mileage, newOrUsed, plaque, vehicleType, carStyle, doorsNumber,
						polirazedWindows, type, tankCapacity, gasolineType)) {

					System.out.println("The car was registered successfully");

				} else {

					System.out.println("Error, the car couldn't be registered");
				}

			} else if (type == 2) {

				System.out.println("What kind of charger does this car have?\n");
				System.out.println("1. Fast charger");
				System.out.println("2. Regular charger\n");
				int chargerType = reader.nextInt();

				while (chargerType < 1 || chargerType > 2) {
					System.out.println("ERROR, please enter a valid option!\n");
					chargerType = reader.nextInt();
				}

				System.out.println("Please enter the battery duration (per km)\n");
				double batteryDuration = reader.nextDouble();

				if (automotiveController.registerElectricCar(basePrice, sellPrice, brand, vehicleModel,
						cylinderCapacity, mileage, newOrUsed, plaque, vehicleType, carStyle, doorsNumber,
						polirazedWindows, type, chargerType, batteryDuration)) {

					System.out.println("The car was registered successfully");

				} else {

					System.out.println("Error, the car couldn't be registered");
				}

			} else if (type == 3) {

				System.out.println("Please enter the car's tank capacity (in galons)\n");
				double tankCapacity = reader.nextDouble();

				System.out.println("What type of gasoline does this car use?\n");
				System.out.println("1. Extra");
				System.out.println("2. Regular");
				System.out.println("3. Diesel\n");
				int gasolineType = reader.nextInt();

				while (gasolineType < 1 || gasolineType > 3) {
					System.out.println("ERROR, please enter a valid option!\n");
					gasolineType = reader.nextInt();
				}

				System.out.println("What kind of charger does this car have?\n");
				System.out.println("1. Fast charger");
				System.out.println("2. Regular charger\n");
				int chargerType = reader.nextInt();

				while (chargerType < 1 || chargerType > 2) {
					System.out.println("ERROR, please enter a valid option!\n");
					chargerType = reader.nextInt();
				}

				System.out.println("Please enter the battery duration (per km)\n");
				double batteryDuration = reader.nextDouble();

				if (automotiveController.registerHybridCar(basePrice, sellPrice, brand, vehicleModel, cylinderCapacity,
						mileage, newOrUsed, plaque, vehicleType, carStyle, doorsNumber, polirazedWindows, type,
						chargerType, batteryDuration, tankCapacity, gasolineType)) {

					System.out.println("The car was registered successfully");

				} else {

					System.out.println("Error, the car couldn't be registered");
				}
			}

		} else if (vehicleType == 2) {

			System.out.println("What type is this motorcycle\n1. STANDART\n2. SPORT\n3. SCOOTER\n4. CROSS\n");
			int mcType = reader.nextInt();

			while (mcType < 1 || mcType > 4) {
				System.out.println("ERROR, please enter a valid option!\n");
				mcType = reader.nextInt();
			}

			System.out.println("Please enter this motorcycle's gasoline capacity\n");
			double mcGasolineCapacity = reader.nextDouble();

			if (automotiveController.registerMotorcycle(basePrice, sellPrice, brand, vehicleModel, cylinderCapacity,
					mileage, newOrUsed, plaque, vehicleType, mcType, mcGasolineCapacity)) {

				System.out.println("The motorcycle was registered successfully");

			} else {

				System.out.println("Error, The motorcycle couldn't be registered");
			}

		}

	}

	/**
	 * pre <strong>Description:</strong> the registerVehicleDocuments method is use to
	 * register or add a new document to the vehicle. 
	 * <strong>pre:</strong> the user have to register a vehicle first in order to use this option 
	 * <strong>pos:</strong> N/A 
	 * pre
	 */
	
	public static void registerVehicleDocuments() {

		if (automotiveController.showVehiclesList().equals("")) {
			System.out.println("There are not vehicles registered yet\n");
		} else {

			System.out.println(automotiveController.showVehiclesList());
			System.out.println("\nSelect the vehicle to which you want to add the document\n");
			int choice = reader.nextInt();

			System.out.println("\nWhat do you want to add?");
			System.out.println("1. Soat");
			System.out.println("2. Property card");
			System.out.println("3. Techno mechanic\n");
			int documentType = reader.nextInt();

			while (documentType < 1 || documentType > 3) {
				System.out.println("ERROR, please enter a valid option!\n");
				documentType = reader.nextInt();
			}

			System.out.println("Please enter the price of the document\n");
			double documentsPrice = reader.nextDouble();

			System.out.println("Please enter the year of the document\n");
			int documentsDate = reader.nextInt();

			while (documentsDate > 2022) {
				System.out.println("We are still in 2022!\n");
				System.out.println("Please type a correct year!\n");
				documentsDate = reader.nextInt();
			}

			while (documentsDate < 1886) {
				System.out.println("Cars did not exist in that year!\n");
				System.out.println("Please type a correct year!\n");
				documentsDate = reader.nextInt();
			}

			if (documentType == 1) {

				System.out.println("\nPlease enter the insurance cover that the soat have\n");
				double hedgingPrice = reader.nextDouble();

				if (automotiveController.registerSoat(choice, documentType, documentsPrice, documentsDate,
						hedgingPrice)) {

					System.out.println("The Soat was registered successfully");

				} else {

					System.out.println("Error, The Soat couldn't be registered");
				}

			} else if (documentType == 2) {
				if (automotiveController.registerPropertyCard(choice, documentType, documentsPrice, documentsDate)) {

					System.out.println("The property card was registered successfully");

				} else {

					System.out.println("Error, The property card couldn't be registered");
				}
			} else if (documentType == 3) {

				System.out.println("\nPlease enter the gas levels that the car spunk\n");
				double gasLevel = reader.nextDouble();

				if (automotiveController.registerMechanicalTechnician(choice, documentType, documentsPrice,
						documentsDate, gasLevel)) {

					System.out.println("The techno mechanic was registered successfully");

				} else {

					System.out.println("Error, The techno mechanic couldn't be registered");
				}

			}

		}

	}

	/**
	 * pre <strong>Description:</strong> the showDocumentsStatus method is use to
	 * show to the user the documents that are already assign to a vehicle. 
	 * <strong>pre:</strong> the user have to register a vehicle first in order to use this option
	 * <strong>pre:</strong> the user have to register a document first in order to use this option 
	 * <strong>pos:</strong> N/A 
	 * pre
	 */
	
	public static void showDocumentsStatus() {

		System.out.println("Choose a vehicle to show document's status");
		System.out.println(automotiveController.showVehiclesList() + "\n");
		int choice = reader.nextInt();
		System.out.println(automotiveController.showInfoDocuments(choice));

	}

}
