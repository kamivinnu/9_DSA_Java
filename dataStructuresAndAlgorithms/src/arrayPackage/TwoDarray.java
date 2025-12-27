package arrayPackage;

import java.util.*;

public class TwoDarray {

    int[][] a;
    int row;
    int col;

    // Constructor
    TwoDarray(int row, int col) {
        this.row = row;
        this.col = col;
        a = new int[row][col];
    }

    // Initialize the matrix
    public void initialize() {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter a[" + i + "][" + j + "] : ");
                a[i][j] = in.nextInt();
            }
        }
    }

    // Display in Row-Major order
    public void printRowMajor() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Display in Column-Major order
    public void printColMajor() {
        for (int j = 0; j < col; j++) {
            for (int i = 0; i < row; i++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Matrix addition
    public TwoDarray addition(TwoDarray b) {
        if (this.row != b.row || this.col != b.col) {
            System.out.println("Error! Matrices are not of proper size for addition.");
            return null;
        }

        TwoDarray c = new TwoDarray(row, col);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                c.a[i][j] = this.a[i][j] + b.a[i][j];
            }
        }
        return c;
    }

    // Matrix multiplication
    public TwoDarray multiplication(TwoDarray b) {
        if (this.col != b.row) {
            System.out.println("Error! Matrices are not of proper size for multiplication.");
            return null;
        }

        TwoDarray c = new TwoDarray(this.row, b.col);
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < b.col; j++) {
                c.a[i][j] = 0;
                for (int k = 0; k < this.col; k++) {
                    c.a[i][j] += this.a[i][k] * b.a[k][j];
                }
            }
        }
        return c;
    }
}

