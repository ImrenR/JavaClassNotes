package j14_Varargs;

public class Task18 {
    static void main() {

        //Create a method calculate that takes:
        //
        //an int choice
        //
        //varargs of integers
        //
        //Using a switch statement:
        //
        //1 → add all numbers
        //
        //2 → subtract all numbers from the first
        //
        //3 → multiply all numbers
        //
        //4 → stop calculation (use break)
        //
        //Print the result.

        calculate(1, 5, 10, 20);   // toplama
        calculate(2, 50, 10, 5);   // çıkarma
        calculate(3, 2, 3, 4);     // çarpma
        calculate(4, 1, 2, 3);     // durdur



    }

    private static void calculate(int choice, int... numbers) {
        switch (choice) {
            case 1: // toplama
                int toplam =0;
                for (int sayi: numbers) {
                    toplam +=sayi;
                }
                System.out.println("toplam = " + toplam);
                break;

            case 2:
                if (numbers.length ==0){
                    System.out.println("Hic sayi yok!");
                    break;
                }
                int fark = numbers[0]; // ilk sayidan basla
                for (int i = 0; i < numbers.length; i++) {
                    fark -=numbers[i];
                }
                System.out.println("fark = " + fark);
                break;
            case 3:
                if(numbers.length == 0){
                    System.out.println("hic sayi yok!");
                    break;
                }
                int carpim=1;
                for (int sayi: numbers){
                    carpim *=sayi;
                }
                System.out.println("carpim = " + carpim);
                break;

            case 4:
                System.out.println("Hesaplama durduruldu :");
                break;

            default:
                System.out.println("Gecersiz secim!");
        }
    }
}
