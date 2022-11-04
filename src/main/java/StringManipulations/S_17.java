package StringManipulations;

public class S_17 {
    //Bir String’ de kullanılan noktalama işaretlerinin sayısını bulmak için bir kod yazınız.
    //String s = "Vay be! Ali 13 yaşında ama üniversite öğrencisi.";
    //int toplamKrkSayisi = s.length();
    //int noktalamaIsaretleriDisindakilerinSayisi = s.replaceAll("\\p{Punct}", "").length();
    //int noktalamaIsaretlerininSayisi= toplamKrkSayisi - noktalamaIsaretleriDisindakilerinSayisi; System.out.println(noktalamaIsaretlerininSayisi);
    //
    public static void main(String[] args) {
        String pwd = "Vay be! Ali 13 yaşında ama üniversite öğrencisi.";
        int nokSayisi=pwd.replaceAll("[^\\p{Punct}]","").length();
        System.out.println(nokSayisi);
    }
}
