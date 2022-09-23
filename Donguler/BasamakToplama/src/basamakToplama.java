import java.util.Scanner;
public class basamakToplama {

	public static void main(String[] args) {
		int num, basSayisi = 0, sum = 0;
		int k = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen Bir Sayi Giriniz: ");
		num = input.nextInt();
		int tempNum = num;
		
		while(tempNum != 0) {
			tempNum /= 10;
			basSayisi++;
		}
		tempNum = num;
		for(int i = 1; i <= basSayisi; i++) {
			k = tempNum % 10;
			tempNum /= 10;
			sum += k;
			if(i < basSayisi) {
				System.out.print(k + " + ");
			}else System.out.print(k);
			
		}
		System.out.print(" = " + sum);
		input.close();

	}

}
