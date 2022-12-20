package Account;

import java.util.Scanner;
public class AccountTest {

    public static void main(String[] args) {
        /*z.DigerProjeler.Kutu k=new z.DigerProjeler.Kutu(6,7,5);
        System.out.println("Genişlik: "+k.getGenislik());
        System.out.println("Uzunluk: "+k.getUzunluk());
        System.out.println("Yükseklik: "+k.getYukseklik());
        System.out.println("Yüzey Alanı: "+k.getYuzeyAlani());
        System.out.println("Hacim: "+ k.getHacim());*/

        Account esma=new Account("Esma",-50);
        Account melis=new Account("Melis",130);

        System.out.printf("%s balance: %.2f %n", melis.getName(), melis.getBalance());
        System.out.printf("%s balance: %.2f %n %n", esma.getName(), esma.getBalance());

        Scanner input=new Scanner(System.in);

        System.out.println("Eklenecek miktarı giriniz: ");
        double eklenecekMiktar= input.nextDouble();
        System.out.printf("%s hesabına %.2f ekleniyor.. %n",esma.getName(),eklenecekMiktar);
        esma.paraEkle(eklenecekMiktar);

        System.out.println("Eklenecek miktarı giriniz: ");
        double eklenecekMiktar2= input.nextDouble();
        System.out.printf("%s hesabına %.2f ekleniyor.. %n",melis.getName(),eklenecekMiktar2);
        melis.paraEkle(eklenecekMiktar2);

        System.out.printf("%s balance: %.2f %n", melis.getName(), melis.getBalance());
        System.out.printf("%s balance: %.2f %n", esma.getName(), esma.getBalance());

    }
}
