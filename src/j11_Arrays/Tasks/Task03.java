package j11_Arrays.Tasks;

public class Task03 {

    public static void main(String[] args) {
		
		 /*
       Task-> Verilen  bir arrayin tum elemanlarini
        bir sonraki konuma print eden code create ediniz
       input:  [1,2, 3]
        output [2, 3, 1]
        */

        int[] arr = {1, 2, 3};
        
        int [] newArray = new int[arr.length]; // arr uzunlugunda bos  array olusturduk

        // shift elements

        for (int i = 0; i < arr.length-1; i++) {
            newArray[i] =arr[i+1];
            
        }

        newArray[arr.length-1] = arr[0];

        for (int num:newArray){
            System.out.println(num + " ");
        }
    }

}
