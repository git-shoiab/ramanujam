package ramanujam;

public class LoopingDemo1 {
	public static void main(String[] args) {
//		while(true) { //INFINITE LOOP
//			System.out.println("continous loop....");
//		}
		
//		do {
//			System.out.println("infinite loop...");
//		}while(true);
		
		int n=10;
		
		//THIS IS A PRECONDITION LOOP - THE CONDITION IS CHECKED BEFORE IN HAND
		while(n>0) {
			System.out.println("Value of n is....:"+n);
			n--;
		}
		//THIS IS A POSTCONDITION LOOP - THE CONDITION IS CHECKED AFTER GETTING EXECUTED ONCE
		do {
			System.out.println("Value of n is...:"+n);
			n++;
		}while(n<10);
	}
}
