import java.util.Scanner;

public class NotOrt {

	public static void main(String[] args) {
		int mat, fiz, kim, biy, tarih, edeb, dva;
		
		Scanner not = new Scanner(System.in);
		System.out.println("Matematik Notunuzu Giriniz: ");
		mat = not.nextInt();
		
		System.out.println("Fizik Notunuzu Giriniz: ");
		fiz = not.nextInt();
		
		System.out.println("Kimya Notunuzu Giriniz: ");
		kim = not.nextInt();
		
		System.out.println("Biyoloji Notunuzu Giriniz: ");
		biy = not.nextInt();
		
		System.out.println("Tarih Notunuzu Giriniz: ");
		tarih = not.nextInt();
		
		System.out.println("Edebiyat Notunuzu Giriniz: ");
		edeb = not.nextInt();
		
		System.out.println("Dil Anlatım Notunuzu Giriniz: ");
		dva = not.nextInt();
		
		double ort = (mat+fiz+kim+biy+tarih+edeb+dva)/7.0;
		System.out.println("Ortalamanız " + ort);
		
		boolean kosul = ort >= 60.0;
		String sınıf = kosul ? "Sınıfı Geçti" : "Sınıfta Kaldı";
		System.out.println(sınıf);

	}

}
