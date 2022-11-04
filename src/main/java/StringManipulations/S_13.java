package StringManipulations;

public class S_13 {
    //Aşağıdaki koşullar için bir parolanın geçerli olup olmadığını kontrol etmek için kod yazınız;
    // Şifre boşluk karakterinden farklı olacak şekilde en az 8 karakter içermelidir. Şifrede en az 1 sembol olmalıdır.
    //Örnek:
    //'A2b!' için kodunuz konsolda false yazdırmalıdır. 'A2b3cdef' için kodunuz konsolda false yazdırmalıdır '!1a23b4' için kodunuz konsolda false yazdırmalıdır. '!1a23b4?es' için kodunuz konsolda true yazdırılmalıdır.
    // '! a b 3 k' kodunuz konsolda false yazdırmalıdır.
    public static void main(String[] args) {
        String pwd ="  abcd 1234?";
        boolean uzunluk = pwd.replace(" ","").length()>=8;
        boolean sembol = pwd.replaceAll("[0-9a-zA-Z]","").length()>0;
        boolean sonuc = uzunluk && sembol;
        System.out.println(sonuc);


    }

}
