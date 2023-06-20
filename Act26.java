package class2;

import java.util.Scanner;

public class Act26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int iNum; 
		System.out.println("Input Data:");
		iNum = kb.nextInt();
		String result = Integer.toBinaryString(iNum);
		System.out.println("Binarey number is: " + result);
		kb.close();

	}

}
