package Generalizations;

import java.util.ArrayList;
import java.util.Arrays;

public class Task {
    static void swapObj(Object[] array, int firstIndex, int secondIndex) {
        Object firstVal = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = firstVal;
    }
    static <T> ArrayList<T> convertToList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }
}
