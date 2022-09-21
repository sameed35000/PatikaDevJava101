import java.util.Scanner;

public class kombinasyon {

	public static void main(String[] args) {
		// Kombinasyon Formülü: C(n,r) = n! / (r! * (n-r)!)
		int n1, n2;
		Scanner input = new Scanner(System.in);
		System.out.print("C(n,r) bicimindeki n degerini giriniz: ");
		n1 = input.nextInt();
		System.out.print("C(n,r) bicimindeki r degerini giriniz: ");
		n2 = input.nextInt();
		int fark = n1 - n2; 
		int n1Fak = 1, n2Fak = 1, farkFak = 1;
		
		if (n2 <= n1) {
			for (int i = 1; i <= n1; i++) {
				n1Fak = n1Fak * i;
			}
			System.out.println("n'in Faktoriyeli: " + n1Fak);
			for (int j = 1; j <= n2; j++) {
				n2Fak *= j;
			}
			System.out.println("r'nin Faktoriyeli: " + n2Fak);
			for (int k = 1; k <= fark; k++) {
				farkFak *= k;
			}
			System.out.println("Farklarinin Faktoriyeli: " + farkFak);
			int sonuc = n1Fak / (n2Fak * farkFak);
			System.out.println("Kombinasyon Sonucu: " + sonuc);

		}else {
			System.out.println("r Sayisi n'den Buyuk Olamaz!");
		}
		
		input.close();
	}

}
