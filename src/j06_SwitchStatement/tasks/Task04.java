package j06_SwitchStatement.tasks;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
		/*
		Task-> Girilen ay simine göre   ayin kac cektigini print eden code create ediniz.
		 */

Scanner  input = new Scanner(System.in);
        System.out.println("Istediginiz ayi giriniz :");
        String aylar= input.nextLine();

        switch (aylar){
            case "January":
                System.out.println("31");
                break;
            case "February":
                System.out.println("28");
                break;
            case "March":
                System.out.println("30");
                break;
            case "April":
                System.out.println("31");
                break;
            case "May":
                System.out.println("30");
                break;
            case "June":
                System.out.println("31");
                break;
            case "July":
                System.out.println("30");
                break;
            case "August":
                System.out.println("31");
                break;
            case "September":
                System.out.println("30");
                break;
            case "October":
                System.out.println("31");
                break;
            case "November":
                System.out.println("30");
                break;
            case "December":
                System.out.println("31");
                break;
            default:
                System.out.println("Gecersiz bir ay girdiniz");
                break;

        }
    }
}
