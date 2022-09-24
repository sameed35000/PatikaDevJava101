import java.util.Scanner;
public class palindrom {
	
	static boolean isPalindrom(int num) {
		int temp = num, reverseNum = 0, lastNum;
		while (temp != 0) {
			lastNum = temp % 10;
			reverseNum = (reverseNum * 10) + lastNum;
			temp /= 10;
		}
		if (num == reverseNum) {
			System.out.println("Girdiğiniz " + num + " Sayısı Bir Palindrom Sayıdır.");
			return true;
		} else {
			System.out.println("Girdiğiniz " + num + " Sayısı Bir Palindrom Sayı Değildir.");
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Bir Sayı Giriniz: ");
		int num = input.nextInt();
		isPalindrom(num);
		input.close();
	}
}