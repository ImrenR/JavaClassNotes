package j29_Collection.p03_Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class C01_Queue {
    public static void main(String[] args) {
             /*
      Queue coll. interface oldg için child calss olan LinkedList ve PriorityQueue
      ile obj uretilir.
      Eczane yemekhane vs belirli şart ile aksiyon alan elemanlar için kullanılır.
      Const seçimine göre queue obj özellikleri belirlenir.
      FİFO -> first in first out: Coll. ilk giren eleman ilk çıkar.
      Elemen en sona eklenir enbaştan silinir.
       */
         // queue print->sout(q);
         // queue eleman ekleme-> add();

  /*
     peek()-> copy-paste gibi ilk elemanı return eder ama silmez :gözetleme
     poll()-> cut-paste gibi ilk elemanı siler ve  return eder : kesme
     element() -> ilk elemanı silmeden return eder.
     remove() -> ilk elemanı siler ve return eder.. :kaldırma
ahan da Trick kösesinde bugun : poll ve remove farkı ->  eger queue coll. boş ise remove NoSuchElementException
poll ise null return eder.

   */

     Queue<String> q1=new LinkedList<>(Arrays.asList("JavaCAN","kavaSU","JavaNAZ","javvaNur"));

     // queue print =>

        System.out.println("q1 = " + q1);//[JavaCAN, kavaSU, JavaNAZ, javvaNur]
        q1.add("imren");
        System.out.println("q1 add imren sonrasi = " + q1); //[JavaCAN, kavaSU, JavaNAZ, javvaNur, imren]
        System.out.println("q1.element() = " + q1.element());//= JavaCAN
        System.out.println("q1.peek() = " + q1.peek());//JavaCAN
q1.clear();
        System.out.println("q1.size() = " + q1.size()); // 0
        System.out.println("q1.isEmpty() = " + q1.isEmpty()); //true
        System.out.println("q1.poll() = " + q1.poll()); // null
       // System.out.println("q1.element() = " + q1.element()); => clearledigimiz icin CTE verir cunku eleman yok

// ahan da Trick kösesinde bugun : offer()-> queue coll. eleman eklemek için kullanılır.
// queue'de eleman kısıtlaması varsa add() meth.=> rte
// fırlatırken offer() true-false return eder.

        q1.offer("javFer");
        System.out.println("q1.element() = " + q1.element()); // javFer
        System.out.println("q1 = " + q1); // [javFer]
    }
}
