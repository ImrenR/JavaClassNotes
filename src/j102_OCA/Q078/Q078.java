package j102_OCA.Q078;

public class Q078 {
	public static void main(String[] args) {
		String str1="Java";
		String str3="";

		str1+="a";
		str3+="Java"+"a";
		System.out.println("str3.hashCode() = " + str3.hashCode());
		System.out.println("str1.hashCode() = " + str1.hashCode());

		System.out.println("str1==str3 = " + (str1 == str3));//true



	}

}
/**
 * What is the result?
A. false, false
B. false, true
C. true, false
D. true, true
*/




// Answer C