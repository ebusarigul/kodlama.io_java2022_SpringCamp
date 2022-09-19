package VideoSerisi_1_23;

import java.util.Scanner;

public class video21_mukemmelSayi {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.print("sayi giriniz = ");
        int sayi = oku.nextInt();

        boolean mukemmel = false;
        int total = 0;
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                total+= i;
            }
        }
        if (sayi == total) {
            mukemmel = true;
        }
        System.out.println("Sayi mukemmel mi? = " + mukemmel);


    }
}
