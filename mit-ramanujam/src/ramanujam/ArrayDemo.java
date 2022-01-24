package ramanujam;
// aan super pa, nalla panni irukkinga.....
public class ArrayDemo {
	public static void main(String[] args) {
		//ARRAYS ARE NON MUTABLE - ONCE DECLARED YOU CANNOT MODIFIY THE ARRAY SIZE OR TYPE
		int arr[]= {10,20,30,40};//Direct initialization of an array
		int arr2[]=new int[4];//Declaration of an array - by default all arrays are initialized the default value
		//for int the default value is 0 always
		
		int []arr22=new int[4];
		
		//the above arrays will have one row and multiple columns
		
		//array is an object and it has properties also
		
		System.out.println("Length of the array..:"+arr.length);//the length property of the single dimensional array will return the number of columns
		
		//To retreive the values, the array index is used.
		
		System.out.println("The value at the first position..:"+arr[0]);
		
		System.out.println("The value at the 3rd position...:"+arr[2]);
		
		//if you want to store a value
		arr[3]=999;
		System.out.println(arr[3]);
		
		//if I access the index which is not present I will get arrayindexoutofbound exception
		
		System.out.println(arr[4]);
	}
}
