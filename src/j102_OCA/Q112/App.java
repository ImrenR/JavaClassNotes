package j102_OCA.Q112;

public class App {
    int count; //normalde static yok burda

    public  static  void displayMsg(){
        App a=new App();
        a.count=5;                                       //line1
        System.out.println("Welcome"+"Visit Count: "+a.count); //line2
    }

    public static void main(String[] args) {
      App.displayMsg();           //line3
       App.displayMsg();           //line4
    }
}
/*What is the result?
A. Compilation fails at line n3 and line n4.
 B. Compilation fails at line n1 and line n2.
 C. Welcome Visit Count:1Welcome Visit Count: 1
  D. Welcome Visit Count:1Welcome Visit Count: 2
  Answer:B  ?

 */