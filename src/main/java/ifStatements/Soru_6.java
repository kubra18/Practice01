package ifStatements;

import java.util.Scanner;

public class Soru_6 {
    public static void main(String[] args) {


        //Mili km'ye, saniyeyi saate, fahrenhaytı santigrata çeviren bir dönüştürücü oluşturmak için kod yazınız. Google'dan dönüşümler için formülleri bulunuz.



        //double mil = 10;

        //double fahrenayt= 83;
        //String operator = " fahrenaytdanSantigarata ";
        //if(operator.equals("mildenKmye ")){ System.out.println(mil*1.60934);
        //}else if(operator.equals("saniyedenSaate ")){ System.out.println((saniye /60)/60);
        //}else if(operator.equals("fahrenaytdanSantigarata ")){ System.out.println((fahrenayt -32)*5/9);
        //   1mil=1,609344 km}


        //a) Kullanıcı mile değerini 10 ve operatorü mildenKmye olarak girdiğinde, konsolda kodu- nuz "16 km" yazmalıdır (sayı dinamik olacak)
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen cevirmek istediginiz parametreyi giriniz");
        String operator =input.next();


        if(operator.equalsIgnoreCase("mil")){
            mildenKmyeCevir();
        } else if (operator.equalsIgnoreCase("saniye")) {
            saniyeCevir();
        }else if(operator.equalsIgnoreCase("fahrenheit")){
            fahrenheitcevir();
        }else{
            System.out.println("ben onu ceviremem!");
        }
    }

    private static void fahrenheitcevir() {
        Scanner can = new Scanner(System.in);
        double fahrenheit = 28.3333;
        System.out.println("lutfen santigrat'a cevirmek istedigiz fahrenheit miktarini giriniz");
        double miktar = can.nextDouble();
        System.out.println((miktar-32)*5/9 + " santigrat'dir");
    }

    private static void saniyeCevir() {
        Scanner can = new Scanner(System.in);
        int dakika =60;
        int saat = 3600;

        System.out.println("lutfen saate cevirmek istedigiz saniye niktarini giriniz");
        int miktar =can.nextInt();
        System.out.println(miktar+" saniye"+miktar/saat+" saat'dir."+"\n"
                +miktar+" saniye"+miktar/dakika+" dakika'dir.");
    }

    private static void mildenKmyeCevir() {
        Scanner can = new Scanner(System.in);
        double mil = 1.60934;

        System.out.println("lutfen km'ye cevirmek istedigiz mil niktarini giriniz");
        double miktar = can.nextDouble();
        System.out.println(miktar * mil + " km'dir");
    }
}