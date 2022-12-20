package Yemek;

public class Sutlac extends Yemek implements ITatli{

    public Sutlac(String yemekAdi, String malzemeler, int porsiyon) {
        super(yemekAdi, malzemeler, porsiyon);
    }

    @Override
    public String sekerKaristir() {
        if (malzemeKontrol("meyve"))
            return "Şekere gerek yok";
        else return "Malzemelere 2 kaşık şeker ekle ve karıştır";
    }

    @Override
    public String hazirla() {
        return malzemeler + " malzemelerini karıştır pişir sonra fırına at";
    }

    @Override
    public String toString() {
        return yemekAdi + ":{" +
                "\nHazırla=" + hazirla() +
                "\nPorsiyon=" + porsiyon +
                "\nŞeker=" + sekerKaristir() +
                "\n}";
    }
}
