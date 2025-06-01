import java.util.Scanner;

class matrix {
    int[][] data;
    int rows, cols;

    matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        data = new int[rows][cols];
    }

    void get() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of a " + rows + "x" + cols + " matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                data[i][j] = sc.nextInt();
            }
        }
    }

    void display() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    static matrix add(matrix m1, matrix m2) {
        if (m1.rows != m2.rows || m1.cols != m2.cols) {
            System.out.println("Matrix addition is not possible");
            return null;
        } else {
            matrix result = new matrix(m1.rows, m1.cols);
            for (int i = 0; i < m1.rows; i++) {
                for (int j = 0; j < m1.cols; j++) {
                    result.data[i][j] = m1.data[i][j] + m2.data[i][j];
                }
            }
            return result;
        }
    }
}

public class matrixadd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();

        System.out.println("Enter the number of columns:");
        int cols = sc.nextInt();

        matrix matrix1 = new matrix(rows, cols);
        matrix matrix2 = new matrix(rows, cols);

        System.out.println("\nMatrix 1:");
        matrix1.get();

        System.out.println("\nMatrix 2:");
        matrix2.get();

        matrix sum = matrix.add(matrix1, matrix2);
        if (sum != null) {
            System.out.println("Sum of matrices:");
            sum.display();
        }

        sc.close();
    }
}

