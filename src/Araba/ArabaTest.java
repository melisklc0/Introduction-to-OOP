package Araba;

public class ArabaTest {

    public static void main(String[] args) {
        Araba araba1=new Araba(2019,2.3,"Honda","Beyaz",305000);
        Araba araba2=new Araba(2010,1.35,"Opel","Mavi",207000);

        araba1.setAracRengi("Siyah");
        System.out.println();

        System.out.println("Arabanın Markası: "+araba1.getAracMarkasi());
        System.out.println("Arabanın Rengi: "+ araba1.getAracRengi());
        System.out.printf("Arabanın Model Yılı: %.0f %n",araba1.getModelYili());
        System.out.printf("Arabanın Fiyatı: %.0f %n",araba1.getFiyat());
        System.out.printf("Ödemeniz gereken vergi miktarı: %.2f %n %n",araba1.getVergi(2022));


        System.out.println("Arabanın Markası: "+araba2.getAracMarkasi());
        System.out.println("Arabanın Rengi: "+ araba2.getAracRengi());
        System.out.printf("Arabanın Model Yılı: %.0f %n",araba2.getModelYili());
        System.out.printf("Arabanın Fiyatı: %.0f %n",araba2.getFiyat());
        System.out.printf("Ödemeniz gereken vergi miktarı: %.2f %n %n",araba2.getVergi(2022));


    }
}
