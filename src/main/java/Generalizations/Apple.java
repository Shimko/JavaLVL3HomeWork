package Generalizations;

public class Apple extends Fruit{

    private float weight;

    public Apple(float weight) {
        super(weight);
        this.weight = 1.0f;
    }

    public double getWeight() {
        return weight;
    }
}
