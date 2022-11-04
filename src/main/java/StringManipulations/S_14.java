package StringManipulations;

public class S_14 {
    // Soru 14. Bir String' in belirli bir tek karaktere sahip olup
// olmadığını üç farklı şekilde kontrol etmek için kod yazınız.
    public static void main(String[] args) {
        String c ="herhangi";
        boolean s1= c.contains("h");
        System.out.println("s1 = " + s1);
        boolean s2= c.replaceAll("^h","").length()>0;
        System.out.println("s2 = " + s2);
        boolean s3 = c.replace("h","").length()!=c.length();
        System.out.println("s3 = " + s3);

        int indexC = c.indexOf("x");
        System.out.println(indexC);


    }

}
