// Temperature Instantiation 
// Driver Testing : see pg 423 
// Create a Driver Program that tests all methods
// add Character.toUpperCase() on input to make all 
// chars UpperCase
// when testing driver program think of your object
// creation and how to pass those references
// tests all methods, invoke each constructor, to include at least
// one true and one false case for each comparison method
// and to test at least the following temperature pairs
// for equality.

public class Program {

	public static void main(String[] args) {
		
		Temperature hot = new Temperature(-40f,'f');
		Temperature samesies = new Temperature(-40f, 'c');

		System.out.println(hot.equalityCheckOfTemps(samesies));
		System.out.println(hot.greaterThanCheckOfTemps(samesies));	
		System.out.println(hot.lessThanCheckOfTemps(samesies));
		}

}
