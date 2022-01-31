package revision;

public class WrapperClasses {
	public static void main(String[] args) {
		int i=100;
		Integer ii=new Integer(20);//Integer is a wrapper class
		Integer iii=20;
		Integer iiii=Integer.valueOf(20);
		
		//The second one will create two objects in memory
		//The first one will be faster
		byte bb=20;
		Byte b=Byte.valueOf(bb);
		Byte bbb=new Byte(bb);
		Byte bbbb=20;
		
		//the same way it goes for 
		
		//Short, Integer, Float, Double, Character
		
		//What is the use of wrapper classes
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Integer.sum(10, 10));
		
		System.out.println(Integer.min(10, 20));
		
		System.out.println(Integer.parseInt("20"));//parse int of wrapper class Integer
		//will convert string to int
		
		String num1="100";
		String num2="200";
		
		System.out.println(num1+num2);//concatenation
		System.out.println(Integer.parseInt(num1)+Integer.parseInt(num2));//two numbers are getting added
	}
}
