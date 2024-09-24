public class The_2D_arrays {
    public static void main(String[] args) {
                int[][] matrix = {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };

                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.println();
                }


                System.out.println("--------------------");
                for (int[] row : matrix) {
                    for (int value : row) {
                        System.out.print(value + " ");
                    }
                    System.out.println();
                }


                System.out.println("--------------------");
                int i = 0, j;
                while (i < matrix.length) {
                    j = 0;
                    while (j < matrix[i].length) {
                        System.out.print(matrix[i][j] + " ");
                        j++;
                    }
                    System.out.println();
                    i++;
                }

                System.out.println("--------------------");
                i = 0;
                do {
                    j = 0;
                    do {
                        System.out.print(matrix[i][j] + " ");
                        j++;
                    } while (j < matrix[i].length);
                    System.out.println();
                    i++;
                } while (i < matrix.length);
            }
        }

