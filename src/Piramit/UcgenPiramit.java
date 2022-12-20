package Piramit;

public class UcgenPiramit extends Prizmatik implements Piramit {
    public double yanalYukseklik;
    public double tabanKenari;

    public UcgenPiramit(String isim) {
        super(isim);
    }

    @Override
    public double alanHesapla() {
        return Math.pow(tabanKenari,2)*Math.sqrt(3);
    }

    @Override
    public double hacimHesapla() {
        return (Math.pow(tabanKenari,3)*Math.sqrt(2))/12;
    }

    @Override
    public double tabanAlanHesapla(double kenar) {
        return (Math.pow(tabanKenari,2)*Math.sqrt(3))/4;
    }

    @Override
    public String toString() {
        return "---UcgenPiramit---" +
                "\nİsim: " + isim +
                "\nKonum: " + yer.toString() +
                "\nYüzey Alanı: " + alanHesapla()+
                "\nHacim: " + hacimHesapla() +
                "\nTaban Alanı: " + tabanAlanHesapla(tabanKenari);
    }
}
