public class diziOrtalama {

	public static void main(String[] args) {
		int[] list = { 1, 3, 5, 7, 9 };
		double sum = 0;

		for (double i : list) {
			sum += (1.0 / i);
			System.out.println(i);
		}
		
		System.out.println("Array'in Elemanlarının Ortalaması: " + (list.length / sum));
	}
}
