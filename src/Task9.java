/**
 * Написать метод транспонирования матрицы. Исходная матрица не должна изменяться. Предполагается, что матрица прямоугольная.
 * https://ru.wikipedia.org/wiki/Транспонированная_матрица
 * int[][] transpose(int[][] sourceMatrix)
 * <p>
 * Пример работы:
 * transpose(new int[][]{    {1, 2, 3, 4},
 * {5, 6, 7, 8}        }) => {    {1, 5},
 * {2, 6},
 * {3, 7},
 * {4, 8}        }
 */
public class Task9 {
    void printMatrix(int[][] sourceMatrix) {


        for (int i = 0; i < sourceMatrix.length; i++) {
            for (int j = 0; j < sourceMatrix[i].length; j++) {
                System.out.print(sourceMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    int[][] transpose(int[][] sourceMatrix) {
        int temporary = 0;
        for (int i = 0; i < sourceMatrix.length - 1; i++) {
            for (int j = 0; j < sourceMatrix.length - 1; j++) {
                temporary = sourceMatrix[i + 1][j];
                sourceMatrix[i + 1][j] = sourceMatrix[j][i + 1];
                sourceMatrix[j][i + 1] = temporary;
            }
        }
        System.out.println("transpose matrix");
        for (int i = 0; i < sourceMatrix.length; i++) {
            for (int j = 0; j < sourceMatrix[i].length; j++) {
                System.out.print(sourceMatrix[i][j] + "\t");
            }
            System.out.println();
        }
        return sourceMatrix;
    }
}

