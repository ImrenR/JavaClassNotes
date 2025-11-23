package j05_ifStatementTernaryOperator;

public class C01_ifStatement {
    public static void main(String[] args) {
       /*
       if statement blok herhangi bir actionun belirli bir şarta bağlı çalışmasını sağlamak için kullanılır.
        */

        // if blok'dan sonra {} kullanılmaz ise ilk satır veya komut if ile çalışır diğer komutlar if'den bağımsız olur-> bad practice

int halukAge = 50;
int imrenAge=34;
if (imrenAge==halukAge) System.out.println("ayni yastasiniz");
System.out.println("ooo yeeeee"); // calisir cunku iften bagimsizdir
 if (imrenAge<halukAge){
     System.out.println("imren haluk abine meraba de"); // calisir cunku statement true dur.
 }
 if(imrenAge>halukAge){
     System.out.println("bu yanlistir yaw");  // calismaz cunku statement false tur.
 }
        System.out.println("selamke babus"); // calisir cunku iften bagimsizdir
    }


}

