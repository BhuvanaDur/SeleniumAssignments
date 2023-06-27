package week1day2;

public class printduplicate {

	public static void main(String[] args) {
		int[] arr1 = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		  for (int i=0; i< arr1.length;i++) {
			for (int j=i+1; j< arr1.length; j++){
				if(arr1[i]==arr1[j]) {
					System.out.println("Value is: " + arr1[i]);
				}
			}
		}
	
	}

}
