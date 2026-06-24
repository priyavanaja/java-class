interface payment{
    void pay(double amount);
}
class creditcard implements payment
{
    public void pay(double amount)
    {
        System.out.println("paid"+amount+"using credit card");
    }
}
class UPI implements payment
{
    public void pay(double amount)
    {
        System.out.println("paid"+amount+"using UPI card");
    }
}
public class Cash{
    public static void mani(String[] args){
        payment p;
        p=new creditcard();
        p.pay(5000);
        p=new UPI();
        p.pay(2500);
    }
}