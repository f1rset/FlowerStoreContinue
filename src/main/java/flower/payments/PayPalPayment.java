package flower.payments;

import lombok.Getter;

@Getter
public class PayPalPayment implements Payment{
    final String name;
    final String description;
    public PayPalPayment(){
        name = "PayPal payment";
        description = "info";
    }

    @Override
    public boolean pay(){
        return true;
    }
    
}
