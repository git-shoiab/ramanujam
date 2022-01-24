package ramanujam;

public class StringDemo {
	public static void main(String[] args) {
		String str="hello world";// this will create one object in memory
		String str2=new String("hello world");//this will create two objects in memory - NOT PREFERRED
		
		Integer i=new Integer(20);//NOT PREFERRED and the cross line indicates that this class is deprecated
		i=Integer.valueOf(20);//Preferred
		
		Float f=new Float(20.2);//Not Preferred
		f=Float.valueOf(20.22f);//Preferred
		
		Double d=Double.valueOf(20);
		Long l=Long.valueOf(20);
		Boolean b=Boolean.valueOf(true);
		Character c=Character.valueOf('a');
		
		Integer ii=10;//Preferred
		Float ff=22.2f;
		Long ll=2323l;
		Double dd=344.34;
		Character cc='a';
		Boolean bb=true;
		
		//WRAPPER CLASSES - INTEGER,FLOAT,LONG,DOUBLE,CHARACTER,BOOLEAN
		
		String value1=args[0];
		String value2=args[1];
		
		System.out.println(value1+value2);//Since these two numbers are strings - they get concatenated when used with +
		
		//HOW TO CONVERT THE STRING TO NUMBER
		
		int n1=Integer.parseInt(value1);//will convert the string value to number...
		int n2=Integer.parseInt(value2);
		
		System.out.println(n1+n2);
		
		System.out.println(Byte.MAX_VALUE);
		
		System.out.println(Integer.min(10, 8));
		
		System.out.println(Integer.max(10, 8));
		
		System.out.println(Integer.sum(10,8));
		
	}
}
