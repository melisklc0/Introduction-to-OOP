package Komisyon;

public class KomisyonluCalisan{
    private final String isim;
    private final String soyisim;
    private final String tcKimlikNo;
    protected double brutSatis;
    protected double primOrani;
    //protected yaparsak direkt alt class lar erişebilir (protected yapmak daha kolay)

    public KomisyonluCalisan(String isim, String soyisim, String tcKimlikNo, double brutSatis, double primOrani) {

        if (brutSatis<0){
            throw new IllegalArgumentException("Brüt satış pozitif olmalı.");
        }
        if (primOrani<=0 || primOrani>=1){
            throw new IllegalArgumentException("Prim oranı 0-1 arasında olmalı.");
        }

        this.isim = isim;
        this.soyisim = soyisim;
        this.tcKimlikNo = tcKimlikNo;
        this.brutSatis = brutSatis;
        this.primOrani = primOrani;
    }

    public String getIsim() {return isim;}
    public String getSoyisim() {return soyisim;}
    public String getTcKimlikNo() {return tcKimlikNo;}
    public double getBrutSatis() {return brutSatis;}
    public double getPrimOrani() {return primOrani;}

    public void setBrutSatis(double brutSatis) {
        if (brutSatis<0){
            throw new IllegalArgumentException("Brüt satış pozitif olmalı.");
        }
        this.brutSatis = brutSatis;
    }

    public void setPrimOrani(double primOrani) {
        if (primOrani<=0 || primOrani>=1){
            throw new IllegalArgumentException("Prim oranı 0-1 arasında olmalı.");
        }
        this.primOrani = primOrani;
    }

    public double kazanc(){
        return (primOrani*brutSatis);
    }

    @Override
    public String toString() {
        return "KomisyonluCalisan {" +
                "isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", tcKimlikNo='" + tcKimlikNo + '\'' +
                ", brutSatis=" + brutSatis +
                ", primOrani=" + primOrani +
                '}';
    }
}
