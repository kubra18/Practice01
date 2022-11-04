package ifStatements;
import java.util.Scanner;
public class Soru_5 {
    //Soru 5: Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
//        a) Bir üçgenin iki kenarının uzunluğu eşitse "İkizkenar Üçgen".
//        b) Bir üçgenin tüm kenarlarının uzunluğu eşitse "Eşkenar Üçgen".
//        c) a ve b koşulları sağlanmıyorsa "Çeşit Kenar Üçgen"
    //  System.out.println("ücgenin kenar uzunluklarini giriniz");
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz");
        int k1 = input.nextInt();
        int k2 = input.nextInt();
        int k3 = input.nextInt();

        if (k1 == k2 && k1 == k3) {
            System.out.println("Eskenar Ucgen");
        } else if (k1 == k2 && k2 != k3 || k2 == k3 && k3 != k1 || k3 == k1 && k2 != k1) {
            System.out.println("ikizkenar ucgen");
        } else {
            System.out.println("cesitkenar");
        }
    }
}