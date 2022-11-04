package wrapperClass;

public class Soru_2 {
    public static void main(String[] args) {
        //Soru 2: Data tipi String olan "103" değerini byte data tipine dönüştürmek için bir kod yazınız ve
//        yine data tipi String olan "2351" değerini short data tipine dönüştürüp konsolda iki
//        değişken arasındaki farkı yazdırınız.


        String deger1="103";
        byte yeniDeger1=Byte.valueOf(deger1);

        String deger2="2351";
        short yeniDeger2=Short.valueOf(deger2);

        System.out.println(yeniDeger1-yeniDeger2);
    }
}
