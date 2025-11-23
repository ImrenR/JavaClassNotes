package j102_OCA.Q015;

public class Q015 {
	
	public static void main(String[] args) {
	StringBuilder sb1 = new StringBuilder("Duke");
	StringBuilder sb2= new StringBuilder("Duke");
	String x=new String("Asya");
	String y=new String("Asya");
		System.out.println("x.equals(y) = " + x.equals(y));
		String str1 = sb1.toString();
//		sb1.append("al");
//		sb1.reverse();
//		sb1.insert(1,"W");
		System.out.println("sb1 = " + sb1);
		System.out.println("str1.equals(sb1) = " + str1.equals(sb1));// false
		String str2=str1;
		System.out.println("str2.equals(str1) = " + str2.equals(str1));//true
		System.out.println(str1 == str2);//true
		String str3= sb1.toString();
		System.out.println("str3.equals(str1) = " + str3.equals(str1));//true
		System.out.println("str3==str1 = " + str3 == str1);//false
		System.out.println("sb2.equals(sb1) = " + sb2.equals(sb1));
		System.out.println( sb1 == sb2);





		/* insert code here*/

//	System.out.println(str1 == str2); // == checks if the objects are equal, not their values
}
}
// Which code fragment, when inserted at line 9, enables the code to print true?
//A.	String str2 = str1;
//B.	String str2 = new String(str1);
//C.	String str2 = sb1.toString();
//D.	String str2 = "Duke";





//	String str2 = str1; // the objects are equalized