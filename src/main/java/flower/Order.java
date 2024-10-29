package flower;

import java.util.List;

import flower.delivery.Delivery;
import flower.payments.Payment;
import flower.store.FlowerBucket;
import lombok.Getter;
import lombok.Setter;

public class Order {
    @Getter
    List<FlowerBucket> items;
    @Setter @Getter
    Payment payment;
    @Setter @Getter
    Delivery delivery;

    public void addItem(FlowerBucket item){
        items.add(item);
    }

    public void removeItem(FlowerBucket item){
        items.remove(item);
    }

    public void processOrder(){
        payment.pay();
        delivery.deliver(items);
    }

    public float calculateTotalPrice() {
        float res = 0;
        for (FlowerBucket item: items){
            res += item.getPrice();
        }
        return res;
    }
}
