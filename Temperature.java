/*
 * Author: Aaron Perkins
   Email : perkina6@wwu.edu
   Last Changed: January 24th, 2022 
   Project description:
   Create class Temperature that represents 
   temperature in degrees in both Celsius and 
   Fahrenheit. Test for equality, less than and
   greater than of temperatures.
   
   */
  import java.math.BigDecimal;
  import java.math.RoundingMode;
  
  public class Temperature {
	  
	  
	  private float temperature;
	  private char scale;
	  private float convertedTemp;
	  
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
		  BigDecimal tempCelsius = new BigDecimal((5.0f*(getTemperature() - 32.0f))/9.0f).setScale(1, RoundingMode.CEILING);
		  return tempCelsius.floatValue();
	  }
	  public float getTempFahrenheit() {
		  BigDecimal tempFahrenheit = new BigDecimal((9.0f*(getTemperature()/5.0f) + 32.0f)).setScale(1,RoundingMode.CEILING);
		  return tempFahrenheit.floatValue();
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
	  // pass the parameters instead of the entire class
	  // for memory usage don't pass the entire object just the parameter you need
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