package j32_Enum.enum02;

public class Runner {
    static void main() {
        User u1 =new User();
        u1.name= "Imren";
        u1.yetki=Role.ADMIN;
        u1.durum=Status.ACTIVE;

        User u2=new User("imren",Role.ADMIN,Status.INPROGRESS);

    if(u1.yetki == Role.ADMIN){
        System.out.println(u2.name + "admin olarak erisminiz aciktir");
    }else System.out.println(u1.name + "Customer olarak erisemezsiniz");



    }
}
