import java.util.Arrays;
import java.util.Scanner;

public class MatrisTranspoz {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Satır Sayısını Giriniz : ");
        int n = input.nextInt();
        System.out.print("Sütun Sayısını giriniz : ");
        int m = input.nextInt();
        int[][] matris = new int[n][m];
        System.out.print("\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("[" + (i + 1) + "][" +  (j + 1) + "]: ");
                matris[i][j] = input.nextInt();
            }
            System.out.println();
        }
        System.out.println("Matris :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(" " + matris[i][j]);
            }
            System.out.println();
        }
        System.out.println("Transpoze :");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + matris[j][i]);
            }
            System.out.println();
        }
	}
}
