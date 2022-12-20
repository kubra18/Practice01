package encapsulation;

public class CreditRuuner {
    public static void main(String[] args) {
        CreditCard cc1 = new CreditCard();

        System.out.println(cc1.getAge());
        System.out.println(cc1.getCcn());
        System.out.println(cc1.isExpired());

        cc1.setCcn("1234567898987");
    }
}
