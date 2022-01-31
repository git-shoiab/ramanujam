package revision;

public class ArrayDemo {
	public static void main(String[] args) {
		int arr[]= {10,34,56,78,1,3};
		
		System.out.println(arr[0]);
		System.out.println(arr[2]);
		
		//assign a value
		
		arr[2]=100;
		
		System.out.println(arr[2]);
		
		int arr2[]=new int[5];//5 column single dimensional array
		
		//remember by default 0 will be initialized in array
		
		System.out.println(arr2[1]);
		System.out.println(arr2[4]);
		
		arr2[4]=5000;
		
		System.out.println(arr2[4]);
		
		//I will get a error/exception if I access a position which is not present in array
		
		System.out.println(arr2[5]);//this is trying to access the 6th column, which is not present
		
		int []arr3=new int[4];//valid
		
	}
}
