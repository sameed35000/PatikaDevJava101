import java.util.Scanner;
import java.util.Arrays;
public class KucuktenBuyuge {

	public static void main(String[] args) {
		int size = 0,comp=0;
		Scanner input = new Scanner(System.in);
		System.out.print("Kaç Elemanlı Bir Dizi Oluşturmak İstersiniz?: ");
		size = input.nextInt();
		int[] list = new int[size];
		System.out.println("Dizinin Elemanlarını Giriniz: ");
		for(int i=0;i<list.length;i++) {
			System.out.print((i+1) + ". Elemanı Giriniz: ");
			comp = input.nextInt();
			list[i] = comp;
		}
		Arrays.sort(list);
		System.out.print("Sıralama: ");
		System.out.println(Arrays.toString(list));
	}
}


