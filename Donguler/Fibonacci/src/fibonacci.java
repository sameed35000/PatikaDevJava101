import java.util.Scanner;

public class fibonacci {
	
	public static void main(String[] args) {
		int num, fibOne = 0, fibTwo = 1;
		Scanner input = new Scanner(System.in);
		System.out.print("Fibonacci Serisinde Kaç Sayı Görmek İstiyorsunuz?: ");
		num = input.nextInt();
		for (int i = 0; i <= num-1; i++) {
			int total = 0;
			if (i == 0) {
				System.out.println(fibOne + " + " + fibTwo + " = " + fibTwo);
			} else if (i % 2 == 1) {
				fibOne = fibOne + fibTwo;
				total = fibOne + fibTwo;
				System.out.println(fibTwo + " + " + fibOne + " = " + total);
			} else if (i % 2 == 0) {
				fibTwo = fibOne + fibTwo;
				total = fibOne + fibTwo;
				System.out.println(fibOne + " + " + fibTwo + " = " + total);
			}
			input.close();
			
		}
	}
	
}
