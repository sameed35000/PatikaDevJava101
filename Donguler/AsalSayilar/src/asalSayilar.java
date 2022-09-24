public class asalSayilar {

	public static void main(String[] args) {
		
        boolean isPrime;

        for (int sayi=2; sayi<100;sayi++){
            isPrime=true;

            for(int i=2; i<sayi; i++){
                if(sayi % i== 0){
                    isPrime=false;
                }
            }
            if(isPrime){
                System.out.print(sayi + " ");
            }
        }
	}
}
