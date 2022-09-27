import java.util.Arrays;

public class TekrarEdenSayilar {
	public static void main(String[] args) {
		int[] list = { 10, 20, 15, 20, 10, 15, 10, 20, 5, 20 };

		int[] frekans = new int[list.length];

		for (int i = 0; i < list.length; i++)
			frekans[i] = 1;

		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list.length; j++) {
				if ((i != j) && (list[i] == list[j])) {
					frekans[i]++;
				}
			}
		}
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list.length; j++) {
				if ((i != j) && (list[i] == list[j])) {
					list[j] = 0;
				}
			}
		}
		System.out.println(Arrays.toString(list));
		for (int i = 0; i < list.length; i++) {
			if (frekans[i] > 1) {
				if (list[i] != 0)
					System.out.println(list[i] + " sayisi " + frekans[i] + " kere tekrar edildi.");
			}
		}
	}
}
