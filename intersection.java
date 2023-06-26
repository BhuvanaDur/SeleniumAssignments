package week1day2;

public class intersection {

	public static void main(String[] args) {
				int[] arr1 = {3,2,11,4,6,7};
		int[] arr2 = {1,2,8,4,9,7};
		
		for (int i=0;i<=5;i++) {
			for (int j=0;j<=5;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println("Value:"+ " "+ arr1[i]);
				
				}
				
			}
		}
	}

}
