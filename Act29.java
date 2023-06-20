package class2;

import java.util.Scanner;

public class Act29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner (System.in);
	
		int Num, mNum;
		System.out.println("Input a number:");
		Num = kb.nextInt();
		for (int i=0; i<10; i++) {
			mNum = Num * (i+1);
			System.out.println(Num + " x " + (i+1) + " = "+ mNum);
		}
		kb.close();

	}

}
