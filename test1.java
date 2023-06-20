package class2;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner (System.in);
		
		System.out.println("put a number with decimal:");
		double dnum = kb.nextDouble();
	
		int num = (int) dnum;
		double rem;
		rem = dnum - num;
		int rnum = ++num;
		if (rem >= 0.5) { System.out.println("your number round to:" + rnum);

	}
		else { System.out.println("your number round to:" + num);
			}
	
		
		
	}


	
	
}
