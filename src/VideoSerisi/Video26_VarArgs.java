package VideoSerisi;

public class Video26_VarArgs {

    public static void main(String[] args) {

        String mesaj = "Bugun hava cok guzel";

        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);

        int sayi = topla(16, 34);
        System.out.println(sayi);

        int toplam = topla(23,334,41,123,4);
        System.out.println(toplam);

    }

    public static int topla(int... sayilar) {
        int toplam = 0;
        for (int i = 0; i < sayilar.length ; i++) {
            toplam+=sayilar[i];
        }
        return toplam;
    }

    public static String sehirVer() {
        return "Bursa";
    }
}
