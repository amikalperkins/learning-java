

/*
 * Author: Aaron Perkins
   Email : perkina6@wwu.edu
   Last Changed: January 16th, 2022 
   Project description:
   Create class Temperature that represents 
   temperature in degrees in both Celsius and 
   Fahrenheit. Test for equality, less than and
   greater than of temperatures.
   
   
   Overloading : see pg 430
   */
	
  public class Temperature {
	

	private float temperature;
	private char scale;
	private float convertedTemp;
	private float tempCelsius;
	private float tempFahrenheit;
	
	// Constructors
	// if no values passed assume default constructor
	public  Temperature() {
		temperature = 0.0f;
		scale = 'C';
	}
	public  Temperature(float degrees, char scaleTemp) {
		this(); //invokes default constructor if one or the other parameter is not passed
		temperature = degrees;
		scale = scaleTemp;
		//scale = Character.toUpperCase(scaleTemp);	
		//instead of Character.toUpperCase() on all of these I just put it in the driver
		// function and restrict on keyboard input
	}
	public Temperature(float degrees) {
		this();
		temperature = degrees;
	}
	public Temperature(char scaleTemp) {
		this();
		scale = scaleTemp;
	}

	// accessors 
	public float getTemperature() {
		return temperature;
	}
	
	public char getScale() {
		return scale;
	}
	
	// return a formatted value? .1 
	public float getTempCelsius() {
		tempCelsius = (5.0f*(getTemperature() - 32.0f))/9.0f;
		return tempCelsius;
	}
	public float getTempFahrenheit() {
		tempFahrenheit = (9.0f*(getTemperature()/5.0f) + 32.0f);
		return tempFahrenheit;
	}
	
	public void setNumberDegrees(float degrees) {
		temperature = degrees;
	}
	
	public void setScale(char scaleTemp) {
		scale = scaleTemp;
	}
	public void setScaleAndDegrees(float degrees, char scaleTemp) {
		temperature = degrees;
		scale = scaleTemp;
	}

	
	// testing Equality of two temperature objects
	public boolean equalityCheckOfTemps(Temperature otherTempClass) {
		//call private conversion scale 
		scaleConversion(otherTempClass);
		return this.getTemperature() == otherTempClass.convertedTemp ? true : false;
	}
	//testing Greater than of two temperature objects
	public	boolean greaterThanCheckOfTemps(Temperature otherTempClass) {
		return this.getTemperature() > otherTempClass.convertedTemp  ? true : false;
	}
	//testing Less than of two temperature objects
	public boolean lessThanCheckOfTemps(Temperature otherTempClass) {
		return this.getTemperature() < otherTempClass.convertedTemp ? true : false;	
		
	}
	// helper method to convert to same scale and then pass along
	// converted temperature to test for ==, > and <
	private void scaleConversion(Temperature otherTempClass) {
		if(this.scale == 'C' && otherTempClass.scale != 'C'){
			otherTempClass.convertedTemp = otherTempClass.getTempCelsius();
		} else if(this.scale == 'F' && otherTempClass.scale != 'F') {
			otherTempClass.convertedTemp = otherTempClass.getTempFahrenheit();
		} else if(this.scale == 'C' && otherTempClass.scale == 'C') {
			otherTempClass.convertedTemp = otherTempClass.getTemperature();
		} else {
			otherTempClass.convertedTemp = otherTempClass.getTemperature();
		}
	}
}