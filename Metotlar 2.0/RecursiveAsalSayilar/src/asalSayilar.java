import java.util.Scanner;
public class asalSayilar {

	static String isPrime(int number, int i) {
		if (number <= 1) {
			String str = " Sayısı Bir Asal Sayı Değildir.";
			return (number + str);
		}
		if (i * i > number) {
			String str = " Sayısı Bir Asal Sayıdır";
			return (number + str);
		}
		if (number % i == 0) {
			String str = " Sayısı Bir Asal Sayı Değildir.";
			return (number + str);
		}
		return isPrime(number, i + 1);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen Sorgulanacak Sayıyı Giriniz: ");
		int number = input.nextInt();
		System.out.println(isPrime(number, 2));
		input.close();
	}
}





