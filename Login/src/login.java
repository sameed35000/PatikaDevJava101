import java.util.Scanner;

public class login {

    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adınızı Giriniz: ");
        userName = input.nextLine();
        System.out.print("Şifrenizi Giriniz: ");
        password = input.nextLine();

        if (userName.equals("sameed35000") && password.equals("java101")) {
            System.out.println("Giriş Yaptınız");
        } else {
            System.out.println("Hatalı Giriş Yaptınız Şifrenizi Değiştirmek İster Misiniz?\nEvet ise 1'e Hayır ise 2'ye Basınız");
            int forget;
            forget = input.nextInt();
            switch (forget) {
                case 1:
                    String newPassword;
                    System.out.println("Yeni Şifrenizi Giriniz: ");
                    Scanner girdi = new Scanner(System.in);
                    newPassword = girdi.nextLine();
                    if (newPassword.equals("java101")) {
                        System.out.println("Eski Şifreniz ile Yeni Şifreniz Aynı Olamaz!");
                    } else System.out.println("Şifreniz Başarılı Şekilde Değiştirildi!");
                    break;
                case 2:
                    System.out.println("Tekrar Giriş Yapmayı Deneyiniz!");
                    break;
                default:
                    System.out.println("Hatalı Değişken Girdiniz!");
            }
        }
    }
}

