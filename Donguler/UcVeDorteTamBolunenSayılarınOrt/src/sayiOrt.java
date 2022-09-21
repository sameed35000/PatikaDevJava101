import java.util.Scanner;

public class sayiOrt {
	public static void main(String[] args) {
		
		int say = 0, k, toplam = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Bir Sayi Giriniz: ");
		k = input.nextInt();

		for (int i = 1; i <= k; i++) {
			if (i % 3 == 0 && i % 4 == 0) {
				System.out.println(i);
				toplam += i;
				say++;
			}
		}
		System.out.println("Sayilarin Ortalamasi: " + toplam/say);
		
		
		input.close();
	}

}
