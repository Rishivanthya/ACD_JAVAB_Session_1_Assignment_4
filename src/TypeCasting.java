package Assignment4;

import java.util.Scanner;   // Here Scanner class is imported to get input from the user

/**
 * @author Rishi vanthya
 *  In this class we are printing the sum of  the variable
 *  Type casting is done between variables
 */
public class TypeCasting {     

	public static void main(String args[])   //Main method of TypeCasting class  of different variables
	{

		/**
		 * @param args here we have declared the different type of variables
		 * 
		 * Here we are adding different type of variable and doing Type casting of the variables
		 * 
		 * 
		 */
		
		int i;           // here i-integer variable is declared 
		long l;          // l-long variable is declared
		float f;         //f- float variable is declared
		double d;        // d- double variable is declared
		System.out.println("Please enter short and byte variables:");   //Printing the massage to user to get input 
		Scanner scan = new Scanner(System.in);              //Scanner class invoke constructor with argument System.in
		byte b  = scan.nextByte();                          // user input will get stored in value b ,nextByte --for getting input as byte.
		short s = scan.nextShort();                         // user input will get stored in value s ,nextShort --for getting input as short.
		i =b + s;                                                //Adding byte and short and stored in integer variable 
		System.out.println("The Sum of values in interger variable is "+i);           //Printing the integer values
		l = s + i;                                                //Adding Short and integer and stored in long variable 
		System.out.println("The Sum of values in long variable is "+l);           //printing the long variable 
		f = i + l;                                            // Adding the integer and long variable and stored in short variable 
		System.out.println("The Sum of values in float variable is "+f);           //Printing the float variable 
		d = l + f;                                                 //Adding the long and float variable and stored in double variable  
		System .out.println("The Sum of values in double variable is "+d);           //printing the double variable
		
		
		
		
		
		
	}
}
