import java.util.Scanner;

public class harmonikSayilar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Bir Sayi Giriniz: ");
		int n = input.nextInt();
		double result = 0.0;
		for (double i = 1; i <= n; i++) {
			result += (1 / i);
		}
		System.out.println("Sonuc: " + result);
		input.close();

	}

}
