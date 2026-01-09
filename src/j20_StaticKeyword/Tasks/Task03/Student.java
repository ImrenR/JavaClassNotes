package j20_StaticKeyword.Tasks.Task03;

import java.util.ArrayList;

public class Student {

String name;
int maxCredit;
ArrayList<Lesson>lessons=new ArrayList<>();
//Lesson tipinda objeler tutan liste

    public Student(String name, int maxCredit) {
        this.name = name;
        this.maxCredit = maxCredit;
    }

    public int toplamKredisi(){
    int toplam=0;
    for (Lesson l: lessons){ // lesson listesinin icine gir icindeki her lesson objesini sirayla al
        toplam+=l.credit;
    }
    return toplam;
}

// ders ekleme metodu
    public void dersEkle(Lesson lesson){
        if(toplamKredisi() + lesson.credit <= maxCredit){
            lessons.add(lesson);
            System.out.println(lesson.name + "dersi eklendi");
        }else System.out.println(lesson.name + " ders eklenemez!");
    }

}

