package StringManipulations;

public class S_12 {
    // Soru 12. Bir String' in başında büyük harf ve sonunda nokta olup olmadığını kontrol etmek için kod yazınız.
    //Örnek: 'Ali' için kodunuz konsolda false yazdırmalıdır 'ali.' için kodunuz konsolda false yazdırmalıdır
    //‘ Ali. ’ için kodunuz konsolda false yazdırmalıdır 'Ali.' için kodunuz konsolda true yazdırmalıdır
    //'ALI.' için kodunuz konsolda true yazdırmalıdır
    public static void main(String[] args) {
        String x = "ali.";
        boolean ilk = x.charAt(0)>='A'&& x.charAt(0)<='Z';
        boolean son = x.charAt(args.length)-1 == '.';
        boolean sonuc2= ilk && son ;
        System.out.println(sonuc2);



}}
