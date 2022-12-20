package Piramit_2;

public class UcgenPiramit extends Prizmatik implements Piramit{
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
        return "---Üçgen Piramit---" +
                "\nİsim: " + isim +
                "\nKonum: " + yer +
                "\nTaban Alanı: " + tabanAlanHesapla(tabanKenari) +
                "\nYüzey Alanı: " + alanHesapla() +
                "\nHacim: " + hacimHesapla();
    }

}
