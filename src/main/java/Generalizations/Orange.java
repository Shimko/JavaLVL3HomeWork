package Generalizations;

public class Orange extends Fruit{
    private float weight;

    public Orange(float weight) {
        super(weight);
        this.weight = 1.5f;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
