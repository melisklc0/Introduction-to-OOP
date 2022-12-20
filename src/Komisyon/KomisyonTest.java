package Komisyon;

public class KomisyonTest {

    public static void main(String[] args) {
        KomisyonluCalisan satisPersoneli= new KomisyonluCalisan("Ali","Tekin",
                "12345678911",10000,0.1);
        System.out.println("Sonuçlar get ile gelsin:");
        System.out.println("İsim: "+satisPersoneli.getIsim());
        System.out.println();

        System.out.println(satisPersoneli.toString());
        System.out.println("Kazanç: "+satisPersoneli.kazanc());

        satisPersoneli.setBrutSatis(20000);
        satisPersoneli.setPrimOrani(0.2);

        System.out.println(satisPersoneli.toString());
        System.out.println("Kazanç: "+satisPersoneli.kazanc());

        MaasliCalisan yetkili=new MaasliCalisan("Mustafa","Kara","12334354564",20000,0.2,13000);
        System.out.println(yetkili); //toString yazmasak da yazdırır
        System.out.println("Kazanç: "+yetkili.kazanc());
    }
}
