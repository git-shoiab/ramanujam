package ramanujam;

public class LoopingDemo {
	public static void main(String[] args) {
//		for(;;) {
//			System.out.println("infinite loop.........");
//		}
		
		//for (intialization;condition;increment/decrement)
		
		for(int i=0;i<10;i++) {
			System.out.println("The value of i is..:"+i);
		}
		
		String name[]= {"ram","shyanm","ghanshyam"};
		
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]);
		}
		
		String names[][]= {
				{"sno","name","degree"},
				{"100","rahim","phd"},
				{"200","ram","phd"},
				{"300","shyam","phd"},
		};
		//NESTED FORLOOP
		for(int i=0;i<names.length;i++) {//FOR ROWS
			for(int j=0;j<names[i].length;j++) {//FOR COLUMNS
				System.out.println(names[i][j]);
			}
		}
	}
}
