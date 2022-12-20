package Kartlar;

public class KartlarTest {

    public static void main(String[] args) {

        System.out.println();
        KartDestesi benimDestem=new KartDestesi();
        benimDestem.karistir();

        for (int i = 1; i <= 52; i++) {
            System.out.printf("%-19s",benimDestem.kartDagit());

            if (i % 4 == 0) {
                System.out.println();
            } //her 4 satırda bir boşluk atıcak
        }

    }
}
