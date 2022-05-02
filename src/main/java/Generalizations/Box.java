package Generalizations;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Box <T extends Fruit> {

    private  ArrayList<T> fruits;

    public Box(){
        fruits = new ArrayList<>();
    }

    public ArrayList<T> getFruits(){
        return fruits;
    }

    public void addInBox(T fruit){
        fruits.add(fruit);
    }

    public float getWeight(){
        float sumWeight = 0.0f;

        for (T fruit: fruits){
            sumWeight += fruit.getWeight();
        }
        return sumWeight;
    }

    public void addFruits(ArrayList<T> fruit){
        this.fruits.addAll(fruit);
    }

    public void  moveAllToAnotherBox(Box<T> box){
        box.addFruits(getFruits());
        fruits.clear();
    }

    public boolean compare(Box<?> box){
        return Math.abs(this.getWeight() - box.getWeight()) < 0.001;
    }

}
