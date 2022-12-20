package z.DigerProjeler;

public class Kutu {
    private double genislik;
    private double yukseklik;
    private double uzunluk;

    public Kutu(double genislik, double yukseklik, double uzunluk) {
        this.genislik = genislik;
        this.yukseklik = yukseklik;
        this.uzunluk = uzunluk;
    }

    public double getGenislik() {
        return genislik;
    }
    public void setGenislik(double genislik) {
        this.genislik = genislik;
    }
    public double getYukseklik() {
        return yukseklik;
    }
    public void setYukseklik(double yukseklik) {
        this.yukseklik = yukseklik;
    }
    public double getUzunluk() {
        return uzunluk;
    }
    public void setUzunluk(double uzunluk) {
        this.uzunluk = uzunluk;
    }

    public double getHacim(){
        return getYukseklik()*getGenislik()*getUzunluk();
    }

    public double getYuzeyAlani(){
        return 2*( (getYukseklik()*getGenislik()) + (getYukseklik()*getUzunluk()) + (getGenislik()*getUzunluk()) );
    }



}
