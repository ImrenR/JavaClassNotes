package j14_Varargs;

public class Task17
{
    static void main() {
        //Create a method isValidPassword that accepts varargs of Strings, where each string represents a password.
        //
        //For each password, check:
        //
        //Length ≥ 8
        //
        //Contains at least one digit (0–9)
        //
        //Contains at least one uppercase letter
        //
        //Print whether each password is VALID or INVALID.

        isValidPassword("Haluk123", "abc", "Password1", "passWord", "12345678");
    }

    private static void isValidPassword(String... passwords) {

        for (String pwd : passwords) {
            boolean uzunluk = pwd.length() >=8;
            boolean rakam =false;
            boolean buyukHarf = false;

            for (char ch: pwd.toCharArray()) {
                if(Character.isDigit(ch)){
                    rakam = true;
                }
                if(Character.isUpperCase(ch)){
                    buyukHarf = true;
                }
            }

            if(uzunluk && rakam && buyukHarf) {
                System.out.println("VALID = " + pwd);
            }else System.out.println(pwd + "INVALID");
        }
    }
}
