package shaima1;

import java.util.Scanner;

public class revers {
public static void reversNumber(int number) {
	if (number<10) {
		System.out.println(number);
		return;
		
	}
	else {
		System.out.print(number%10);
		 reversNumber(number/10);
	}
	}
	public static void main(String[]args){
		System.out.print("Enter number to revers:");
		Scanner Sc =new Scanner (System.in);
		int num= Sc.nextInt();
		System.out.print("revers of gevin number:");
		reversNumber(num);
		
	}
}
