package shaima1;

import java.util.Scanner;

public class oe {

	public static void main(String[] args) {
		
		
		
				int n, sumE=0, sumO=0;
				Scanner s= new Scanner(System.in);
				System.out.println("Enter the number of elements in array:");
				n=s.nextInt();
				int[] a= new int [n];
				System.out.println("Enter the elements of the array:");
				for(int i=0;i<n;i++) {
					a[i]=s.nextInt();
				}
				for(int i=0;i<n;i++) {
					if(a[i]%2==0) {
						sumE=sumE+a[i];
					
					}
				
				else {
					sumO=sumO+a[i];
					
				}
			}
			System.out.println("sum of even number:"+ sumE);
			System.out.println("sum of odd number:"+ sumO);
		}

		

		
		
		
		
		// TODO Auto-generated method stub

	
}
