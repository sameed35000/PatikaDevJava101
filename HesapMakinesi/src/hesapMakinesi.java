import java.util.Scanner;
public class hesapMakinesi {

	public static void main(String[] args) {
		int islem, n1, n2;
		System.out.print("1. Sayıyı Giriniz: ");
		Scanner input = new Scanner(System.in);
		n1 = input.nextInt();
		System.out.print("2. Sayıyı Giriniz: ");
		n2 = input.nextInt();
		
		System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
		System.out.print("İstediğiniz İşlemin Numarasını Giriniz: ");
		islem = input.nextInt();
		switch(islem) {
			case 1:
				System.out.println("Sonuç: " + (n1+n2));
				break;
			case 2:
				System.out.println("Sonuç: " + (n1-n2));
				break;
			case 3:
				System.out.println("Sonuç: " + (n1*n2));
				break;
			case 4:
				if(n2==0){
				System.out.println("Bir Sayı 0'a Bölünemez");
			} else System.out.println("Sonuç: " + (n1/n2));
				break;
			default: System.out.println("Geçersiz İşlem Girdiniz! Tekrar Deneyin.");
		}
	}
}
