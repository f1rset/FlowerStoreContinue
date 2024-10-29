package flower.payments;

public class CreditCardPayment implements Payment {
    @Override
    public boolean pay() {
        return true;
    }
}
