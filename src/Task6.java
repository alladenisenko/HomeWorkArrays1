/**
 * Написать метод вывода матрицы в консоль. Предполагается, что матрица прямоугольная.
 * void printMatrix(int[][] matrix)
 */
public class Task6 {
    void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

