package Assignment6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1 {

	public static void main(String[] args) throws IOException {

		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter row: ");
		int row = Integer.parseInt(sc.readLine());
		System.out.print("Enter column: ");
		int col = Integer.parseInt(sc.readLine());

		int[][] arr = new int[row][col];

		for (int i = 0; i < row; i++) {
			System.out.print("Enter the sales of 3 items sold by saleman " + (i + 1) + " : ");
			String[] num = sc.readLine().split(" ");

			for (int j = 0; j < col; j++) {
				arr[i][j] = Integer.parseInt(num[j]);
			}
		}

		int totRow = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				totRow += arr[i][j];
			}
			System.out.println("Total sales by saleman " + (i + 1) + " : " + totRow);
			totRow = 0;
		}

		int totCol = 0;
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				totCol += arr[j][i];
			}
			System.out.println("Total sales of item " + (i + 1) + " : " + totCol);
			totCol = 0;
		}
	}

}
