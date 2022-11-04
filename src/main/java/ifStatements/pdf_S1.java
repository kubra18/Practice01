package ifStatements;

import java.util.Scanner;

public class pdf_S1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir gün ismi giriniz");
        String gun=input.next();
        if(gun.equalsIgnoreCase("pazar")||gun.equalsIgnoreCase("pazartesi")||
        gun.equalsIgnoreCase("sali")||gun.equalsIgnoreCase("carsamba")||
                gun.equalsIgnoreCase("persembe")||gun.equalsIgnoreCase("cuma")||
                gun.equalsIgnoreCase("cumartesi")) {


            String ilk = gun.substring(0, 1).toUpperCase();
            String iknciUcuncu = gun.substring(1, 3).toUpperCase();
            System.out.println("girdiginiz gunun ilk uc harfi:" + ilk + iknciUcuncu);
        }else{
            System.out.println("gecerli gun adi giriniz");




        }


    }
}
