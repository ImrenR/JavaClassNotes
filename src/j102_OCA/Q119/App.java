package j102_OCA.Q119;

public class App {
  String greet="Welcome!";
  int x=4;
    public App(){
         x=3;
        String  greet="Hello!";
        System.out.println(greet);//hello
    }
    public void setGreet(){

        String greet="Good Day!";
    }

    public static void main(String[] args) {
        App t=new App();
        String greet="Good Luck!";
        System.out.println("Objeye ait  "+t.greet+" mainde ki greet:"+greet);
    }
}
/*What is the result?
A. Good Luck!
B. Good Day!
C. Welcome!
D. Hello!
answer C
 */
