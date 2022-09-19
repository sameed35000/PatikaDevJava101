import java.util.Scanner;
public class KdvHesaplama {
	public static void main(String[] args) {
		double fiyat, kdvliFiyat, kdvTutarı;
		Scanner input = new Scanner(System.in);
		System.out.println("Ürünün Fiyatını Giriniz: ");
		fiyat = input.nextDouble();
		kdvliFiyat = fiyat >= 1000  ? fiyat + ((fiyat*8)/100) :  fiyat + ((fiyat * 18)/100);
		kdvTutarı = kdvliFiyat - fiyat;
		System.out.println("Ürünün Fiyatı: " + fiyat);
		System.out.println("Ürünün KDV'li Fiyatı: " + kdvliFiyat);
		System.out.println("KDV Tutarı: " + kdvTutarı);
	}

}
