package ramanujam;
//TERNARY OPERATOR DEMO
public class ConditionsDemo2 {
	public static void main(String[] args) {
		int num=11;
		
		boolean result=num%2==0;
		
		String output=result?"Even Number...":"Odd Number...";
		
		//? - ternary operator
		
		System.out.println(output);
		
		output=num%2==0?"Even Number...":"Odd Number...";
		
		System.out.println(output);
	}
}
