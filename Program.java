/*
 * Author: Aaron Perkins
   Email : perkina6@wwu.edu
   Last Changed: January 24th, 2022 
   Project description:
   Temperature Instantiation 
   Create a Driver Program that tests all 
   methods, invoke each constructor, include 
   at least one true and one false case for each 
   comparison method and to test for equality, 
   less than, greater than
*/

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		String response;
		float temperature;
		char scale;
		
	
		do {
			//Input from keyboard values to instantiate temperature
			//class
			System.out.println("Enter a temperature value: ");
			temperature = keyboard.nextFloat();
			System.out.println("Enter a temperature scale (C or F): ");
			scale = Character.toUpperCase(keyboard.next().charAt(0));
			Temperature temp1 = new Temperature(temperature, scale);
			System.out.println("Enter a temperature value: ");
			temperature = keyboard.nextFloat();
			System.out.println("Enter a temperature scale (C or F): ");
			scale = Character.toUpperCase(keyboard.next().charAt(0));
			Temperature temp2 = new Temperature(temperature, scale);
			// Test Accessors : getCelsius() getFahrenheit
			System.out.println("Temperature in Celsius " + temp2.getTempCelsius());
			System.out.println("Temperature in Fahrenheit " + temp1.getTempFahrenheit());
			//Equality, Greater Than, and Less Than Check
			System.out.println("Are the temperatures equal? " + temp1.equalityCheckOfTemps(temp2));
			System.out.println("Is " + temp1.getTemperature() + temp1.getScale() + " > " + temp2.getTemperature() + temp2.getScale() 
			+ " : " + temp1.greaterThanCheckOfTemps(temp2));
			System.out.println("Is " + temp1.getTemperature() + temp1.getScale() + " < " + temp2.getTemperature() + temp2.getScale() 
			+ " : " + temp1.lessThanCheckOfTemps(temp2));
			//Test Mutators : setNumberDegrees(), setScale(), setScaleAndDegrees()
			temp2.setNumberDegrees(25);
			System.out.println("Set new degrees: " + temp2.getTemperature());
			temp2.setScale('F');
			System.out.println("Set new scale: " + temp2.getScale());
			temp2.setScaleAndDegrees(30, 'C');
			System.out.println("Degrees and scale changed: " + temp2.getTemperature() + temp2.getScale());
			//Constructor Testing
			Temperature defaultConstructor = new Temperature();
			System.out.println("Default constructor temp: " + defaultConstructor.getTemperature() + " Default Scale: " + defaultConstructor.getScale());
			Temperature degreesConstructor = new Temperature(10);
			System.out.println("Degrees Constructor temp: " + degreesConstructor.getTemperature());
			Temperature degreesScaleConstructor = new Temperature(15, 'F');
			System.out.println("Degrees and Scale Constructor: " + degreesScaleConstructor.getTemperature() + degreesScaleConstructor.getScale());
			System.out.println("Test again?");
			response = keyboard.next();
		
		} while(response.equalsIgnoreCase("yes"));
		System.out.println("End of test");
		
		
		keyboard.close();
		

		

	}
}

