interface PaymentProcessor {
    void pay(double amount);

    default void refund(double amount) {
        System.out.println("Refund of $" + amount + " is processed by default method.");
    }
}

class PayPal implements PaymentProcessor {
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using PayPal.");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refund of $" + amount + " processed by PayPal.");
    }
}

class CreditCardProcessor implements PaymentProcessor {
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card.");
    }
}

class Wallet implements PaymentProcessor {
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Wallet.");
    }
}

public class PaymentGatewayIntegration {
    public static void main(String[] args) {
        PaymentProcessor paypal = new PayPal();
        PaymentProcessor card = new CreditCardProcessor();
        PaymentProcessor wallet = new Wallet();

        paypal.pay(100);
        card.pay(200);
        wallet.pay(50);

        System.out.println();

        paypal.refund(50);
        card.refund(100); 
        wallet.refund(25); 
    }
}

