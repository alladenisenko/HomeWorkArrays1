/**
 * Написать методы поиска индекса первого и последнего положительного числа. Если положительных чисел нет, вернуть -1.
 * int findFirstPositive(int[] array)
 * int findLastPositive(int[] array)
 * <p>
 * Пример работы:
 * findFirstPositive(new int[]{-3, 0, -1, 4, -2, 5}) == 3
 * findLastPositive(new int[]{-3, 0, -1, 4, -2, 5}) == 5
 * findFirstPositive(new int[]{-3, 0, -1, -4, -2, -5}) == -1
 */
public class Task3 {
    int findFirstPositive(int[] array) {
        int firstPositive = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                firstPositive = i;
                break;
            }
        }

        return firstPositive;

    }

    int findLastPositive(int[] array) {
        int lastPositive = -1;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] > 0) {
                lastPositive = i;
                break;
            }
        }

        return lastPositive;
    }

    void ArrayPositivesCounter(int a, int b) {
        if (a < 0 && b < 0) {
            System.out.println("-1");
        } else {
            System.out.println("FirstPositive index " + a);
            System.out.println("LastPositive index " + b);
        }

    }
}
