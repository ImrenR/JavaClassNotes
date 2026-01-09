package j20_StaticKeyword.Tasks.Task02;

public class ElektrikHesabi {

int toplamTuketim;
 double oran;
double fatura;


    public ElektrikHesabi(int toplamTuketim, double oran) {
        this.toplamTuketim = toplamTuketim;
        this.oran = oran;
    }
    public double tuketimEnerji(int aylikTuketim){
        return toplamTuketim+=aylikTuketim;
    }
    public double odenecekTutar(){
       fatura=oran*toplamTuketim;
       return fatura;
    }
}
