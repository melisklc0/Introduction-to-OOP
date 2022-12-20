package Ogrenci;

public class OgrenciTest {

    public static void main(String[] args) {
        Ogrenci ogrenci1=new Ogrenci();
        Ogrenci ogrenci2=new Ogrenci("Sevgi", "Bilgisayar");
        Ogrenci ogrenci3=new Ogrenci("Alperen", "Bilgisayar",3.2,"2021");
        Ogrenci ogrenci4=new Ogrenci("Mert", "Bilgisayar", 2.3,"2018");

        System.out.println("Öğrenci Bilgileri");
        System.out.println("OGR-1 " +ogrenci1.getAd()+ " " +ogrenci1.getBolum()+ " " +ogrenci1.ogrNoOlustur()+ " " +ogrenci1.getGano());
        System.out.println("OGR-2 " +ogrenci2.getAd()+ " " +ogrenci2.getBolum()+ " " +ogrenci2.ogrNoOlustur()+ " " +ogrenci2.getGano());
        System.out.println("OGR-3 " +ogrenci3.getAd()+ " " +ogrenci3.getBolum()+ " " +ogrenci3.ogrNoOlustur()+ " " +ogrenci3.getGano());
        System.out.println("OGR-4 " +ogrenci4.getAd()+ " " +ogrenci4.getBolum()+ " " +ogrenci4.ogrNoOlustur()+ " " +ogrenci4.getGano());

        System.out.println("3. Öğrencinin ödeyeceği harç: "+ogrenci3.harcHesapla(4));
        System.out.println("4. Öğrencinin ödeyeceği harç: "+ogrenci3.harcHesapla(4,2));
    }
}