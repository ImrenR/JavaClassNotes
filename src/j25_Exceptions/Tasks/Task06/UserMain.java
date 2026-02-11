package j25_Exceptions.Tasks.Task06;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {



    public  static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();



        int i=0;

        while(i<2){
            System.out.println((i+1) + ". kullaniciyi giriniz :");
            System.out.println("Username: ");
            String username = scanner.nextLine();

            System.out.println("Password: ");
            String password = scanner.nextLine();


            try {
                User user = new User(username,password);
                users.add(user);
                i++;
            } catch (User.PasswordTooShort e) {
                System.out.println("Hata = " + e.getMessage());
            }
        }
        System.out.println("\n Girilen kullancilar: ");
         for(User u: users) {
             System.out.println("u = " + u);
         }
    }
}
