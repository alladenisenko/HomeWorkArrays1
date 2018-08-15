import java.util.Arrays;

/**
 * Написать метод создания массива размера size, заполненного значениями от 0..(size-1). Если size < 0, бросить исключение IllegalArgumentException.
 * int[] createSequenceArray(int size)
 * <p>
 * Пример работы:
 * createSequenceArray(5) => {0, 1, 2, 3, 4}
 * createSequenceArray(-1)  IllegalArgumentException
 */
public class Task5 {
    int[] createSequenceArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }
        System.out.println("createSequenceArray(" + size + ")" + Arrays.toString(array));
        /**if (size<0){
         throw  new IllegalArgumentException();*/
        return array;
    }


}

