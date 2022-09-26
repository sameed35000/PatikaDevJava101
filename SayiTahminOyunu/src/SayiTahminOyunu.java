import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
    	
            Random random = new Random();
            Scanner keyboard = new Scanner(System.in);

            int tahmin = 0, eskiTahmin = 0, randomNumber, can, baslangicCani;

            can = 5;
            baslangicCani = can;
            randomNumber = random.nextInt(0, 100);

            int[] tahminList = new int[can];

            while (can > 0) {
                System.out.print("\nTahmininizi Yazınız: ");
                tahmin = keyboard.nextInt();

                if (tahmin == randomNumber) {
                    System.out.println("\nTEBRİKLER!");
                    break;
                } else if ((tahmin >= 0 && tahmin <= 100)) {

                    if (tahmin != randomNumber) {
                        can--;
                        System.out.println("\nYanlış!" + "\nKalan Can: " + can);
                    }

                    if (can != 0) {

                        if (tahmin < randomNumber) {
                            System.out.println("Gizli Sayı Daha Büyük!");
                        } else {
                            System.out.println("Gizli Sayı Daha Küçük!");
                        }
                    }
                }
                tahminList[eskiTahmin] = tahmin;
                eskiTahmin++;
            }
            if (can > 0) {

                System.out.println();
                System.out.println("=============");
                System.out.println("KAZANDINIZ");
                System.out.println("=============");
                System.out.println("Başlangıç Canı: " + baslangicCani);
                System.out.println("Kalan Can: " + can);
                System.out.println("=============");
                System.out.println("Gizli Numara: " + randomNumber);
                System.out.println("=============");
                System.out.println("Tahminleriniz: " + Arrays.toString(tahminList));

            } else {

                System.out.println();
                System.out.println("=============");
                System.out.println("KAYBETTİNİZ!");
                System.out.println("=============");
                System.out.println("Başlangıç Canı: " + baslangicCani);
                System.out.println("Kalan Can: " + can);
                System.out.println("=============");
                System.out.println("Gizli Numara: " + randomNumber);
                System.out.println("=============");
                System.out.println("Tahminleriniz: " + Arrays.toString(tahminList));
            }
            keyboard.close();
        }
    }


