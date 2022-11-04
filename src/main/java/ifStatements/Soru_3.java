package ifStatements;

import java.util.Scanner;

public class Soru_3 {
    public static void main(String[] args) {
        //Ayın numarasını girdiğinizde ayın adını yazdırmak için gereken kodu yazınız. Örnek; 1 için çıktı: "Ocak", 2 için çıktı: "Şubat" vb.
        //int ayNo = 3; if(ayNo ==1){
        //System.out.println("Ocak"); }else if(ayNo ==2){
        //System.out.println("Subat"); }else if(ayNo ==3){
        //System.out.println("Mart"); }else if(ayNo ==4){
        //System.out.println("Nisan"); }else if(ayNo ==5){
        //System.out.println("Mayis"); }else if(ayNo ==6){
        //System.out.println("Haziran"); }else if(ayNo ==7){
        //System.out.println("Temmuz"); }else if(ayNo ==8){
        //System.out.println("Agustos"); }else if(ayNo ==9){
        //System.out.println("Eylul"); }else if(ayNo ==10){
        //System.out.println("Ekim"); }else if(ayNo ==11){
        //System.out.println("Kasim"); }else if(ayNo ==12){
        //System.out.println("Aralik"); }else{
        //System.out.println("Gecersiz ay numarasi"); }
        //
        Scanner input = new Scanner(System.in);
        System.out.println("Ay numarasini giriniz...");
        byte ayNo = input.nextByte();
        if (ayNo == 1) {
            System.out.println("Ocak");
        } else if (ayNo == 2) {
            System.out.println("subat");

        } else if (ayNo == 3) {
            System.out.println("mart");

        } else if (ayNo == 4) {
            System.out.println("nisan");

        } else if (ayNo == 5) {
            System.out.println("mayis");

        } else if (ayNo == 6) {
            System.out.println("haziran");

        } else if (ayNo == 7) {
            System.out.println("temmuz");

        } else if (ayNo == 8) {
            System.out.println("agustos");

        } else if (ayNo == 9) {
            System.out.println("eylül");

        } else if (ayNo == 10) {
            System.out.println("ekim");

        } else if (ayNo == 11) {
            System.out.println("kasim");

        } else if (ayNo == 12) {
            System.out.println("aralik");

        } else {
            System.out.println("Gecerli bir numara girinniz");
        }

        Scanner input1=new Scanner(System.in);
        System.out.println("bir ay adi giriniz");
        String ayIsmi= input.next();

        boolean kis=ayIsmi.equalsIgnoreCase("Aralik")||ayIsmi.equalsIgnoreCase("ocak")||
                ayIsmi.equalsIgnoreCase("subat");
        boolean ilkbahar=ayIsmi.equalsIgnoreCase("mart")||ayIsmi.equalsIgnoreCase("nisan")||
                ayIsmi.equalsIgnoreCase("mayis");
        boolean yaz=ayIsmi.equalsIgnoreCase("haziran")||ayIsmi.equalsIgnoreCase("temmuz")||
                ayIsmi.equalsIgnoreCase("agustos");
        boolean sonbahar=ayIsmi.equalsIgnoreCase("eylul")||ayIsmi.equalsIgnoreCase("ekim")||
                ayIsmi.equalsIgnoreCase("kasim");

        if(kis){
            System.out.println("kis");
        } else if (ilkbahar) {
            System.out.println("ilkbahar");
        } else if (yaz) {
            System.out.println("yaz");
        } else if (sonbahar) {
            System.out.println("sonbahar");
        }else{
            System.out.println("gecersiz ad");
        }
    }}

