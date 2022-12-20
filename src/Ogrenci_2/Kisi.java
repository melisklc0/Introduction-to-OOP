package Ogrenci_2;

public class Kisi {
    private int dogumYili;
    private String isim;

    public Kisi(String isim, int dogumYili) {
        this.dogumYili = dogumYili;
        this.isim = isim;
    }

    public int getYas() {
        return (2022-dogumYili);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "dogumYili: " + dogumYili +
                ", isim: " + isim+"}";
    }
}
