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
    // Метод от Задачи 1.
    private static <V> void swapObj(V[] array, int a1){
        V b = array[a1];
        array[a1] = array[3];
        array[3] =b;
    }
    // Метод от Задачи 2. Написать метод, который преобразует массив в ArrayList
    private static <Z> List transformationInArrayList(Z[] array) {
        return Arrays.asList(array);
    }

    public static void main(String[] args) {

        Object[] arr = {"O", 87L, 34.5f, "Z"};
        System.out.println("Задание №1\n" + "Первоночальный массив:" + Arrays.toString(arr));
        swapObj(arr, 2);
        System.out.println("Измененный массив:    "+ Arrays.toString(arr));

        //Задача 2. Написать метод, который преобразует массив в ArrayList
        List<String> list = transformationInArrayList(arr);
        System.out.println("Задание №2\n" + list.getClass() + " : " + list);

        //3. Большая задача:
//    a. Есть классы Fruit -> Apple, Orange;(больше фруктов не надо)
//    b. Класс Box в который можно складывать фрукты, коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
//    c. Для хранения фруктов внутри коробки можете использовать ArrayList;
//    d. Сделать метод getWeight() который высчитывает вес коробки, зная количество фруктов и вес одного фрукта(вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
//    e. Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку с той, которую подадут в compare в качестве параметра, true - если их веса равны, false в противном случае(коробки с яблоками мы можем сравнивать с коробками с апельсинами);
//    f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку(помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами), соответственно в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в этой коробке;
//    g. Не забываем про метод добавления фрукта в коробку.

        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        for (int i = 0; i < 4; i++) {
            orangeBox.addInBox(new Orange());
        }

        for (int i = 0; i < 5; i++) {
            appleBox.addInBox(new Apple());
        }

        System.out.println("Задание №3\n");
        System.out.println("Коробка с яблоками: " + appleBox.getFruits());
        System.out.println("Коробка с апельсинами: " + orangeBox.getFruits());
        System.out.println("Вес коробки с яблоками: " + "= " +appleBox.getWeight() );
        System.out.println("Вес коробки с апельсинами: " + "= " +orangeBox.getWeight() );
        System.out.println("Сравним вес коробок: " + appleBox.compare(orangeBox));
        Box<Apple> appleBox2 = new Box<>();
        appleBox.moveAllToAnotherBox(appleBox2);
        System.out.println("В первой коробке с яблоками осталось: " + appleBox.getFruits());
        System.out.println("Во второй коробке с яблоками стало: " + appleBox2.getFruits());
        Box<Orange> orangeBox2 = new Box<>();
        orangeBox.moveAllToAnotherBox(orangeBox2);
        System.out.println("В первой коробке с яблоками осталось: " + orangeBox.getFruits());
        System.out.println("Во второй коробке с яблоками стало: " + orangeBox2.getFruits());


    }

}




