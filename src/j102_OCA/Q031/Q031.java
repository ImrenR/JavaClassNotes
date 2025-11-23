package j102_OCA.Q031;
public class Q031 {
	public static void main(String[] args) {
		// Given The Code Fragment
		String array1 [] ;  		// 1 2 3
		String array2 [] = new String[5]; 	// 0 0 0 0 0
		array1= array2;						// 1 2 3     (not 1 2 3 null null)
		for (String  i : array1) {
			System.out.print(i + " ");
		}
		System.out.println();
		int array3 [] = new int[3];
		//array3 = array2; 					// 1 2 3
		for (int i : array3) {
			System.out.print(i + " ");
		}
	}
}
//What is the result?
//A.	1 2 3 0 0
// 		1 2 3 0 0
//B.	An Exception is thrown at run time.

//C.	1 2 3 0 0
// 		1 2 3

//D.	1 2 3
// 		1 2 3
