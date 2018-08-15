/**
 * Написать метод вычисления суммы всех элементов массива.
 * int sum(int[] array)
 * <p>
 * Пример работы:
 * sum(new int[]{2, 1, 3}) == 6
 */
public class Task2 {
    int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Elements sum == " + sum);
        return sum;
    }

}
