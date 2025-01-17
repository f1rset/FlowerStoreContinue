package flower.store;

import lombok.Getter;
@Getter
public class FlowerPack {
    private Flower flower;
    private int quantity;

    public FlowerPack(Flower flower, int quantity) {
        this.flower = flower;
        this.quantity = quantity;
    }

    public Flower getFlower() {
        return this.flower;
    }
    public double getPrice() {
        return flower.getPrice()*quantity;
    }
}
