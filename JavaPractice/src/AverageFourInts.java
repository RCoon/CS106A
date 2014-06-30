import acm.program.*;

public class AverageFourInts extends ConsoleProgram {
	public void run() {
		int first = readInt("Enter first integer: ");
		int second = readInt("Enter second integer: ");
		int third = readInt("Enter third integer: ");
		int fourth = readInt("Enter fourth integer: ");
		double average = (first + second + third + fourth) / 4.0;
		println("The average is: " + average);		
	}

}
