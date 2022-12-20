package z.DigerProjeler;

import java.util.Scanner;

public class TelefonNumarasi {

    public static void main(String[] args) {

        //(555) 555-5555 biçiminde bir telefon numarasını String olarak alın. Türkiye’de kullanılan
        //numaralar için doğrulama yapan bir uygulama yazın. Hem alan kodu hem de telefon numarası
        //yazdırılmalıdır. (Başında 0 olmayacak ve sadece rakamlardan oluşacaktır.)

        Scanner klavye=new Scanner(System.in);
        System.out.print("Telefon numarası giriniz, örnek: (555) 555-5555" +
                "\n-> ");
        String numara=klavye.nextLine();
        boolean kontrol=numaraKontrol(numara);
        if (kontrol){
            System.out.println("Doğru numara girişi yapıldı.");
            System.out.println("Numaranız: +90 "+numara.replace('-',' '));
        }
        else System.out.println("Yanlış formatta numara girdiniz.");

    }
    public static boolean numaraKontrol(String numara){
        return numara.matches("[(][5][0-9]\\d[)]\s[0-9]\\d{2}-[0-9]\\d{3}");
    }
}
