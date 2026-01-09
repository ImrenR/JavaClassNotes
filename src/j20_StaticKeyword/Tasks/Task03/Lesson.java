package j20_StaticKeyword.Tasks.Task03;

import java.util.ArrayList;

public class Lesson {

String name;
int credit;


    public Lesson(String name, int credit) {
        if(credit<1 || credit>10) {
            throw new IllegalArgumentException("Kredit 1 ile 10 arasinda olmalidir");
        }
        this.name = name;
        this.credit = credit;
    }
}
