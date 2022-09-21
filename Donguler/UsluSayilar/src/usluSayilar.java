import java.util.Scanner;
public class usluSayilar {

	public static void main(String[] args) {
		int num, multiple, answer = 1;
		Scanner input = new Scanner(System.in);
		System.out.print("Taban Sayisini Giriniz: ");
		num = input.nextInt();
		System.out.print("Us Sayisini Giriniz: ");
		multiple = input.nextInt();
		
		for(int i = 1; i <= multiple; i++)
		{
			answer *= num ;
		}
		System.out.println("Cevap => " + num + "^" + multiple + " => " + answer);
	}

}
