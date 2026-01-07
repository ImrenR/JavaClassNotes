package j25_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_FileInputStreamException02 {
    public static void main(String[] args) {
        FileInputStream fis= null;
        try { //outer try blok
            fis = new FileInputStream("/Users/imrenrahbay/IdeaProjects/JavaClassNotes/src/j25_Exceptions/ebikGabık");
            int k;
            try{ // inner try blok
                while ((k=fis.read()) !=-1){
                    System.out.print((char)k);
                    System.out.println("inner try block calisti");
                }
            }catch (IOException e) { // inner catch
                System.out.println("Dosya okunamiyor");
                System.out.println("inner catch block calisti");
            }

        } catch (FileNotFoundException e) { // outer catch block
            System.out.println("Dosyaya erisilemedi");
            System.out.println("outer catch blok calisti");
        }


        System.out.println("bu printi okuduysan devam et");
    }
}
