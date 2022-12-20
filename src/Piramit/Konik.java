package Piramit;

public class Konik implements Piramit {
    public String isim;
    public Konum yer;
    public double yaricap;
    private double yukseklik;
    public double yanalYukseklik;
    public double alfaAcisi;

    public Konik(String isim) {
        this.isim = isim;
    }

    @Override
    public double alanHesapla() {
        return Math.PI*Math.pow(yaricap,2)+Math.PI*yaricap*yanalYukseklik;
    }

    @Override
    public double hacimHesapla() {
        return (Math.PI*yaricap*getYukseklik())/3;
    }

    public double getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(double yukseklik) {
        if (yukseklik<0)
            throw new IllegalArgumentException("0'dan küçük olamaz");
        this.yukseklik = yukseklik;
    }

    @Override
    public String toString() {
        return "---Konik---" +
                "\nİsim: " + isim +
                "\nKonum: " + yer.toString() +
                "\nYüzey Alanı: " + alanHesapla()+
                "\nHacim: " + hacimHesapla();
    }
}
