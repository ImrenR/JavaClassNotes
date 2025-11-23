package j102_OCA.Q060;

interface Readable {
	
	public void readBook();
	public void setBookMark();
}
 class Book implements Readable {
	public void readBook2() {
		System.out.println("Read Book Parent");

	}

	@Override
	public void readBook() {
		System.out.println("Read Book Parent");

	}

	 @Override
	 public void setBookMark() {

	 }

	 // line n2  // abstract class oldugu icin setBookMark();'i implement etmesine gerek yok.
}
class EBook extends Book {
	public static void main(String[] args) {
		EBook book1 = new EBook();
		book1.readBook();
		book1.setBookMark();


	}




	//1--Eğer abstract class bir interface implement ederse methodlarını override etmek zorunda değil
	//2--Eğer abstract class'tan child class oluşturulursa abstrack class implement edilmeyen methodlar override edilmek zorunda
	// line n3


	// line n4

}
/* And given the code fragment:  Book book1 = new EBook(); book1.readBook();
 * Which option enables the code to compile? 
 * 
A. Replace the code fragment at line n1 with:
	class Book implements Readable{
	
B. At line ne insert:
	public abtract void setBookMark();
	
B. Replace the code fragment at line n3 with:
	abstract class EBook extensd Book{
	
D. At line n4 insert:
	public void setBookMark(){}

*/