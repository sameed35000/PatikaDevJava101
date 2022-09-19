import java.util.Scanner;

public class vucutKitleIndeksi {

	public static void main(String[] args) {
		double kg ,m, kitleIndeksi;
		Scanner input = new Scanner(System.in);
		System.out.println("Kilonuzu Giriniz: ");
		kg = input.nextDouble();
		System.out.println("Boyunuzu Metre Cinsinde Giriniz (Araya ',' Koyunuz) : ");
		m = input.nextDouble();
		kitleIndeksi = kg / (m*m);
		System.out.println("Vücut Kitle İndeksiniz: " + kitleIndeksi);

	}

}