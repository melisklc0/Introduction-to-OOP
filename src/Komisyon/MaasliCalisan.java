package Komisyon;

public class MaasliCalisan extends KomisyonluCalisan {
    private double bazMaas;

    public MaasliCalisan(String isim, String soyisim, String tcKimlikNo, double brutSatis, double primOrani, double bazMaas) {

        super(isim, soyisim, tcKimlikNo, brutSatis, primOrani);
        if (bazMaas<0){
            throw new IllegalArgumentException("Baz maaş pozitif olmalı.");
        }
        this.bazMaas = bazMaas;
    }

    public double getBazMaas() {return bazMaas;}
    public void setBazMaas(double bazMaas) {
        if (bazMaas<0){
            throw new IllegalArgumentException("Baz maaş pozitif olmalı.");
        }
        this.bazMaas = bazMaas;
    }

    @Override
    public double kazanc() {
        return bazMaas+(super.kazanc());
    }

    /*public double kazanc(){
        return bazMaas+(primOrani*brutSatis);
    } bu da bi seçenek */

    @Override
    public String toString() {
        return "MaasliCalisan{" +
                "isim='" + getIsim() + '\'' +
                ", soyisim='" + getSoyisim() + '\'' +
                ", tcKimlikNo='" + getSoyisim() + '\'' +
                ", brutSatis=" + brutSatis +
                ", primOrani=" + primOrani +
                ", bazMaas=" + bazMaas +
                '}';
        //protected olduğu için erişebildik. private olanlara erişemediğimiz için get ile yazdık.
    }
}


