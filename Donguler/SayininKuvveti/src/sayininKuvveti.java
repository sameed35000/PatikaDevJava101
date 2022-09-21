import java.util.Scanner;

public class sayininKuvveti {

	public static void main(String[] args) {
		int k;
		Scanner input = new Scanner(System.in);
		System.out.print("Sınır Sayisini Giriniz: ");
		k = input.nextInt();
		//
		System.out.println("4'un Katlari: \t5'in Katlari:");

		for (int i = 1, j = 1; i <= k || j <= k; i *= 4, j *= 5) {
			if (i <= k) {
				System.out.print(i);
			}
			if (j <= k) {
				System.out.println("\t\t" + j);
			}
		}
		input.close();
	}

}
