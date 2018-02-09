import java.util.Scanner;

public class g{
	
public static void main(String[] args) {
 	
 	 // Declare named constants.
	 
	 final double MIN_FAHRENHEIT = -459.67;
	 
	 // Declare the variables. 

	 double fahrenheit;
	 double convertedDegrees = 0;
	 int tempScale = 0;
	 String tempScaleStr="";

	 // Creating the Scanner object
	 Scanner keyboard =  new Scanner(System.in);

	 System.out.print("Enter the temperature in Fahrenheit: ");               
	 fahrenheit =  keyboard.nextDouble();  // Set a breakpoint here   

	 // Verify the user's input
	 if (fahrenheit >= MIN_FAHRENHEIT) {   // first if-statement: Set a breakpoint here
	  
		 System.out.println(
				 "Enter the temperature scales you want to convert to:\n"+ 
				 "1. Kelvin \n"+
				 "2. Rankine \n"+
				 "3. Reaumur \n"+
				 "4. Celsius\n"+
				 "Enter a temperature scale: ");
		 tempScale = keyboard.nextInt();
	 } else
	 {	System.out.print("The temperature must be greater than or equal to " + MIN_FAHRENHEIT);
	 System.exit(0);
	 }
	 
	 if (tempScale < 1 || tempScale > 4) {  // Second-if statement: Set a breakpoint here
		 System.out.println("Unknown temperature scale  -" + "  cannot do calculation. Bye");
	 }
	  
	 else if (tempScale == 1) { // Set a breakpoint here
			 convertedDegrees = (fahrenheit + (MIN_FAHRENHEIT * -1))*5/9;
			 tempScaleStr="Kelvin"; 
		 } else if (tempScale == 2) { 
			convertedDegrees = (fahrenheit + (MIN_FAHRENHEIT * -1));  
			tempScaleStr="Rankine";
			
		 } else if (tempScale == 3) { 
			 convertedDegrees = (fahrenheit - 32)*4/9 ; // Set a breakpoint here
			 tempScaleStr="Reaumur";
				 
		 } else {
			 convertedDegrees = (fahrenheit - 32)*5/9; // Set a breakpoint here
			 tempScaleStr="Celsius";
		 }

		 System.out.println(fahrenheit + " degrees Fahrenheit is " + convertedDegrees + " degrees "+ tempScaleStr + ".");
	 





	}

}
