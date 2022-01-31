package revision;

public class TypeCastingDemo {
	public static void main(String[] args) {
		//Two types of casting - 1. upcasting (auto) 2. downcasting
		
		byte b=100;
		
		int i=b;//auto type promotion has happend - byte b is promoted to int i
		
		
		i=258;
		
		//b=i;//i is of 32 bit - you cannot assign it to a 8 bit variable
		//solution
		
		b=(byte)i;// this is what we call it as type casting
		
		//when you do downcasting - you will loose precision
		
		//the value 257 is is out of range for byte b - so the value is divided by 257 and the reminder 
		//will be given to byte
		
		
		System.out.println(b);
		
		byte num1=10;
		byte num2=5;
		
		byte result=(byte)(num1*num2);//* represents multiplication
		
		//the result of the product of num1 and num2 will always be int
		System.out.println(result);
		
		char c='a';
		c=97;
		
		int cc=97;
		
		//c=cc;// all characters are not by default numbers
		c=(char)cc;//this will convert number to character
		
		cc=c;//all numbers are by default characters
		
	}
}
