package Yemek;

public abstract class Yemek {
    protected String yemekAdi;
    protected String malzemeler;
    protected int porsiyon;

    public Yemek(String yemekAdi, String malzemeler, int porsiyon) {
        this.yemekAdi = yemekAdi;
        this.malzemeler = malzemeler;
        this.porsiyon = porsiyon;
    }

    public abstract String hazirla();

    public String aciDurumu(String aci){
        aci= aci + " ";
        return aci.concat(yemekAdi);
    }
    public boolean malzemeKontrol(String malzeme){
        String [] malzemeDizisi=malzemeler.split(",");
        for (String malzemeler : malzemeDizisi){
            if (malzemeler.equalsIgnoreCase(malzeme))
                return true;
        }
        return false;
    }

}
