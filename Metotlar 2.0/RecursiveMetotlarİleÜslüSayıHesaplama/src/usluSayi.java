import java.util.Scanner;

public class usluSayi {

	static int us(int taban, int us) {
		if (us == 0) {
			return 1;
		}
		return taban * us(taban, us-1);
		/*int sonuc = 1;
		if (us == 0) {
			return 1;
		} else if (taban == 0) {
			return 0;
		} else {
			while (us != 0) {
				sonuc *= taban;
				us--;
			}
		}
		return sonuc;*/
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen Taban Değerini Giriniz: ");
		int taban = input.nextInt();
		System.out.print("Lütfen Üs Değerini Giriniz: ");
		int us = input.nextInt();
		System.out.println("Sonuç: " + us(taban, us));
		input.close();
	}
}
