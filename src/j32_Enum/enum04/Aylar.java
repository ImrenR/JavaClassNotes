package j32_Enum.enum04;



    public enum Aylar {

        OCAK(31,"kis"),
        SUBAT(31,"kis"),
        MART(30,"kis"),
        NISAN(31,"ilkbahar"),
        MAYIS(30,"ilkbahar"),
        HAZIRAN(31,"yaz"),
        TEMMUZ(30),
        AGUSTOS(31),
        EYLUL(30),
        EKIM,
        KASIM,
        ARALIK;



int gunSayisi; // primitive var
String mevsim;
        Aylar(int gunSayisi, String mevsim) {
            this.gunSayisi = gunSayisi;
            this.mevsim=mevsim;
        }

        Aylar(int gunSayisi) {
            this.gunSayisi = gunSayisi;
        }

        Aylar() {

        }


        void gunMiktari(){ // meth
            System.out.println("Gun sayisi" + gunSayisi);
        }
    }

