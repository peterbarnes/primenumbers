import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number and I will tell you if it is prime!");
		int number = sc.nextInt();
		boolean prime = true;
		for(int i = 2; i < number; i++){
			if(number % i == 0){
				prime = false;
				break;
			}	
		}
		if(prime == false){		
			System.out.println("This number is not prime");
			System.out.println("Below are the factors of " + number);
			for(int i = 1; i < number; i++){
				if(number % i == 0){
					System.out.println(i);	
				}
			}
			System.out.println(number);
		} else {
			System.out.println("This number is prime!");
		}
	}
}
