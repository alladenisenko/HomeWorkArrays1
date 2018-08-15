/**
 * Написать метод подсчета среднего арифметического всех элементов матрицы. Предполагается, что матрица прямоугольная.
 * double calculateAverage(int[][] matrix)
 * <p>
 * Пример работы:
 * findMaxSumRow(new int[][]{{0, 3, -2},
 * {2, 1, 3},
 * {-1, 5, 2}}) == 1.4444…
 */
public class Task7 {
    double calculateAverage(int[][] matrix) {
        double summ = 0;
        int stolbec = 0;
        System.out.println("findMaxSumRow");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
                summ += matrix[i][j];
                stolbec = j + 1;

            }
            System.out.println();
        }
        double calculateAverage = summ / ((matrix.length) * stolbec);
        System.out.println("\n" + "Average==" + calculateAverage);
        return calculateAverage;
    }
}
