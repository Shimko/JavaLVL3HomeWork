package Generalizations;
//Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
//        Написать метод, который преобразует массив в ArrayList;
//        Задача:
//        Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
//        Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
//        Для хранения фруктов внутри коробки можно использовать ArrayList;
//        Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
//        Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;
//        Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую. Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами. Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
//        Не забываем про метод добавления фрукта в коробку.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        swapVal();
        try {
            convertIntegerToList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.getWeight();
        System.out.println(appleBox.getWeight());


        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit( new Orange());

        orangeBox.getWeight();
        System.out.println(orangeBox.getWeight());
        Box<Fruit> generalBox = new Box<>();
        generalBox.sprinkleFruit(appleBox);



    }
    static void swapVal( ) {
        Integer [] array = new Integer[] { 32, 56, 74};
        int firstVal = array[2];
        for (int i = 0; i < array.length ; i++) {
            array[0] = array[1];
            array[1] = firstVal;
            System.out.println("Измененный массив: " + array[i]);
        }
    }
    public static void convertIntegerToList() throws Exception {
        Integer[] intArray = {100, 30, 15};
        List<Integer> list = Task.convertToList(intArray);
        System.out.println(list);
        }
    }




