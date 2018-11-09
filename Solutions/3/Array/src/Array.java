
public class Array {
	public static void main ( String [] args ) {
		int[] intArray = new int[10];
		intArray[8] = 7; // assign 7 to the 9th element
		intArray[9] = 8; // assign 8 to the last element
		System . out . println ( intArray [8]) ; // prints : 7
		
		int[] intArray2 = {3 , 2, 7};
		System . out . println ( intArray2 [0]) ; // prints : 3
		System . out . println ( intArray2 [1]) ; // prints : 2
		System . out . println ( intArray2 [2]) ; // prints : 7
	}
}