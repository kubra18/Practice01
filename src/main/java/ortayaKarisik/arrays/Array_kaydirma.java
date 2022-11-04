package ortayaKarisik.arrays;

import java.util.Arrays;

public class Array_kaydirma {
    //Verilen 3 elemanli bir array'in tüm elemanlarini bir soldaki konuma tasiyacak bir program yazin.
    //// Örnek, array [1,2,3] ise output [2,3,1] olacak.
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int ilkeleman = arr[0];
        for (int i = 0; i < arr.length-1 ; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length - 1] = ilkeleman;
        System.out.println(Arrays.toString(arr));

        /*
        int arr [] = {1,2,3};
int yeniarr [] = new int[arr.length];

int index = 0;
for (int i=1; i<arr.length; i++){
    yeniarr[index] = arr[i];
    index++;
}
yeniarr[index]=arr[0];
    System.out.println(Arrays.toString(yeniarr));

}
         */
    }
}
