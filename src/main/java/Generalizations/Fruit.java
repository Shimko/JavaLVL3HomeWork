package Generalizations;

public class Fruit {
    public  float weight;
    public String name;

    public Fruit(float weight,String name) {
        this.weight = weight;
        this.name= name;
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
