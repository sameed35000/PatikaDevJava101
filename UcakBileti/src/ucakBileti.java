import java.util.Scanner;

public class ucakBileti {

	public static void main(String[] args) {
		double distance, price, discount;
		int travelType, age;
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen Mesafeyi KM Cinsinden Giriniz: ");
		distance = input.nextDouble();
		System.out.print("Lütfen Yaşınızı Giriniz: ");
		age = input.nextInt();
		System.out.print("Lütfen Yolculuk Tipini Giriniz (1 => Tek Gidiş , 2 => Gidiş-Dönüş): ");
		travelType = input.nextInt();
		price = distance * 0.10;

		if (distance > 0 && age > 0) {
			if (age < 12) {
				discount = price * 0.50;
				price = price - discount;
			} else if (age >= 12 && age < 24) {
				discount = price * 0.10;
				price = price - discount;
			} else if (age >= 65) {
				discount = price * 0.30;
				price = price - discount;
			} else if (age >= 24 && age < 65) {
				discount = price + 0;
			}
		} else {
			System.out.println("Hatalı Veri Girdiniz!");
		}
		//2. Mesafe Sorgusu Birden Fazla Uyarı Mesajı Vermemek İçin
		if (distance > 0) {
			if (travelType == 1) {
				price = price + 0;
				System.out.println("Toplam Tutar: " + price);
			} else if (travelType == 2) {
				price *= 2;
				discount = price * 0.20;
				price = price - discount;
				System.out.println("Toplam Tutar: " + price);
			} else {
				System.out.println("Hatalı Seyahat Tipi Seçimi!");
			}
		}
	}
}