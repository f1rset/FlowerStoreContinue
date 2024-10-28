package flower.store;

import java.util.ArrayList;

public class FlowerBucket<T extends FlowerPack> {
    private ArrayList<FlowerPack> flowers;

    public FlowerBucket() {
        flowers = new ArrayList<FlowerPack>();
    }

    public void add(FlowerPack flowerPack) {
        flowers.add(flowerPack);
    }

    public double getPrice() {
        double price = 0;
        for (FlowerPack pack: flowers) {
            price += pack.getPrice();
        }
        return price;
    }
}
