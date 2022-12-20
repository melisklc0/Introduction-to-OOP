package z.DigerProjeler;

import java.util.Arrays;

public class StringNotlar {

    public static void main(String[] args) {
        String st="string çalışması ";
        String st2="string denemesi";
        String st3="deneme,virgülle ayrıma,hehe";
        System.out.println(st.length());
        System.out.println(st.charAt(0));
        System.out.println(st.indexOf('n'));
        System.out.println(st.indexOf("alı"));
        System.out.println(st.lastIndexOf("s")); //s nin en son bulunduğu index
        //eğer dizide o eleman yoksa -1 döndürür
        char[] charDizi=new char[6];
        st2.getChars(0,6,charDizi,0);
        //charDizisine bu 0-6 elemanları kopyalamış oldu
        System.out.println(charDizi);
        //.equalsIgnoreCase küçük-büyük harfe duyarlı olmadan bir eşitlik kontrolü yapar
        /*stringlerin unicode değerleri:
        a.compareTo(b) Karakter a alfabetik olarak b'den önce gelir. Dolayısıyla çıktı -1'dir
        b.compareTo(a) Karakter b, alfabetik olarak a'dan sonra gelir. Dolayısıyla çıktı 1
        b.compareTo(b) Karakter b eşdeğerdir, dolayısıyla çıktı 0'dır.*/
        System.out.println(st.regionMatches(0,st2,0,6));
        //ilk 6 elemanları eşleşiyor mu?
        //ignore case için şöyle:
        System.out.println(st.regionMatches(true,0,st2,0,6));
        System.out.println(st.startsWith("ing",3)); //3. indexten itibaren ing ile mi başlıyor? true
        System.out.println(st.endsWith("asi")); //asi ile mi bitiyor? false
        System.out.println(st.substring(3)); //index 3 ten itibaren bölüyor (ing çalışması)
        System.out.println(st.substring(3,6)); //3 ten 6 ya kadar (6 dahil değil) bölüyor, ing
        System.out.println(st.concat(st2)); //ikisini birleştirir, + dan farklı olarak yeni bi string oluşturur
        System.out.println(st.replace('s','m')); //s leri m ye çevirecek mtring çalışmamı
        System.out.println(st.toUpperCase()); //hepsini büyük harf yazıcak, lowerCase küçük harfle yazdırır
        System.out.println(st.trim()); //boşlukları siler stringçalışması
        char [] yeniDizi=st.toCharArray(); //char dizisine çevirdi
        System.out.println(yeniDizi);
        //nesneleri yazıya geçirirken nesne.toString yapıyorduk ama ilkel(primitive) tipler için bunu String.valueOf(tip) ile yapıyoruz
        int intt=5;
        System.out.println(String.valueOf(intt));
        System.out.println(String.valueOf(charDizi,0,3)); //belli bi kısmını aldı stri
        String [] deneme=st3.split(","); //stringi , gördüğü yerde ayırıcak (virgülü silecek) bunlara token denir, bu tokenlerin dizisi oldu
        System.out.println(deneme[0]); //deneme

        //-----------------------------------------------------------
        /*“\d” herhangi bir sayısal karakterdir.
        “\w” herhangi bir harf (büyük veya küçük harf), herhangi bir rakam veya alt çizgi karakteridir.
        “\s” boşluk,
        sekme (\t),
        satır başı (\r),
        yeni satır(\n)
        form feed (\f).*/

    }

    public static boolean numaraKontrol(String numara){
        return numara.matches("[(][5][0-9]\\d[)]\s[0-9]\\d{2}-[0-9]\\d{3}");
    }

}
