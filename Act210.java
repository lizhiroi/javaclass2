package class2;

import java.util.Scanner;

public class Act210 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
	    System.out.print("Enter the first number a: ");
        int a = kb.nextInt();

        System.out.print("Enter the second number b: ");
        int b = kb.nextInt();

        
        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);

       
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping: ");
        System.out.println("First number a: " + a);
        System.out.println("Second number b: " + b);
        
        kb.close();

	}

}
