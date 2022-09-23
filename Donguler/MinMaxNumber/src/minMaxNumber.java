import java.util.Scanner;

public class minMaxNumber {

	public static void main(String[] args) {
		int count, number, min = 0, max = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Kaç Sayı Girmek İstediğinizi Giriniz: ");
		count = input.nextInt();

		for (int i = 1 ; i <= count; i++) {
			System.out.print("Lütfen " + i + ". Sayınızı Giriniz: ");
			number = input.nextInt();
			
			if(i == 1) {
				max = number;
				min = number;
			}
			if(number > max) {
				max = number;
			}
			else if (number < min) {
				min = number;
			}
		}
		System.out.println("Girdiğiniz Sayılardan En Küçüğü: " + min);
		System.out.println("Girdiğiniz Sayılardan En Büyüğü: " + max);
		input.close();
	}

}



