package Piramit_2;

public class PiramitTest {
    public static void main(String[] args) {

        Konum koniKonumu=new Konum(34,24);
        Konum ucgenPrKonumu=new Konum(50,80);
        Konum dortgenPrKonumu=new Konum(150,72);

        Konik koni=new Konik("Koni");
        koni.yer=koniKonumu;
        koni.alfaAcisi=90;
        koni.yaricap=8;
        koni.yanalYukseklik=20;
        koni.setYukseklik(25);

        UcgenPiramit ucgenPr=new UcgenPiramit("Üçgen Piramit");
        ucgenPr.yer=ucgenPrKonumu;
        ucgenPr.tabanKenari=10;
        ucgenPr.yanalYukseklik=15;
        ucgenPr.setYukseklik(20);

        DortgenPiramit dortgenPr=new DortgenPiramit("Dörtgen Piramit");
        dortgenPr.yer=dortgenPrKonumu;
        dortgenPr.tabanKenari=8;
        dortgenPr.yanalYukseklik=12;
        dortgenPr.setYukseklik(16);

        System.out.println("\n"+koni.toString());
        System.out.println("\n"+ucgenPr.toString());
        System.out.println("\n"+dortgenPr.toString());


    }
}
