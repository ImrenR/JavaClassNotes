package j25_Exceptions.Tasks.Task06;

import java.util.Scanner;

public class User {

//Custom Exception
    public static class PasswordTooShort extends Exception{
        public PasswordTooShort(String message) {
            super(message);
        }
    }
//Fields
    private static int counter=1;
    private int id;
    private String username;
    private String password;
    private boolean active;
    private boolean signedIn;

//Constructor


    public User(String username, String password) throws PasswordTooShort {
        this.id=counter++;
        this.username = username;
       setPassword(password);
        this.active=true;
        this.signedIn=true;
    }

    //setter

    public void setPassword(String password) throws PasswordTooShort {
      if(password.length()<6) {
    throw new PasswordTooShort("Sifre 6 karakterden kisa olmaz !");
}
        this.password = password;
    }


    //getter

    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isActive() {
        return active;
    }

    public boolean isSignedIn() {
        return signedIn;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", active=" + active +
                ", signedIn=" + signedIn +

                '}';
    }
}
