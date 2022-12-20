package Ogrenci;

public class Ogrenci {

    private String ad;
    private String bolum;
    private String girisYili;
    private String ogrNo;
    private double gano;
    private static final int bolumKodu = 123;
    private static int count = 0;

    //1. constructor boş
    public Ogrenci() {
        this(null, null, 0, "2002");
    }

    //2. constructor
    public Ogrenci(String ad, String bolum) {
        this(ad, bolum, 0, "2005");
    }

    //3. constructor (ana)
    public Ogrenci(String ad, String bolum, double gano, String girisYili) {
        if (gano < 0 || gano > 4) {
            throw new IllegalArgumentException("Gano negatif veya 4'ten büyük olamaz.");
        }
        this.ad = ad;
        this.bolum = bolum;
        this.gano = gano;
        this.girisYili = girisYili;
    }

    //başka bi tanımlama şekli
    /*public Ogrenci(Ogrenci ogr){
        this(ogr.ad,ogr.bolum,ogr.gano,ogr.girisYili)
    }*/

    public String ogrNoOlustur() {
        count++;
        if (count < 10) {
            ogrNo = "" + girisYili + bolumKodu + "00" + count; //bu şekilde Stringe çeviriyoruz.
        } else if (count < 100) {
            ogrNo = "" + girisYili + bolumKodu + "0" + count;
        } else {
            ogrNo = "" + girisYili + bolumKodu + count;
        }
        return ogrNo;
    }
    //String.valueOf da stringe çevirmek için kullanılabilir
    // ogrNo = (String.valueOf(girisYili) + String.valueOf(bolumKodu) + "00" + String.valueOf(count));

    //getter-setter lar
    public String getAd() {return ad;}
    public void setAd(String ad) {this.ad = ad;}
    public String getBolum() {return bolum;}
    public void setBolum(String bolum) {this.bolum = bolum;}
    public double getGano() {return gano;}

    //ilk başta kontrol yaptık ama sonradan negatif yapılamaması için tekrar kontrol yapıcaz
    public void setGano(double gano) {
        if (gano<0 || gano>4){
            throw new IllegalArgumentException("Gano negatif veya 4'ten büyük olamaz.");
        }
        this.gano = gano;
    }

    //1. harç metodu (yıl uzatılmazsa)
    public double harcHesapla(int dersSayisi){
        return dersSayisi * 120;
    }
    //2. harç metodu (yıl uzatılırsa)
    public double harcHesapla(int dersSayisi,double uzatmaYili){
        return dersSayisi * 120 * uzatmaYili;
    }

}
