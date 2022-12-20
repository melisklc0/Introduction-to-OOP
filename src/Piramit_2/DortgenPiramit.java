package Piramit_2;

public class DortgenPiramit extends Prizmatik implements Piramit{
    public double yanalYukseklik;
    public double tabanKenari;

    public DortgenPiramit(String isim) {
        super(isim);
    }

    @Override
    public double alanHesapla() {
        // Taban alanı + Yanal alan
        return tabanKenari*tabanKenari + (4*yanalYukseklik*tabanKenari)/2;
    }

    @Override
    public double hacimHesapla() {
        // 1/3 * Taban alanı * Yükseklik
        return (tabanKenari*tabanKenari * getYukseklik())/3;
    }

    @Override
    public double tabanAlanHesapla(double kenar) {
        return tabanKenari*tabanKenari;
    }

    @Override
    public String toString() {
        return "---Dörtgen Piramit---" +
                "\nİsim: " + isim +
                "\nKonum: " + yer +
                "\nTaban Alanı: " + tabanAlanHesapla(tabanKenari) +
                "\nYüzey Alanı: " + alanHesapla() +
                "\nHacim: " + hacimHesapla();
    }
}
