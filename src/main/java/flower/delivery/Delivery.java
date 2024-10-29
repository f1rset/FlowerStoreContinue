package flower.delivery;

import flower.store.FlowerBucket;

import java.util.List;

public interface Delivery {
    void deliver(List<FlowerBucket> items);
}
