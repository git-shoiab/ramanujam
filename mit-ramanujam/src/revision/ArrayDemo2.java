package revision;

public class ArrayDemo2 {
	public static void main(String[] args) {
		int twod[][]= {
				{23,435,56,34},
				{38,4,45,12},
		};
		
		int twodd[][]=new int[4][5];//4 rows and 5 columns
		
		
		twodd[0][1]=100;
		
		System.out.println(twodd[0][1]);
		
		//UNEVEN MULTIDIMENSIONAL ARRAY
		
		int uneven[][]=new int[2][];
		
		uneven[0]=new int[3];
		uneven[1]=new int[1];
		
		int uneven2[][]= {
				{23,34,45},
				{12}
		};
	}
}
