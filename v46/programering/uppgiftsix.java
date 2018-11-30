package programering;

import java.util.Scanner;

public class uppgiftsix {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String xchar = " x ";
		int bas = 0;
		int space = 0;
		System.out.println("skriv in din bas");
		bas = input.nextInt();
		
		
		for (int x = 0; x <= bas; x++) {
			
			System.out.println(xchar);
			
			xchar = xchar + " x ";
		}
	}
	
}

