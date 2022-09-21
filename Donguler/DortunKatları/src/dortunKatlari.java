import java.util.Scanner;

public class dortunKatlari {

	public static void main(String[] args) {
		int k, sum = 0;
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.print("Bir Sayı Giriniz (Tek Sayi Girilirse Program Sonlanir): ");
			k = input.nextInt();
			if(k % 2 == 0 && k % 4 == 0) {
				sum += k;
			}
		}while(k % 2 == 0); {
			System.out.println("Girdiğiniz Sayilardan 4'un Katlarinin Toplami: " + sum);
		}
		input.close();
	}
}
