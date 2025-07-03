/**
* Auther: Sanjeev Chaudhary
* Date: 3 Jul 2025
*/

package com.stringprograms;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		int[][] matrixA = new int[3][3];
		int[][] matrixB = new int[3][3];
		int[][] resultMatrix = new int[3][3];
		Scanner scanner = new Scanner(System.in);

		// Input for Matrix A
		System.out.println("Enter elements for Matrix A (3x3):");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("A[" + i + "][" + j + "]: ");
				matrixA[i][j] = scanner.nextInt();
			}
		}

		// Input for Matrix B
		System.out.println("\nEnter elements for Matrix B (3x3):");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("B[" + i + "][" + j + "]: ");
				matrixB[i][j] = scanner.nextInt();
			}
		}

		// Add matrices A and B → store in resultMatrix
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
			}
		}

		// Display the result
		System.out.println("\nMatrix A:");
		printMatrix(matrixA);

		System.out.println("Matrix B:");
		printMatrix(matrixB);

		System.out.println("Result Matrix (A + B):");
		printMatrix(resultMatrix);

		scanner.close();
	}

	// Helper method to print any 3x3 matrix
	private static void printMatrix(int[][] matrix) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
