package StringManipulations;

public class S_15 {
    // 15. Soru  String gomlekFiyat = '$12.99';
    //String kitapFiyat = '$35.99';
    //Gömlek ve kitap fiyatlarının toplamını bulmak için gereken kodu yazınız.
    public static void main(String[] args) {


        String gomlek = "$12.99";
        String kitap = "$35.99";
        String dolarsizG = gomlek.replace("$", "");
        String dolarsizK = kitap.replace("$", "");
        double g = Double.valueOf(dolarsizG);
        double k = Double.valueOf(dolarsizK);

        System.out.println(g+k);
    }


}
