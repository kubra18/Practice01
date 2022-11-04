package StringManipulations;

public class S_11 {
    //Bir String’ in başında ve sonunda boşluk karakteri olup olmadığını kontrol etmek için kod yazınız.
    //Örnek:
    //‘ Ali ’ için kodunuz konsolda false yazmalıdır ‘Ali’ için kodunuz konsolda true yazmalıdır.
    public static void main(String[] args) {
       /* String a ="    ali    can   ";
        String trimlia= a.trim();
        System.out.println(trimlia);
        */
        String a = "    ali can   ";
        String trimlia = a.trim();
        String sonuc1 = trimlia.equals(a) ? "true" : "false";
        System.out.println(sonuc1);


    }
}
