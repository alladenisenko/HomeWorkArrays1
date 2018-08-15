/**
 * Написать метод заполнения массива array указанным значением filler.
 * void fill(int[] array, int filler)
 */

import java.util.Arrays;

public class Task1 {
    void fill(int[] array, int filler) {
        for (int i = 0; i < array.length; i++) {
            array[i] = filler;
        }
        System.out.println("ArraysFiller " + Arrays.toString(array));
    }
}
