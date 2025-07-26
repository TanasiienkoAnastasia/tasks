package com.company;

class TransponeNonSquareMatrix {
    public static void main(String[] args) {
        int original[][] = {{1, 2}, {3, 4}, {5, 6}};
        int transpose[][] = new int[original[0].length][original.length]; // note the dimensions

        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original[0].length; j++) {
                transpose[j][i] = original[i][j];
            }
        }

        System.out.println("Non-Square Transposed Matrix:");
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
