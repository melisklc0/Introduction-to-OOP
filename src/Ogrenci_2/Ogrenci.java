package Ogrenci_2;

public class Ogrenci extends Kisi {
    private Ders kaldigiDers;
    private int girisYili;
    private String ogrNo;


    public Ogrenci(String isim,int dogumYili,  String ogrNo) {
        super(isim,dogumYili);
        this.girisYili=Integer.parseInt((ogrNo.substring(0,4)));
        this.ogrNo = ogrNo;
    }

    public void dersEkle(Ders ders){
        kaldigiDers=ders;
    }

    public Ders getKaldigiDers() {
        return kaldigiDers;
    }

    public void setKaldigiDers(Ders kaldigiDers) {
        this.kaldigiDers = kaldigiDers;
    }

    public int getGirisYili() {
        return girisYili;
    }

    public void setGirisYili(int girisYili) {
        this.girisYili = girisYili;
    }

    public String getOgrNo() {
        return ogrNo;
    }

    public void setOgrNo(String ogrNo) {
        this.ogrNo = ogrNo;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +super.toString()+
                "\ngirisYili: " + girisYili +
                ", ogrNo: " + ogrNo+
                "\nkaldigiDers: " + kaldigiDers+"}";
    }
}
