package j26_Abstract.abstarct01;

public abstract class  Lastik extends Honda { //asbtract parent Honda classtan extend child  abstract

    // abs child Class abs. parent child dan implement etme zorunlulugu  yoktur.
    // melekler birbirine miras birakmak zorunda degildir! abstract class actigimiz icin override zorunlulugumuz yok

    public abstract void lastikEbat(); // abs implement zorunlulugu must be method

    public void kisLastigi(){ //concrete implement zorunlulugu olmayan can be method
        System.out.println("Karli havada kis lastik onemlidir, ihmal etme..");

    }



}
