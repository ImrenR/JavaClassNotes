package j07_StringManipulation.tasks;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

		/*  TASK :
				StringMethods:
				girilen  bir strngin ilk yarisini print eden code create ediniz
	    	    ORNEK:
		     	INPUT :istanbul
				OUTPUT :ista

		 */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");
        String name= input.nextLine();

        String newWord = name.substring(0,name.length()/2);
        System.out.println(newWord);


    }
}
