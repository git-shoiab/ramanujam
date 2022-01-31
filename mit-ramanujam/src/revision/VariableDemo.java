package revision;
/*Got Introduced to
 * 1. comments - single line and block level comments
 * 2. Data types
 * 3. Initialization and range of data types.
 * 4. String - a complex type
 */
public class VariableDemo {
	public static void main(String[] args) {
		//Number and Alphabets
		//Number
		/*
		 * byte, short, int, long
		 * float, double
		 * 
		 * CHARACTER
		 * char
		 * BOOLEAN 
		 * String
		 */
		
		byte weight=100;//100 value is assigned to a variable by name weight of type byte
		short distance=32767;
		int total=343443;
		long distancetoMoon=32438430984320L;
		
		//declaration, initilization and valid identifier
		
		//initialize - you need to care of range
		//byte - 8 bit - (256)
		weight=127;//maximum positive value
		weight=-128;//minimum value
		
		//short - 16 bit
		distance=32767;//max value
		distance=-32768;//min value
		
		//int - 32 bit
		total=214_74_83_647;//max value - numbers can be seprated by a _
		total=-2147483648;//min value
		
		//Long - 64 bit
		distancetoMoon=9_223_372_036_854_775_807L;
		distancetoMoon=-9_223_372_036_854_775_808L;
		
		//float and double - 32 and 64 bit
		
		float price=1919;
		price=2323.23f;
		
		double totalPrice=2432423;
		totalPrice=233243.3434;
		
		//CHARACTER
		char c='a';
		c=97;//97 is ASCII VALUE OF a
		
		//BOOLEAN
		boolean student=true;
				student=false;
				//boolean can take either true or false
				
		//STRING - IT IS NOT A SIMPLE TYPE - ITS A CLASS AND IT IS CALLED COMPLEX TYPE
				
		String msg="welcome to Java...";//size is unlimited - it creates one object
		String str=new String("Welcome to Java");//but this is not preferred - because it creates 2 objects in memory
		
		
	}
}
