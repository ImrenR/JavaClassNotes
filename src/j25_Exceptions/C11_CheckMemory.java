package j25_Exceptions;

import java.util.Date;

public class C11_CheckMemory {
    public static void main(String[] args) {

        /* Java da fafiza ile ilgili bazi hazir metotlar vardir.
        * OZellikle runtime sinifi ile heap memory hakkinda bilgi alabiliriz
        * Runtime.getRuntime().totalMemory() => JVM in su anda ayirdigi toplam heap alani
        * Runtime.getRuntime().freeMemory() => Kullanilabilir bos alan
        * Runtime.getRuntime().maxMemory() => JVM in kullanabilecegi max heap alani.
        *
        * */

        Runtime runtime = Runtime.getRuntime(); // Runtime nesnesi ile memory bilgisi
        System.out.println("Baslangicta :"); // Bos hicbir sey vermedi
        System.out.println("Toplam memory: " + runtime.totalMemory()); //   136314880
        System.out.println("Kullanilabilir memory : " + runtime.freeMemory()); // 131991248
        System.out.println("Max memory : " + runtime.maxMemory()); //  2147483648

        // Buyuk bir obje olustur
        Date[] dates =new Date[100000];// 100k Date objesi olusturduk
        for (int i = 0; i < dates.length; i++) {
            dates[i]=new Date();
        }

        System.out.println("\n100.000 Date objesi olusturulduktan sonra: ");
        System.out.println("Total memory: " + runtime.totalMemory()); //    136314880
        System.out.println("Kullanilabilir memory :" + runtime.freeMemory()); // 128845520

      //objeleri null yapip Garbage Collector cagir
        dates=null; // => artik 100k date objesi referanssiz
        System.gc(); // Garbage Collecter cagirildi. Artik bu objeler temizlenebilir

        System.out.println("Garbage Collecter cagirildiktan sonra :");
        System.out.println("Toplam memory : " + runtime.totalMemory()); // 14680064
        System.out.println("Kullanilabilir memory : " + runtime.freeMemory()); // 12145896
    }
}
