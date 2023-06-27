package week1day1;

import java.util.Iterator;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)
		int range = 8, firstnum=0, secnum=1, sum;

				// Print first number
				System.out.println(firstnum);
				System.out.println(secnum);
				// Iterate from 1 to the range
				for (int i=1; i<=range; i++) {
					
					sum = firstnum+secnum;
					System.out.println(sum);
					firstnum=secnum;
					secnum=sum;
			   }
		}

}
