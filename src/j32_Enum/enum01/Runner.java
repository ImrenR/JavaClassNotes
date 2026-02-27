package j32_Enum.enum01;

import java.time.DayOfWeek;

public class Runner {
    public static void main(String[] args) {
        //Task-> verilen yılın ayını numarasına göre kaç gun ektğini print eden code create ediniz.

// ENUM =>
        /// (Enumarations) A special kind of class that represents a fixed set of constants.
        /// They improve code readability and are easy to maintain.
        ///  More efficient with switches when comparing Strings.

//int ay=3;
Aylar ay = Aylar.MART;
        System.out.println(ay.ordinal()); // 2
        System.out.println(ay.name()); // MART
        switch (ay) {
    case OCAK:
        System.out.println("Ocak ayi 31 gun");
        break;
    case SUBAT:
        System.out.println("Subat ayi 28 gun");
        break;
    case MART:
        System.out.println("Mart ayi 31 gun");
        break;
    case NISAN:
        System.out.println("Nisan ayi 30 gun");
        break;
    case MAYIS:
        System.out.println("Mayis ayi 31 gun");
        break;
}

       // DayOfWeek gun=DayOfWeek.MONDAY;
     //   System.out.println(gun.ordinal()); // ordinal metodu index i verir monday 0. indextir outpu => 0



    }
}
