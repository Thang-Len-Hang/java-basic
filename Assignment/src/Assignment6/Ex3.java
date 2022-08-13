package Assignment6;

import java.io.*;

public class Ex3 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter row: ");
		int row = Integer.parseInt(sc.readLine());
		System.out.print("Enter column: ");
		int col = Integer.parseInt(sc.readLine());

		int[][] arr = new int[row][col];

		System.out.print("Enter the element of matrix : ");
		String[] num = sc.readLine().split(" ");

		int count = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = Integer.parseInt(num[count++]);
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("The elements of the transposed matrix are : ");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
	}

}
