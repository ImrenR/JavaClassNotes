package j25_Exceptions;

import java.time.DateTimeException;
import java.time.LocalDate;

public class C08_DateTimeException {

    public static void main(String[] args) {
        //DateTimeException -> tarih zaman value'lerde oluşan RTE


        try{

            LocalDate date=LocalDate.of(2024,2,30);
            System.out.println("date = " + date);
        }catch (DateTimeException e){
            System.out.println("Gecersiz bir tarih girdiniz");
            System.out.println(e.getMessage()); // Invalid date 'FEBRUARY 30'
        }


    }
}
