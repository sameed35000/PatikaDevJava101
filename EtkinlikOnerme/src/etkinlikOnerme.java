import java.util.Scanner;
public class etkinlikOnerme {

	public static void main(String[] args) {
		double temperature;
		Scanner input = new Scanner(System.in);
		System.out.println("Hava Sıcaklığını Giriniz: ");
		temperature = input.nextDouble();
		
		if(temperature < 5) {
			System.out.println("Bugün Kayak Yapmaya Gidebilirsin.");
		}
		if (temperature >= 5 && temperature <= 15) {
			System.out.println("Bugün Sinemaya Gidebilirsin.");
		}
		if ( temperature >= 10 && temperature <= 25) {
			System.out.println("Bugün Pikniğe Gidebilirsin.");
		}
		if (temperature >= 25) {
			System.out.println("Bugün Yüzmeye Gidebilirsin.");
		}

	}

}
