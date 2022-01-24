package ramanujam;

public class ConditionsDemo {
	public static void main(String[] args) {
		int num=11;
		boolean result=(num%2==0);
		if(result) {
			System.out.println("Even Number.....");
		}
		else {
			System.out.println("odd number...");
		}
		
		
		if(num%2==0) {
			System.out.println("Even Number....");
		}
		else {
			System.out.println("Odd Number...........");
		}
		
		int day=1;
		if(day==1) {
			System.out.println("sunday...");
		}
		else if(day==2) {
			System.out.println("monday....");
		}
		else if(day==3) {
			System.out.println("Tuesday....");
		}
		else {
			System.out.println("Saturday...");
		}
		
		int month=3;
		//NESTED IF CONDITIONS
		if(day==1) {
			System.out.println("sunday...");
			if(month==1) {
				System.out.println("holy sunday....");
			}
		}
		else if(day==2) {
			System.out.println("monday....");
			if(month==1) {
				System.out.println("holy monday...");
			}
		}
		else if(day==3) {
			System.out.println("Tuesday....");
		}
		else {
			System.out.println("Saturday...");
		}
	}
}
