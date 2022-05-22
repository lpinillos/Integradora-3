package model;

public class MechanicalTechnician extends Document {

	private double gasLevel;
	private String code;
	
	public MechanicalTechnician(int choice, int documentType, double documentsPrice, int documentsDate,
			double gasLevel) {
		super(choice, documentType, documentsPrice, documentsDate);
		
		this.code = codeGeneratorZ();
		this.gasLevel = gasLevel;
	}

	public double getGasLevel() {
		return gasLevel;
	}

	public void setGasLevel(double gasLevel) {
		this.gasLevel = gasLevel;
	}

	public String codeGeneratorZ() {
		String code = "";
		boolean stopFlag = false;
		int[][] techImage = new int[4][4];
		techImage = getDocumentsImage();

		for (int i = 0; i < techImage.length && stopFlag == false; i++) {
			if (i == 0) {
				for (int j = 0; j < techImage[0].length - 1; j++) {
					code += techImage[i][j] + " ";
				}
			} else {
				stopFlag = true;
			}
		}

		for (int i = 0; i < techImage.length; i++) {
			for (int j = techImage[0].length - 1; j >= 0; j--) {
				if (i + j == 3) {
					code += techImage[i][j] + " ";
				}
			}
		}

		for (int i = techImage.length - 1; i < techImage.length; i++) {
			for (int j = 0; j < techImage[0].length; j++) {
				if (i + j != techImage.length - 1) {
					code += techImage[i][j] + " ";
				}
			}
		}

		return code;
	}

	@Override
	public String toString() {
		String msg = "";
		
		msg += "\nTechno mechanic information:\n";
		msg += "Year: " + getDocumentsDate() + "\n";
		msg += "Price: " + getDocumentsPrice() + "\n";
		msg += "Matrix generated:\n" + printImage();
		msg += "Tecno mechanic Code: " + code;
		
		return msg;
	}

}
