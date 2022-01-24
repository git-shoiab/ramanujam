package ramanujam;

public class DataTypeDemo {
	public static void main(String[] args) {
		//1. Valid Identifier
		//2. Initialization
		
		//3. CASTING
		
		long l=100;
		
		int i=(int)l;
		short s=(short)i;
		byte b=(byte)s;
		
		// By default you cannot decrease the size, but you can do that explicitly
		short ss=b;
		int ii=ss;
		long ll=ii;
		
		//
		int n=258;
		byte nb=(byte)n;
		System.out.println(nb);
		
		float f=100;
		n=(int)f;
		System.out.println(n);
		float ff=1.3f;
		n=(int)ff;
		System.out.println(n);//it will print without decimals
		
		f=n;//you can assign a int to float - valid
		char c='a';
		System.out.println(c);
		n=c;
		System.out.println(n);
		System.out.println((char)n);
		//c=n;//integer to a character is - INVALID
		c=(char)n;
		System.out.println(c);
	}
}
