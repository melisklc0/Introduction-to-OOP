package Piramit;

public class DortgenPiramit extends Prizmatik implements Piramit{
    public double yanalYukseklik;
    public double tabanKenari;

    public DortgenPiramit(String isim) {
        super(isim);
    }

    @Override
    public double alanHesapla() {
        return tabanKenari*tabanKenari + (4*yanalYukseklik*tabanKenari)/2;
    }

    @Override
    public double hacimHesapla() {
        return (tabanKenari*tabanKenari*getYukseklik())/3;
    }

    @Override
    public double tabanAlanHesapla(double kenar) {
        return tabanKenari*tabanKenari;
    }

    @Override
    public String toString() {
        return "---DortgenPiramit---" +
                "\nİsim: " + isim +
                "\nKonum: " + yer.toString() +
                "\nYüzey Alanı: " + alanHesapla()+
                "\nHacim: " + hacimHesapla() +
                "\nTaban Alanı: " + tabanAlanHesapla(tabanKenari);
    }
}
