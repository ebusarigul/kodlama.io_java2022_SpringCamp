package VideoSerisi;

public class Video24_Methods {

    public static void main(String[] args) {

        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();

    }

    public static void sayiBulmaca() {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 8;

        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }
        if (varMi){
            mesajVer("sayı mevcuttur = " + aranacak);
        }
        else {
            mesajVer("sayı mevcut degildir = " + aranacak);
        }
    }

    public static void mesajVer(String mesaj){
        System.out.println(mesaj);


    }

}