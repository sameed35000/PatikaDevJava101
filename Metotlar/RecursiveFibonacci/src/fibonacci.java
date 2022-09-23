import java.util.Scanner;

public class fibonacci {

	static int fib(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}
		return fib(number - 1) + fib(number - 2);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Bir Sayı Giriniz: ");
		int number = input.nextInt();
		fib(number);
		System.out.println(fib(number));

	}

}
