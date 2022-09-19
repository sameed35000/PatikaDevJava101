import java.util.Scanner;

public class manav {

	public static void main(String[] args) {
		double pear, apple, tomato, banana, eggplant, total;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Kaç kilo armut aldığınızı giriniz: ");
		pear = input.nextDouble();
		
		System.out.println("Kaç kilo elma aldığınızı giriniz: ");
		apple = input.nextDouble();
		
		System.out.println("Kaç kilo domates aldığınızı giriniz: ");
		tomato = input.nextDouble();
		
		System.out.println("Kaç kilo muz aldığınızı giriniz: ");
		banana = input.nextDouble();
		
		System.out.println("Kaç kilo patlıcan aldığınızı giriniz: ");
		eggplant = input.nextDouble();
		
		total = (pear * 2.14) + (apple * 3.67) + (tomato * 1.11) + (banana * 0.95) + (eggplant * 5.00);
		System.out.println("Toplam Tutar: " + total);

	}

}
