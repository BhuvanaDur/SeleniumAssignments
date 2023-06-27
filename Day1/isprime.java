package week1day1;

public class isprime {

	public static void main(String[] args) {
			
		int value=13;
		boolean confirm = false;
		
		for(int i=2;i<value-1;i++) {
			if(value%i == 0) {
				confirm=true;
				break;
			}
		}

	if(!confirm) {
		System.out.println(value + " " + "is prime number");
	}
	else {
		System.out.println(value + " " + "is not prime number");
	}
		
	}

}
