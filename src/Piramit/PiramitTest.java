package Piramit;

public class PiramitTest {
    public static void main(String[] args) {

        Konum koniKonumu=new Konum(20,80);
        Konum ucgenKonumu=new Konum(40,120);
        Konum dortgenKonum=new Konum(170,260);

        Konik koni=new Konik("Koni");
        koni.yer=koniKonumu;
        koni.yaricap=6;
        koni.yanalYukseklik=10;
        koni.setYukseklik(15);
        koni.alfaAcisi=90;

        UcgenPiramit ucgenPiramit=new UcgenPiramit("Üçgen Piramit");
        ucgenPiramit.yer=ucgenKonumu;
        ucgenPiramit.tabanKenari=7;
        ucgenPiramit.yanalYukseklik=14;
        ucgenPiramit.setYukseklik(18);

        DortgenPiramit dortgenPiramit=new DortgenPiramit("Dörtgen Piramit");
        dortgenPiramit.yer=dortgenKonum;
        dortgenPiramit.tabanKenari=11;
        dortgenPiramit.yanalYukseklik=16;
        dortgenPiramit.setYukseklik(19);

        System.out.println("\n"+koni.toString());
        System.out.println("\n"+ucgenPiramit.toString());
        System.out.println("\n"+dortgenPiramit.toString());


    }
}
