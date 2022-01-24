package ramanujam;

//SWITCH CASE
public class ConditionsDemo3 {
	public static void main(String[] args) {
		int day=3;
		
		//SWITCH WITH NUMBER..
		switch(day) {
		default:{
			System.out.println("none of the conditions are satisfied...");
			break;
		}
		
		case 5:{
			System.out.println("Thursday...");
			break;
		}
		case 1:{
			System.out.println("Sunday.........");
			break;
		}
		case 3:{
			System.out.println("Tuesday........");
		}
	}
		char c='b';
		
		switch(c) {
		default:{
			System.out.println("none of the conditions are satisfied...");
			break;
		}
		
		case 'a':{
			System.out.println("Apple.....");
			break;
		}
		case 'b':{
			System.out.println("Ball.........");
			break;
		}
		case 'c':{
			System.out.println("Cat........");
		}
	}
		
		String month="january";
		switch(month) {
		default:{
			System.out.println("none of the conditions are satisfied...");
			break;
		}
		
		case "january":{
			System.out.println("Month of Jan jan jan.....");
			break;
		}
		case "february":{
			System.out.println("months of leaps and bounds.........");
			break;
		}
		case "march":{
			System.out.println("martians will attack .");
		}
	}
	}
}
