/**
 * Написать метод подсчета количества положительных чисел в массиве.
 * int countPositives(int[] array)
 * <p>
 * Пример работы:
 * countPositives(new int[]{-3, 0, -1, 4, -2, 5}) == 2
 * countPositives(new int[]{-3, 0, -1, -4, -2, -5}) == 0
 */
public class Task4 {
    int countPositives(int[] array) {
        int countPositives = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                countPositives++;
            }
        }
        System.out.println("In your array " + countPositives + " positive elements");
        return countPositives;
    }
}
