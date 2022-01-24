package ramanujam;

public class ArrayDemo2 {
	public static void main(String[] args) {
		//int twod[][]=
		int [][]twod= {
				{10,30,45,56,56},
				{45,56,67,78,89},
				{12,34,56,67,88}
		};
		int twodd[][]=new int[3][5];//here we have declared 3 rows and 5 columns
		
		System.out.println(twod[0][3]);//this will retreive 56
		
		System.out.println("Number of Rows...:"+twod.length);//this return number of rows...
		
		System.out.println("Number of Columns..:"+twod[0].length);
		
		//Remember arrays are pre initialized, so arrays where you have not initialized the array will automatically get initialized
		
		System.out.println(twodd[2][3]);//this will return 0
		
		//UNEVEN MULTI DIMENSIONAL ARRAY
		
		int twodue[][]= {
				{10,23},
				{34,56,78,8},
				{31,55,7}
		};
		
		int twoddue[][]=new int[2][];
		twoddue[0]=new int[2];
		twoddue[1]=new int[4];
		twoddue[2]=new int[3];
		
		
	}
}
