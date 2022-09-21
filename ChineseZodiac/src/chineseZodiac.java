import java.util.Scanner;

public class chineseZodiac {

	public static void main(String[] args) {
		int birthYear, zodiac;
		String zodiacAnimal = " ";
		Scanner input = new Scanner(System.in);
		System.out.print("Doğum Yılınızı Giriniz: ");
		birthYear = input.nextInt();
		zodiac = birthYear % 12;

		if (zodiac == 0) {
			zodiacAnimal = "Maymun";
		} else if (zodiac == 1) {
			zodiacAnimal = "Horoz";
		} else if (zodiac == 2) {
			zodiacAnimal = "Köpek";
		} else if (zodiac == 3) {
			zodiacAnimal = "Domuz";
		} else if (zodiac == 4) {
			zodiacAnimal = "Fare";
		} else if (zodiac == 5) {
			zodiacAnimal = "Öküz";
		} else if (zodiac == 6) {
			zodiacAnimal = "Kaplan";
		} else if (zodiac == 7) {
			zodiacAnimal = "Tavşan";
		} else if (zodiac == 8) {
			zodiacAnimal = "Ejderha";
		} else if (zodiac == 9) {
			zodiacAnimal = "Yılan";
		} else if (zodiac == 10) {
			zodiacAnimal = "At";
		} else {
			zodiacAnimal = "Koyun";
		}
		System.out.println("Çin Zodyağı Burcunuz : " + zodiacAnimal);
	}
}
