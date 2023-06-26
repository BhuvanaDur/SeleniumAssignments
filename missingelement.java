package week1day2;

import java.util.Arrays;

public class missingelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,3,4,7,6,8};

		// Sort the array
		Arrays.sort(arr1);
		
		for (int i=0;i<=arr1.length;i++) {
			if(i+1!=arr1[i]) {
				System.out.println("missing value" + " "+ (i+1));
				break;
			}
		}
    }
}
