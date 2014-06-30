/*
* File: FahrenheitToCelsius.java
* ------------------------------
* This program converts Fahrenheit to Celsius.
*/

import acm.program.*;
// import java.text.DecimalFormat;

public class FahrenheitToCelsius extends ConsoleProgram {
	public void run() {
		println("This program converts Fahrenheit to Celsius.");
		double fahrenheit = readDouble("Enter Fahrenheit temperature: ");
		double celsius = ((5.0/9.0) * (fahrenheit - 32));
		// DecimalFormat df = new DecimalFormat("###.#");
		// celsius = Double.valueOf(df.format(celsius));
		println("Celsius equivalent " + celsius);
	}
}