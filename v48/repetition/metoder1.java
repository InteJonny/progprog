package repetition;

import java.util.Scanner;

public class metoder1 {


	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Skriv in dina Kelvin!");
		
		double Celsius = -273.15;
		double Kelvin;

		Kelvin = input.nextDouble();
		
		System.out.printf("Dina Kelvin i celsius = %.2f", kelvinToCelsius(Kelvin, Celsius ));	
		
	}
	
	static double kelvinToCelsius(double Kelvin, double Celsius ) {
		double kelvinToCelsius;
		kelvinToCelsius = Kelvin + Celsius;
		
		return kelvinToCelsius; 
	
	}
}
