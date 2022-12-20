package Araba;

public class Araba {
    private double modelYili;
    private double motorHacmi;
    private String aracMarkasi;
    private String aracRengi;
    private double fiyat;

    public Araba(double modelYili, double motorHacmi, String aracMarkasi, String aracRengi, double fiyat) {
        this.modelYili = modelYili;
        this.motorHacmi = motorHacmi;
        this.aracMarkasi = aracMarkasi;
        this.aracRengi = aracRengi;
        this.fiyat = fiyat;
    }

    public double getModelYili() {
        return modelYili;
    }

    public void setModelYili(double modelYili) {
        this.modelYili = modelYili;
    }

    public double getMotorHacmi() {
        return motorHacmi;
    }

    public void setMotorHacmi(double motorHacmi) {
        this.motorHacmi = motorHacmi;
    }

    public String getAracMarkasi() {
        return aracMarkasi;
    }

    public void setAracMarkasi(String aracMarkasi) {
        this.aracMarkasi = aracMarkasi;
    }

    public String getAracRengi() {
        return aracRengi;
    }

    public void setAracRengi(String aracRengi) {
        this.aracRengi = aracRengi;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public double getVergi(double suankiYil){
        double arabaYasi=suankiYil-getModelYili();
        return ((getMotorHacmi()/arabaYasi)*Math.pow(10,3));

    }

}
