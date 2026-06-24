interface Payment {
    void pay();
}

class Googlepay implements Payment {
    @Override
    public void pay() {
        System.out.println("Paid using Google Pay");
    }
}

class Phonepe implements Payment {
    @Override
    public void pay() {
        System.out.println("Paid using PhonePe");
    }
}

public class Main {
    public static void main(String[] args) {

        Payment p1 = new Googlepay();
        Payment p2 = new Phonepe();

        p1.pay();
        p2.pay();
    }