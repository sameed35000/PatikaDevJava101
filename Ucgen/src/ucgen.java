import java.util.Scanner;

public class ucgen {

	public static void main(String[] args) {
		//Hipotenüs Hesaplama
		int x,y;
		double z;
		Scanner input = new Scanner(System.in);
		System.out.println("1. Kenarın Uzunluğunu Giriniz: ");
		x = input.nextInt();
		System.out.println("2. Kenarın Uzunluğunu Giriniz: ");
		y = input.nextInt();
		z = Math.sqrt((x*x)+(y*y));
		System.out.println("Hipotenüs: " + z);
		
		//Alan Hesaplama
		int a,b,c,d;
	    Scanner girdi = new Scanner(System.in);
	    System.out.println("1. Kenarın Uzunluğunu Giriniz: ");
	    a = girdi.nextInt();
	    System.out.println("2. Kenarın Uzunluğunu Giriniz: ");
	    b = girdi.nextInt();
	    System.out.println("3. Kenarın Uzunluğunu Giriniz: ");
	    c = girdi.nextInt();
	    
	    d = (a+b+c)/2;
	    double alan = Math.sqrt(d*(d-a)*(d-b)*(d-c));
	    System.out.println("Üçgenin Alanı: " + alan + "cm^2");
	    
	}

}
