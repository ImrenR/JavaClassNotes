package j18_StringBuilder;

public class C02_StringBuilder {
    public static void main(String[] args) {
        // StringBuilder create etme-> Decleration

        // 1. yol->

StringBuilder sbb1 = new StringBuilder(); // bos sb create edildi.
        System.out.println(sbb1); // hiclik
        System.out.println("sbb1.length() = " + sbb1.length()); //0 eleman yok cunku icinde
        System.out.println("sbb1.capacity() = " + sbb1.capacity()); // default 16 gelir cunku bir karakter girmedik
        System.out.println("appent result = " + sbb1.append("imren")); // imren eklendi
sbb1.append("Java developer lead");
        System.out.println("sbb1.capacity() = " + sbb1.capacity()); // 34 => 16*2 +2
// capaciy asilinca 2 katinin 2 fazlasi atanir
        sbb1.append("imren bana java al");
        System.out.println("sbb1.capacity() = " + sbb1.capacity()); // 70 => 34*2 +2
        // 2. yol->

        StringBuilder sb2 = new StringBuilder("imren offer aldi    :))");
        System.out.println("sb2 = " + sb2);
        System.out.println("sb2.capacity() = " + sb2.capacity()); //39
        //  bu 39 nasil oldu =?
        System.out.println("sb2.length() = " + sb2.length()); //23
        // 23 + 16 = 39 => 23 karakterlik bir value + default 16 toplami = 39
        System.out.println("trimTosize oncesi sb2 = " + sb2.capacity()); // 39
        sb2.trimToSize(); // sizedeki kullanmadigin yerleri siler => hafiza yonetimi icin onemlidir => bosluklari siler
        System.out.println("trimToSize sonrasi sb2 = " + sb2.capacity()); // 23

        // 3. yol->

        StringBuilder sb3 = new StringBuilder(17);
        System.out.println("sb3 = " + sb3); // hiclik alirim cunku yazdiracak bir karakter yok
        System.out.println("sb3.length() = " + sb3.length());  // 0
        System.out.println("sb3.capacity() = " + sb3.capacity()); //31
        sb3.append("imren ile java cok funny :) ");
        System.out.println("sb3 = " + sb3);
        System.out.println("sb3.capacity() = " + sb3.capacity()); //36 => 17*2 +2
        System.out.println("sb3.length() = " + sb3.length()); //28


        // Sb'deki istenen index character alma

        System.out.println("sb3.charAt(4) = " + sb3.charAt(4)); // n
        System.out.println("sb3.charAt(13) = " + sb3.charAt(13)); // a
     //    System.out.println("sb3.charAt(99) = " + sb3.charAt(99)); // => calistiriken hata aldigimiz icin RTE aldik
//olmayan index karakteri istedik yukarda

        // Sb'deki belirli aralık character alma√

        System.out.println("belirli karakter araligi = " + sb3.subSequence(11, 20)); //) = ava cok f
        System.out.println("sb3.substring(3,19) = " + sb3.substring(3, 19)); // en ile java cok
        // subSequence ve subString ayni seyi yapar

        // Sb'deki istenen index char silme

        System.out.println("sb3.deleteCharAt('a') = " + sb3.deleteCharAt(9)); // imrjava cok funny :)

        // Sb'deki istenen aralık index char silme

        System.out.println("sb3.delete(3,9) = " + sb3.delete(3, 9)); // = imr java cok funny :)
        // en ile yi sildi (3 ile 9. index araligi)

        // Sb'e istenen char ve Char lar girdi yapma

        System.out.println("insert etme =" + sb3.insert(3, sb2, 7, 12)); //  =imrffer java cok funny :)
 // 3. karakterden itibaren sb2 kinin 7 ile 12 karakter araligini getir

        // Sb'deki istenen index char update (set)

        sb3.setCharAt(2,'$');
        System.out.println("sb3 = " + sb3);// = im$ffer java cok funny :)

        // Sb'deki istenen index birden cok char set etmek

        System.out.println("replace etme " + sb3.replace(1, 7, "*"));
// i* java cok funny :)
        //1. indexten 7. indexe kadar * olsun ama bir adet yildiz verdik 6 karakteri siler
        System.out.println("sb3 = " + sb3.replace(1, 7, "**********"));
//i********** cok funny :)

        // Sb obj String variable convert(cevirme)
        StringBuilder sb4 = new StringBuilder("javacan");
        System.out.println("sb4.toString() = " + sb4.toString());//haluk

        //String variable SB'e convert etme

        String name = "haluk";
        StringBuilder sbJava = new StringBuilder(name);
        System.out.println("sbJava = " + sbJava);// haluk
          /*
        compareTo()->metodunu iki SB'i eşitliğini kontrol etmek için ilk characterden itibaren tum characterleri karşılaştırır.
        eşit characterler için herhangi bir return vermezken
        farklı characterler için ascii table göre kaç değer geri veya ileri oldg print eder
        Tum characterler eşit ise 0 return eder
        ahan da Trick-> SB ile String variable compare edilirse :CTE -> elma armut kıyası olmaz...
         */
StringBuilder sb5 = new StringBuilder("Bahanesi olanin basarisi olmaz");
        StringBuilder sb6 = new StringBuilder("Bahanesi olanin basarisi olmaz");
        StringBuilder sb7 = new StringBuilder("Bahanesi olanin basarisi olmaz :)");
       String str = "Bahanesi olanin basarisi olmaz";

        System.out.println("sb5.compareTo(sb6) = " + sb5.compareTo(sb6)); //birbirine esit oldugu icin 0 verir
     //   System.out.println("sb7.compareTo(str) = " + sb7.capacity(str)); // yapamazsin yazarken hata verdi CTE

        System.out.println("sb6.compareTo(sb7) = " + sb6.compareTo(sb7)); // -3 verir ascii degerine gore ne kadar uzakta ne kadar geride degerini verir


        // SB eşitliği

        System.out.println("sb5.equals(sb6) = " + sb5.equals(sb6)); //false
       System.out.println("sb5 ==sb6 = " + (sb5 == sb6)); // false
        // trick-> Sb 'da equals() meth aynı == gibi return eder: hem ref. hem de value controlu yapar.

        // Sb character'leri index'e göre ters cevirme
        //reverse
        System.out.println("reverse oncesi sb5 = " + sb5); // Bahanesi olanin basarisi olmaz
        System.out.println("sb5.reverse() = " + sb5.reverse()); //  zamlo isirasab ninalo isenahaB
        System.out.println("reverse sonrasi sb5 = " + sb5);//  zamlo isirasab ninalo isenahaB
    }
}
