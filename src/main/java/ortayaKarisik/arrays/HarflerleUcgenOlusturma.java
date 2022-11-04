package ortayaKarisik.arrays;

import java.util.Scanner;

public class HarflerleUcgenOlusturma {

        /*  Problemin Tanımı
   Kullanıcıdan A'dan Z'ye kadar bir harf girmesini isteyin ve
   girilen harflere kadar olan harflerden oluşan bir piramit şeklinde çıktı oluşturun

   Örnek Ekran Çıktısı
   Harf girin: E
   A
   ABA
   ABCBA
   ABCDCBA
   ABCDEDCBA
*/
        public static void main (String[]args){

            Scanner input = new Scanner(System.in);
            System.out.println("Bir harf giriniz");
            char harf = input.next().charAt(0);
            int satirSayisi = (int) (harf) - ('A');
            System.out.println(satirSayisi);

            for (int i = 65; i <= (int) (harf); i++) {
                for (int j = 65; j <= i; j++) {
                    System.out.print((char) j);
                }
                System.out.println();
                System.out.println("deneme");
            }
        }
    }

