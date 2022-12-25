package shaima1; //better naming

import java.util.Scanner;

public class Mark {
	private int mathMark; // TODO: Find out diff between int/Integer
	private int arabicMark; // TODO: Please have consistent formatting

	private int sum;
	
	
	
	
	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getMathMark() {
		return mathMark;
	}

	public void setMathMark(int mathMark) {
		if (mathMark >= 0 && mathMark <= 100) {
			this.mathMark = mathMark;
		}
	}

	public int getArabicMark() {

		return arabicMark;

	}

	public void setArabicMark(int arabicMark) {
		if (arabicMark >= 0 && arabicMark <= 100) {
			this.arabicMark = arabicMark;
		}
	}
}
