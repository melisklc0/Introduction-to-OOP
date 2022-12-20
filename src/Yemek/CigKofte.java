package Yemek;

public class CigKofte extends Yemek {

    public CigKofte(String yemekAdi, String malzemeler, int porsiyon) {
        super(yemekAdi, malzemeler, porsiyon);
    }

    @Override
    public String hazirla() {
        return malzemeler + " malzemelerini karıştır ve güzelce yoğur";
    }

    @Override
    public String toString() {
        return yemekAdi + ":{" +
                "\nHazırla=" + hazirla() +
                "\nPorsiyon=" + porsiyon +
                "\n}";
    }
}
