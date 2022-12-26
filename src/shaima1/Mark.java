package shaima1; //better naming

import java.util.Scanner;

public class Mark {

	private double mathMark; // TODO: Find out diff between int/Integer
	private double arabicMark; // TODO: Please have consistent formatting

	private double sum;

	public double getSum() {
		//double s = (double) sum;
		return sum;
	}

	public void setSum(float sum) {
		
		this.sum = (double) sum;
	}

	

	public double getMathMark() {
		

		return mathMark;
	}

	public void setMathMark(float mathMark) {
		

		if (mathMark >= 0 && mathMark <= 100) {
			this.mathMark = (double) mathMark;
		}
	}

	public double getArabicMark() {
		

		return arabicMark;

	}

	public void setArabicMark(float arabicMark) {
		
		if (arabicMark >= 0 && arabicMark <= 100) {
			this.arabicMark = (double) arabicMark;
		}
	}
}
