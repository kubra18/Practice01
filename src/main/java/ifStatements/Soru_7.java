package ifStatements;

import java.util.Scanner;

public class Soru_7 {
    //Tam isim için dilbilgisi kurallarını kontrol etmek için kodu yazınız.
    //a) Kodunuz "ali Can", "Ali can", "ali can" için "Baş harflerinde hata" yazmalıdır.
    //b) Kodunuz, aşağıdaki gibi tek kelimeler için "Ad veya soyadı eksik" yazmalıdır.
    //c) "Ali" veya "Can" veya "ali"Kodunuz "ALI CAN" gibi tüm formatlar için "Format hatası" yaz- malıdır.
    //d) Kodunuz bir veya daha fazla boşluk (" " veya " " gibi karakterler) için " Isim girilmedi" yazmalıdır.
    //e) Ad, harfler ve boşluktan başka herhangi bir karakteri içeriyorsa, kodunuz "Geçersiz Ad" yazmalıdır.
    //Not : Kısaltmada 1'den fazla hata varsa, ilgili tüm hata mesajları çıktı olarak konsolda görünmelidir. Örneğin; "ali3" için kodunuz
    // "Baş harflerinde hata", "Ad veya soyadı eksik" ve "Geçersiz Ad"

    //String isim = "ali Can?";
    //String adinIlkHarfi = isim.substring(0,1);
    //Integer boslukIndex = isim.trim().indexOf(' ');
    //String soyadinIlkHarfi = isim.substring(indexOfSpace+1,indexOfSpace+2);
    //Boolean adinIlkHarfiBuyukMu = (adinIlkHarfi.charAt(0)>='A' && adinIlkHarfi.charAt(0)<='Z');
    //Boolean soyadinIlkHarfiBuyukMu = (soyadinIlkHarfi.charAt(0)>='A' && soyadinIlkHarfi. charAt(0)<='Z');
    //if(boslukIndex ==-1){
    //System.out.println("Ad veya soyadi eksik ");
    //}
    //if(!adinIlkHarfiBuyukMu || !soyadinIlkHarfiBuyukMu){
    //System.out.println("Bas harflerinde hata"); }
    //if(isim.equals(isim.toUpperCase())){ System.out.println("Format hatasi");
    //} if(isim.replaceAll("\\s","").length()==0){
    //System.out.println("Isim girilmedi "); }
    //if(isim.replaceAll("\\s","").replaceAll("[A-Za-z]","").length()>0){ System.out.println("Gecersiz Isim");
    public static void main(String[] args) {
        //  Scanner input = new Scanner(System.in);
        //   System.out.println("lutfen issim ve soyisminizi giriniz");
        // String isimSoyisim =input.next();

        Scanner input= new Scanner(System.in);
        System.out.println("lütfen isim giriniz...");
        String isim=input.next();
        System.out.println("lutfen soy isim giriniz");
        Integer boslukIndex = isim.trim().indexOf(' ');
        Scanner input2=new Scanner(System.in);
        String soyisim= input2.next();
        String adinilkharfi=isim.substring(0,1);
        String soyadinilkharfi= soyisim.substring(0,1);
        boolean adinilkharfibuyukmu=isim.charAt(0)>='A'&& isim.charAt(0)<='Z';
        boolean soyadinilkharfibuyukmu=soyisim.charAt(0)>='A'&& isim.charAt(0)<='Z';

        if(!adinilkharfibuyukmu ||!soyadinilkharfibuyukmu){
            System.out.println("Bas harflerinde hata");

        } else if (isim.equals(isim.toUpperCase())|| isim.equals(isim.toLowerCase())) {
            System.out.println("Format hatasi");


        }


    }

        }
