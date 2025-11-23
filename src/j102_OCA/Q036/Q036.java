package j102_OCA.Q036;

public class Q036 {

	//Continue break sadece döngülerde kullanabiliriz Continue skip ,, break bulunan döngüden çıkmak için
	// System.exit()---> tüm programı terminate eder

	public static void main(String[] args) {
		String[][] arr = {{"a","1"},{"c"},{"b","2"}};

		for (int i = 0; i < arr.length; i++) {
			if(arr[i][0].equals("c")){
				continue;// out loop 'tan çıkar
			}

			for (int i1 = 0; i1 < arr[i].length; i1++) {

				if(arr[i][i1].equals("b")){

				}
				System.out.print(arr[i][i1]);
				System.out.println("Done");
			}
		}

















//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]+ " " ); // prints arr[0] which is A
//			if (arr[i].equals("C")) {  // returns false for arr[0]
//				continue;
//				// if condition is false so does not continue in loop
//			}				//true oldugu
//			System.out.println("Work Done"); // printed out
//
//		}
	}
}
//What is the result?
//A.	A B C Work done
//B.	A B C D Work done
//C.	A Work done
//D.	Compilation fails





// Aswer is C