package j23_Encapsulation.Tasks.task04;

public class RentApartments {//outher Clas level
    //fields..

private String name;
private int roomCount;
private  boolean balconyOrNo;
private int rent;
    // constructor..

    public RentApartments(String name, int roomCount, boolean balconyOrNo) {
        this.name = name;
        this.roomCount=roomCount;
        this.balconyOrNo = balconyOrNo;
        calculateRent();

    }


    //getter setter method

    public String getName() {
        return name;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public boolean isBalconyOrNo() {

        return balconyOrNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoomCount(int roomCount) {
       this.roomCount=roomCount;
       calculateRent();
    }

    public void setBalconyOrNo(boolean balconyOrNo) {

        this.balconyOrNo = balconyOrNo;
        calculateRent();
    }
//rent hesaplama;
    private void calculateRent(){
        switch (roomCount){
            case 0-> rent =1400;
            case 1-> rent =1700;
            case 2-> rent =2200;
            case 3-> rent =2700;
            default -> {
                rent=0;
                System.out.println("Gecersiz oda sayisi");
            }

        }
        if(balconyOrNo){
            rent+=200;
        }
    }

    public int getRent(){
        return rent;
    }
//toString method


    @Override
    public String toString() {
        return "RentApartments{" +
                "name='" + name + '\'' +
                ", roomCount=" + roomCount +
                ", balconyOrNo=" + balconyOrNo
                ;
    }
}//outher Clas sonu

class RunnerRentApartments {//inner Class level

    public static void main(String[] args) {

        RentApartments apartment1=new RentApartments("Daire 1",0,true);
        RentApartments apartment2=new RentApartments("Daire 2",1,false);
        RentApartments apartment3=new RentApartments("Daire 3",2,true);
        RentApartments apartment4=new RentApartments("Daire 4",3,true);


        System.out.println("apartment1 in oda sayisi " + apartment1.getRoomCount());
        System.out.println("balkonu var mi " + apartment1.isBalconyOrNo());
        System.out.println("Total kira " + apartment1.getRent());

        System.out.println("apartment2 nin oda sayisi " + apartment2.getRoomCount());
        System.out.println("balkonu var mi " + apartment2.isBalconyOrNo());
        System.out.println("Total kira " + apartment2.getRent());

        System.out.println("apartment3 un oda sayisi " + apartment3.getRoomCount());
        System.out.println("balkonu var mi " + apartment3.isBalconyOrNo());
        System.out.println("Total kira " + apartment3.getRent());


        System.out.println("apartment4 un oda sayisi " + apartment4.getRoomCount());
        System.out.println("balkonu var mi " + apartment4.isBalconyOrNo());
        System.out.println("Total kira " + apartment4.getRent());
    }


}//inner Class sonu
