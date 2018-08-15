import java.util.Arrays;

/**
 * Написать метод поиска индекса строки с максимальной суммой элементов. Если таких строк несколько, вернуть индекс первой. Предполагается, что матрица прямоугольная.
 * int findMaxSumRow(int[][] matrix)
 * <p>
 * Пример работы:
 * findMaxSumRow(new int[][]{{0, 3, -2},
 * {2, 1, 3},
 * {-1, 5, 2}}) == 1
 */
public class Task8 {
    int findMaxSumRow(int[][] matrix) {
        int cow = 0;
        int[] summarray = new int[matrix.length];
        for (int i = 0; i < matrix[cow].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                summarray[j] += matrix[j][i];
            }

        }
        int maxSum = summarray[0];
        int indexMax = 0;
        for (int i = 0; i < summarray.length; i++) {
            if (maxSum < summarray[i]) {
                maxSum = summarray[i];
                indexMax = i;
            }

        }
        System.out.println("Index max==" + indexMax);
        return indexMax;
    }
}
