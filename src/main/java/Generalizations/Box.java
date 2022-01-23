package Generalizations;

import java.util.ArrayList;


public class Box <T extends Fruit> {
    private ArrayList<T> fruitBox;

    public Box(ArrayList<T>fruitBox) {
        this.fruitBox = fruitBox;
    }

    public void addFruit(T fruit){
        fruitBox.add(fruit);
    }

    public float getWeight(){
        float weight = 0.0f;
        for (T e: fruitBox){
            weight += e.getWeight();
        }return weight;
    }

    public void sprinkleFruit(Box<T> generalBox){
        generalBox.fruitBox.addAll(fruitBox);
        fruitBox.clear();
    }
    public boolean compare(Box<T> o ){
        return Math.abs(this.getWeight() - o.getWeight()) < 0.001;
    }

}
