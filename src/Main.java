public class Main {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.fill(new int[5], 10);
        Task2 task2 = new Task2();
        task2.sum(new int[]{1, 2, 3});
        Task3 task3 = new Task3();
        task3.ArrayPositivesCounter(task3.findFirstPositive(new int[]{3, 0, -1, -4, -2, -5}), task3.findLastPositive(new int[]{-3, 0, 1, -4, 2, -5}));
        Task4 task4 = new Task4();
        task4.countPositives(new int[]{3, 0, -1, 4, 2, -5});
        Task5 task5 = new Task5();
        task5.createSequenceArray(8);
        Task6 task6 = new Task6();
        task6.printMatrix(new int[][]{{1, 2, 2, 2, 3, 4},
                {1, 2, 2, 8, 3, 4}});
        Task7 task7 = new Task7();
        task7.calculateAverage(new int[][]{{1, 2, 2, 3, 4},
                {1, 2, 2, 8, 4}});
        Task8 task8 = new Task8();
        task8.findMaxSumRow(new int[][]{{1, 2, 2, 3, 4}, {1, 40, 2, 3, 4},
                {1, 40, 2, 3, 4}});
        Task9 task9 = new Task9();
        task9.printMatrix(new int[][]{{1, 2, 3}, {4, 5, 6},
                {7, 8, 9}});
        task9.transpose(new int[][]{{1, 2, 3}, {4, 5, 6},
                {7, 8, 9}});
        Task10 task10 = new Task10();
        task10.isIdentity(new int[][]{{1, 0, 0}, {0, 1, 0},
                {0, 0, 1}});

    }
}
