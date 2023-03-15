public class Main {
    public static void main(String[] args) {
        int[][] mtx1 = {
                {1, 9, 4, 5},
                {2, 3, 5, 7},
                {10,8, 3, 8},
                {4, 9, 5, 4}
        };

        int[][] mtx2 = {
                {-2, -3, -6, -1},
                {-9, -5, -4, -8},
                {-4, -3,  5, -7},
                {-3,  1,  2,  9}
        };

        /*
        Поменять местами строки, содержащие
        минимальный и максимальный элементы матрицы.
         */
        int index_min = -1, index_max = -1;
        int min = Integer.MAX_VALUE, max = 0;

        System.out.println("Первая матрица:");
        for (int i = 0; i < mtx1.length; i++) {
            for (int j = 0; j < mtx1.length; j++) {
                if (mtx1[i][j] < min) { index_min = i; min = mtx1[i][j]; }
                if (mtx1[i][j] > max) { index_max = i; max = mtx1[i][j]; }
                System.out.print(mtx1[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Индекс строки с минимальным элементом: " + index_min);
        System.out.println("Индекс строки с максимальным элементом: " + index_max);
        System.out.println("Измененная матрица: ");

        for (int i = 0; i < mtx1.length; i++) {
            int temp = mtx1[index_min][i];
            mtx1[index_min][i] = mtx1[index_max][i];
            mtx1[index_max][i] = temp;
        }

        for (int i = 0; i < mtx1.length; i++) {
            for (int j = 0; j < mtx1.length; j++) {
                System.out.print(mtx1[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        /*
        Найти номер первой из строк, содержащих хотя бы один положительный элемент.
         */
        System.out.println("Вторая матрица:");
        for (int i = 0; i < mtx2.length; i++) {
            for (int j = 0; j < mtx2.length; j++) {
                System.out.print(mtx2[i][j] + "\t");
            }
            System.out.println();
        }

        boolean find = false;
        for (int i = 0; i < mtx2.length; i++) {
            for (int j = 0; j < mtx2.length; j++) {
                if (mtx2[i][j] >= 0) {
                    System.out.println("Первое положительное число в строке с индексом " + i);
                    find = true;
                    break;
                }
            }
            if (find) break;
        }
    }
}