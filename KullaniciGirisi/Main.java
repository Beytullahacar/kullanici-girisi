package KullaniciGirisi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kullanıcı adınız : ");
        String userName= scan.nextLine();

        if (userName.equals("patika")){
            System.out.print("Şifrenizi giriniz : ");
            int password = scan.nextInt();
            if (password == 123){
                System.out.println("Giriş başarılı");
            }else{
                System.out.println("Şifrenizi değiştirmek için 1'e basınız : ");
                int secim = scan.nextInt();
                switch (secim){
                    case 1:
                        System.out.print("Yeni şifrenizi giriniz : ");
                        int newPassword = scan.nextInt();
                        if (newPassword == 123){
                            System.out.println("Lütfen farklı bir şifre belirleyiniz");
                        }else {
                            System.out.println("Şifre oluşturuldu.");
                        }
                        break;
                    case 2:
                        System.out.println("Şifre oluşturulamadı");
                        break;

                }
            }
        }else {
            System.out.println("Kullanıcı adı hatalı!");
        }
    }
}