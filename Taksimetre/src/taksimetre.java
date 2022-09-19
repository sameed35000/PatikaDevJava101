import java.util.Scanner;
public class taksimetre {

	public static void main(String[] args) {
		double km, ucret, perKm =2.20;
		Scanner girdi = new Scanner(System.in);
		System.out.println("Kaç KM yol gidildiğini giriniz: ");
		km = girdi.nextDouble();
		ucret = 10 + (km * perKm);
		
		ucret = (ucret>= 20) ? ucret:20;
		System.out.println("Ücret: " + ucret);

	}

}
