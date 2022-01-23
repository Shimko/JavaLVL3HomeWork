package Generalizations;

public class Orange extends Fruit{
    private float weight;

    public Orange() {
        super(1.5f);

    }

    @Override
    public double getWeight() {
        return weight;
    }
}
