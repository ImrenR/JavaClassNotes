package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class _19_school_grade {

    public static void main(String[] args) {

        /*  Task->
        Bir öğrencinin notunu belirleyen bir Java programı yazın.
    Program üç tür puan (sınav, ara sınav ve final puanı) okuyacak ve notu aşağıdaki kurallara göre belirleyecektir:

        Eğer ortalama not >=90% =>not=A
        Eğer ortalama not >= 70% ve<90% => not=B
        Eğer ortalama not >=50% ve <70% =>not=C
        Eğer ortalama not <50% =>note=F

        Aşağıdaki örnek çıktıya bakın:
        int Quiz_score: 80
        int mid_term_score: 68
        int Final_score: 90
        print (Your grade is B)
                  (Notunuz B'dir) */


        // Code start here DO NOT CHANGE THE CODE BEFORE THIS LINE

Scanner input = new Scanner(System.in);
        System.out.println("Enter your Quiz Score :");
       int quizScore = input.nextInt();
        System.out.println("Enter your Mid term score :");
        int midScore = input.nextInt();
        System.out.println("Enter your Final Score :");
        int finalScore = input.nextInt();

        int avargE = (quizScore + midScore + finalScore)/3;

        String result = (avargE>=90) ? "your note is A" :
                (avargE>=70 && avargE<=90) ? "your note is B" :
                     (avargE>=50 && avargE<=70) ? "your note is C" :
                                                 "your note is F" ;

        System.out.println("Your result :" + result);


    }
}
