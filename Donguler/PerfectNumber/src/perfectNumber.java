import java.util.Scanner;

public class perfectNumber {

	public static void main(String[] args) {
		int number, total = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Sayınızı Giriniz: ");
		number = input.nextInt();

		for (int i = number - 1; i > 0; i--) {
			if (number % i == 0) {
				total += i;
			}
		}
		if (total == number) {
			System.out.println("Girdiğiniz " + number + " Sayısı Mükemmel Sayıdır.");
		}
		else {
			System.out.println("Girdiğiniz " + number + " Sayısı Mükemmel Sayı Değildir.");
		}
		input.close();
	}

}

