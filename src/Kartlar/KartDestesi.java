package Kartlar;

import java.security.SecureRandom;
//bu sınıf ile random sayı ürettiricez.

public class KartDestesi {

    private static final SecureRandom randomSayi = new SecureRandom();
    private static final int toplamKart = 52;

    private Kartlar[] deste = new Kartlar[toplamKart]; //referans kart destesi
    private int simdikiKart = 0; //sıradaki kartın indeksi 0-51 arası olmalı

    public KartDestesi() {
        String[] yuzler = {"As", "İki", "Üç", "Dört", "Beş", "Altı", "Yedi", "Sekiz", "Dokuz", "On", "Vale", "Kız", "Papaz"};
        String[] takimlar = {"Kupa", "Maça", "Karo", "Sinek"};

        for (int simdiki = 0; simdiki < deste.length; simdiki++) {
            deste[simdiki] = new Kartlar(yuzler[simdiki % 13], takimlar[simdiki / 13]);
        } //deste oluşturdu
    }

    public void karistir() {
        simdikiKart = 0;
        for (int ilk = 0; ilk < deste.length; ilk++) {
            int ikinci = randomSayi.nextInt(toplamKart);
            //sırasıyla kart destesindeki her kartı random bir sayı ile swap yapıcaz.

            Kartlar temp = deste[ilk];
            deste[ilk] = deste[ikinci];
            deste[ikinci] = temp;
            //swap işlemi
        }
    }

    //bir kart dağıt
    public Kartlar kartDagit() {
        if (simdikiKart < deste.length) {
            return deste[simdikiKart++];
        } else return null;
    }

}
