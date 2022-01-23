package Generalizations;

import java.util.ArrayList;
import java.util.Arrays;

public class Task {

    static <T> ArrayList<T> convertToList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }
}
