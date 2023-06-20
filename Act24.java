package class2;

import java.util.Scanner;

public class Act24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		double a, b, c, aver;
		System.out.println("Put a number a:");
		a = kb.nextDouble();
		
		System.out.println("Put a number b:");
		b = kb.nextDouble();
		
		System.out.println("Put a number c:");
		c = kb.nextDouble();
		
		aver = (a+b+c) / 3;
		kb.close();
		
		
		
		System.out.println("The average of three numbers is: " + aver);

	}

}
