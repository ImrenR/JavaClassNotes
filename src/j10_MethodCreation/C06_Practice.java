package j10_MethodCreation;

public class C06_Practice {

    public static void main() {
//main icinde ise method call yaptik arkadaslar:

        System.out.println("firstAndLastChars(\"Imren\") = " + firstAndLastChars("Imren"));
        printNumber(50);
        System.out.println();
         printNumber(50,60);
        System.out.println();
       int sum =  sumNumberss(4); // bunun dondurdugu degeri yazmam lazim yoksa calismaz yani string se string int ise int cunku method da return type varsa yani void degilse burda da tanimlana gerekyito
        System.out.println(sum);
        C07_AddNumbers addNumbers = new C07_AddNumbers();
       int sum2= addNumbers.sumNumberss(1,5) + 20;
        System.out.print(sum2);


    } // main sonu

    //Class icinde metodu yazdik.

    public static String firstAndLastChars(String text) {

        String firstChar = String.valueOf(text.charAt(0)); // ilk index
        String lastChar = String.valueOf(text.charAt(text.length() - 1)); // son index
        return firstChar + lastChar;
    }

    // yine class icindeyiz ve baska bir metod yazacagim baska bir islem icin

    public static void printNumber(int number) { // bir sey dondursun istemiyorum sadece print etsin "void" kullanilmali return type yerine


        for (int i = 0; i <= number; i++) {
            System.out.print(i + " ");
        }

    }

    public static void printNumber(int number1, int number2) {
        for (int i = number1; i < number2; i++) {
            System.out.print(i + " ");
        }

    }

    public static int sumNumberss(int number){ //sayi donen bir metod yapmak isterem
        int sum=0;
        for (int i = 0; i <=number ; i++) {
            sum += i;
        }
        return  sum; // toplami donecek
    }
}

//Class sonu
