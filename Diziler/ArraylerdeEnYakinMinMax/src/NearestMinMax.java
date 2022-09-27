import java.util.Scanner;
import java.util.Arrays;

public class NearestMinMax {

	public static void main(String[] args) {
		int[] list = { 15, 12, 788, 1, -1, -778, 2, 0 };
		Arrays.sort(list);
		Scanner input = new Scanner(System.in);
		System.out.print("Bir Sayı Giriniz: ");
		int x = input.nextInt();
		for (int i = 0; i < list.length; i++) {
			if (list[i] >= x) {
				System.out.println("Girdiğiniz Sayıya En Yakın Kendisinden Küçük Sayı: " + list[i - 1]);
				System.out.println("Girdiğiniz Sayıya En Yakın Kendisinden Büyük Sayı: " + list[i]);
				break;
			}
		}
		input.close();	
	}
}
