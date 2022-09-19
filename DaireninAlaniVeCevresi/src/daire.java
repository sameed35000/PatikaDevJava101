import java.util.Scanner;
public class daire {

	public static void main(String[] args) {
		
		double pi=3.14,r,aci,alan,cevre,dilimAlani;
		
		//Alan ve Çevre Hesaplaması
		
		System.out.println("Yarıçap değerini giriniz: ");
		Scanner girdi = new Scanner(System.in);
		r = girdi.nextDouble();
		alan = pi * r * r;
		cevre = 2* pi * r;
		System.out.println("Dairenin Alani: " + alan);
		System.out.println("Dairenin Cevresi: " + cevre);

		//Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulma
		
		Scanner input = new Scanner(System.in);
		System.out.println("Yarıçap Değerini Giriniz: ");
		r = input.nextDouble();
		System.out.println("Merkez Açısının Değerini Giriniz: ");
		aci = input.nextDouble();
		dilimAlani = (pi*(r*r)*aci)/360;
		System.out.println("Merkez Açısının Ölçüsü" + aci + " olan daire diliminin alanı: " + dilimAlani);
		
		
		
	}

}
