package ramanujam;

public class StringDemo2 {
	public static void main(String[] args) {
		String s="hello";
		
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(4));
		
		System.out.println(s.substring(0,5));
		String s1="b";//98
		String s2="a";//97
		
		System.out.println(s1.compareTo(s2));//used in sorting programs
		
		System.out.println(s.contains("ellaaa"));
		
		String str1="hello";
		String str2=new String("Hello");
		System.out.println(str1==str2);//Never compare string with equalto equalto operator
		
		//instead make use of equals method
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));//when we use equals method, it actually compares the value inside the string
		
		//where as when the == operator is used, it compares the memory of the two objects
		
		//String is immutable
		
		String n1="ramanujam";
		String n2=n1;

		n1=n1+" world";
		
		System.out.println(n1);
		System.out.println(n2);
		
		//String once created cannot be changed...
		
		//Thats why, we never create string using String class if the value is dynamaic and ever changing 
	}
}
