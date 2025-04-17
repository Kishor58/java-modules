package Classes_In_Java;

public class AbstractClass {
    public static void main(String[] args) {
        Payment payment = new CreditCardPayment();
        payment.makePayment(200.0);
        payment.showTransactionDetails(200.0);
    }
}

abstract class Payment {
    abstract void makePayment(double amount);

    void showTransactionDetails(double amount) {
        System.out.println("Transaction of $" + amount + " was successful.");
    }
}

class CreditCardPayment extends Payment {
    void makePayment(double amount) {
        System.out.println("Payment of $" + amount + " made using Credit Card.");
    }
}
