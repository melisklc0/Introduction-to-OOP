package Yemek;

public class YemekTest {
    public static void main(String[] args) {

        Sutlac sutlac=new Sutlac("Sütlaç","Pirinç,Süt,Şeker",4);
        Pasta pasta1=new Pasta("Çikolatalı Pasta","Kakao,Süt,Yumurta,Un,Vanilya,Yağ",2);
        Pasta pasta2=new Pasta("Meyveli Pasta","Süt,Yumurta,Un,Vanilya,Yağ,Meyve",2);
        CigKofte cigKofte=new CigKofte("Çiğ Köfte","Bulgur,Salça,İsot,Pul Biber,Yağ",1);

        cigKofte.yemekAdi = cigKofte.aciDurumu("Bol Acılı");

        System.out.println();

        System.out.println(sutlac + "\n");
        System.out.println(pasta1 + "\n");
        System.out.println(pasta2 + "\n");
        System.out.println(cigKofte + "\n");

    }
}
