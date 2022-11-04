package StringManipulations;

public class S_16 {
    //Verilen bir ismin adının ve soyadının baş harflerini almak için kodu yazınız. Not: İkinci isim kapsam dışındadır.
    //Örnek: Tom Hanks ==> TH, Mary Star ==> MS
    public static void main(String[] args) {
        String isim ="Ali Can";
        String isimIlkHarf = isim.substring(0,1);
        String soyIsimIlkHarf = isim.split(" ")[1].substring(0,1);
        System.out.println(isimIlkHarf+soyIsimIlkHarf);

    }
}
