package j04_JavaOperators.j02_Assaignment_Atama_Operators;

public class C01_AtamaOperatoru {
    //    =	        x = 8	    x = 8
    //    +=	    x += 3	    x = x + 3
    //    -=	    x -= 3	    x = x - 3
    //    *=	    x *= 3	    x = x * 3
    //    /=	    x /= 3	    x = x / 3
    //    %=	    x %= 3	    x = x % 3
    public static void main(String[] args) {

        int imrenage = 34;
        System.out.println(imrenage); // 34
        System.out.println(imrenage + 5);

        System.out.println(imrenage); // imrenage degismez yine 34 kalir. cunku atama yaoilmadi "=" ile atama yapilir.

    imrenage += 7;
        System.out.println(imrenage); // "=" ile atama yaptik o yuzden imrenage artik 42 olur.
    }
}
