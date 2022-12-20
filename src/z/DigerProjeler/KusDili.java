package z.DigerProjeler;

public class KusDili {

    public static void main(String[] args) {
	    // 2. İngilizce ifadeleri farklı bir KUŞ DİLİ kodlayan bir uygulama yazın. KUŞ DİLİ kodlanmış bir dil
        //biçimidir. Basitçe aşağıdaki algoritmayı kullanın;
        //a. Bir cümledeki kelimeleri split ile kelimelere ayırın.
        //b. Kelimenin ilk harfini sona alın ve sonuna “ay” eki ekleyin.
        //i. “jump” à “umpj” à “umpjay”
        //ii. “the” à “het” à “hetay”

        String cumle="this sentence is written by bird language";
        System.out.println("\nCümlenin ilk hali: "+cumle);
        String ay="ay";
        String [] stringDizi=cumle.split(" ");
        for (int i = 0; i < stringDizi.length; i++) {

            String temp = stringDizi[i];
            char[] charDizi = temp.toCharArray();
            char tempChar = charDizi[0];

            for (int j = 0; j < charDizi.length - 1; j++) {
                charDizi[j] = charDizi[j + 1];
            }
            charDizi[charDizi.length - 1] = tempChar;
            //baştakini sona getirdi

            String tempString = new String(charDizi);
            stringDizi[i] = tempString.concat(ay);
        }
        System.out.print("Cümlenin son hali: ");
        for (int i = 0; i < stringDizi.length; i++) {
            System.out.print(stringDizi[i]+" ");
        }
        System.out.println();

    }
}
