package VideoSeries;

public class Video25_Methods2 {

    public static void main(String[] args) {


        String mesaj = "Bugun hava cok guzel";

        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);

        int sayi = topla(16,34);
        System.out.println(sayi);


    }

    public static void ekle(){
        System.out.println("Added");
    }

    public static void sil(){
        System.out.println("Deleted");
    }

    public static void guncelle(){
        System.out.println("Edit");
    }

    public static int topla(int a,int b){
        return a+b;
    }

    public static String sehirVer(){
        return "Bursa";
    }

}

