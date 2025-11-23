package j102_OCA.Q090;

public class Q090 {

	public static void main(String[] args) {

		int[] aa={};
		Integer[] bb={};

		short s1 =200;
		int s2 = 400;
		Long s3 = (long) (s1+s2);
		String s="5*";// line 1 	// wrapper oldugu icin casting sart. primitive olsaydi casting e gerek yoktu
        Long s4 = (long) s2;
		s4= Long.valueOf(s);// line 2  //bu satırda hata verir string numberla çasting olmaz
//		System.out.println("Sum is "+ s4); 	// Cannot cast from long to String
	}

	/*
		 What is the result?
		A. Sum is 600
		B. Compilation fails at line n1.
		C. Compilation fails at line n2.
		D. A ClassCastException is thrown at line n1.
		E. A ClassCastException is thrown at line n2.
		Answer: C
	 */
	}

//}
