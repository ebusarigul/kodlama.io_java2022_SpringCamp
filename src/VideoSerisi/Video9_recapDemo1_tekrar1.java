package VideoSerisi;

public class Video9_recapDemo1_tekrar1 {
    public static void main(String[] args) {

        int sayi1 = 20;
        int sayi2 = 25;
        int sayi3 = 2;

        int enb = sayi1;

        if (enb < sayi2) {
            enb = sayi2;
        } else if (enb < sayi3) {
            enb = sayi3;
        }
        System.out.println("en büyük : " + enb);

    }
}
