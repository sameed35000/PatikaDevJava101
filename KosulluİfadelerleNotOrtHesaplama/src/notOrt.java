import java.util.Scanner;
public class notOrt {

	public static void main(String[] args) {
		double mat,fizik,kimya,turkce,muzik;
		double ort=0.0 ;
		int dersSayisi=0;
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen Matematik notunu giriniz: ");
			mat = input.nextInt();
	        if ((mat >= 0) && (mat <= 100)) {
	            ort += mat;
	            dersSayisi++;
	        }else if ((mat < 0) || ( mat > 100)) {
	            System.out.println("Hatalı Giriş Yaptınız Dikkate Alınmayacaktır!");
	        }
	        
	    System.out.print("Lütfen Fizik notunu giriniz: ");
			fizik = input.nextInt();
	        if ((fizik >= 0) && (fizik <= 100)) {
	            ort += fizik;
	            dersSayisi++;
	        }else if ((fizik < 0) || ( fizik > 100)) {
	            System.out.println("Hatalı Giriş Yaptınız Dikkate Alınmayacaktır!");
	        }
	     
	        System.out.print("Lütfen Kimya notunu giriniz: ");
			kimya = input.nextInt();
	        if ((kimya >= 0) && (kimya <= 100)) {
	            ort += kimya;
	            dersSayisi++;
	        }else if ((kimya < 0) || ( kimya > 100)) {
	            System.out.println("Hatalı Giriş Yaptınız Dikkate Alınmayacaktır!");
	        }
	        
	        System.out.print("Lütfen Türkçe notunu giriniz: ");
			turkce = input.nextInt();
	        if ((turkce >= 0) && (turkce <= 100)) {
	            ort += turkce;
	            dersSayisi++;
	        }else if ((turkce < 0) || ( turkce > 100)) {
	            System.out.println("Hatalı Giriş Yaptınız Dikkate Alınmayacaktır!");
	        }
	        
	        System.out.print("Lütfen Müzik notunu giriniz: ");
			muzik = input.nextInt();
	        if ((muzik >= 0) && (muzik <= 100)) {
	            ort += muzik;
	            dersSayisi++;
	        }else if ((muzik < 0) || ( muzik > 100)) {
	            System.out.println("Hatalı Giriş Yaptınız Dikkate Alınmayacaktır!");
	        }
	        
	        ort /= dersSayisi;
	        if(ort >= 50) {
	        	System.out.println("Sınıfı Geçtiniz Tebrikler!");
	        }else System.out.println("Sınıfta kaldınız!!");
	        
	        System.out.println("Ortalamanız: " + ort);

	}

}
