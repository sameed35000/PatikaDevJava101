import java.util.Scanner;
public class oruntu {

	public static void oruntu(int number, int tempNumber, int x) {
		if (number > 0 && x == 0) {
			System.out.print(number + " ");
			number -= 5;
			oruntu(number, tempNumber, 0);
		}
		else if (number == 0 || number < 0) {
			System.out.print(number + " ");
			number += 5;
			oruntu(number, tempNumber, 1);
		}
		else if (number > 0 && number <= tempNumber && x == 1) {
			System.out.print(number + " ");
			number += 5;
			oruntu(number, tempNumber, 1);
		}
	}
	public static void main(String[] args) {
		int num;
		Scanner input = new Scanner(System.in);
		System.out.print("Bir Sayı Giriniz: ");
		num = input.nextInt();
		oruntu(num, num, 0);
		input.close();
	}
}