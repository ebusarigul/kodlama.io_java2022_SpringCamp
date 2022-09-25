package VideoSeries;

public class Video14_Arrays_Diziler {
    public static void main(String[] args) {

        String ogr1 = "Ebubekir";
        String ogr2 = "Havva";
        String ogr3 = "Eymen";

        String[] ogrenciler = new String[4];
        ogrenciler[0] = ogr1;
        ogrenciler[1] = ogr2;
        ogrenciler[2] = ogr3;
        ogrenciler[3] = "Selma";
        //ogrenciler[4] = "Büşra";

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }

        System.out.println("------------------------");

        for (String ogrenci : ogrenciler){
            System.out.println(ogrenci);
        }


    }
}
