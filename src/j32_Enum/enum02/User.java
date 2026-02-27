package j32_Enum.enum02;

public class User { // POJO class


    //fields
String name;
//int role; // 0-> Admin  1-> Customer
  //  int status; //0-> Active 1-> Inactive 2->Inprogress
Role yetki;
Status durum;


    //const

    public User() {

    }

    public User(String name, Role role, Status status) {
        this.name = name;
        this.yetki = role;
        this.durum = status;
    }


    // getter setter



    //toString








}
