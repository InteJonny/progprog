package repetition;

import java.util.Scanner;

public class uppgift{
	
	public static void main(String[] args) {
		
		double tal = 1;
		double summa = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please type a number: ");
		
		while (tal != 0) {
			
			tal = input.nextDouble();
			summa += tal;
		}
		
		System.out.println("The sum of all nubers is " + summa);
		
		input.close();
		
}
}