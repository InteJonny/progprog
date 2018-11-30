package repetition;

import java.util.Scanner;
public class uppgifttwo {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		String ord = "Hej";
		String slut = "avslutat";
			System.out.println("skriv ord");
			while (!ord.equals ("EXIT")) {
			ord = input.nextLine();
			
			if (ord.equals("EXIT")) {			
			System.out.println(slut);	
				
			}
		}
	}	
}
