import java.util.Scanner;

public class artikYil {

	public static void main(String[] args) {
		int year;
		Scanner input = new Scanner(System.in);
		System.out.print("Sorgulamak İstediğiniz Yili Giriniz: ");
		year = input.nextInt();
		if (year % 100 != 0) {
			if(year % 4 == 0) {
				System.out.println(year + " yili artik bir yildir.");
			}else System.out.println(year + " yili artik bir yil degildir.");
		}
		else if(year % 100== 0) {
			if(year % 400 == 0) {
				System.out.println(year + " yili artik bir yildir.");
			}else System.out.println(year + " yili artik bir yil degildir.");
		}
	}
}