package VideoSerisi;

import java.util.Scanner;

public class Video19_miniProjeAsalSayi {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.print("sayi giriniz = ");
        int sayi = oku.nextInt();

        boolean asalMi=true;

        if (sayi == 1){
            System.out.println("sayı asal degildir");
            return;
        }

        if (sayi<1){
            System.out.println("gecersiz sayı");
            return;
        }


        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                asalMi=false;break;
            }
        }
        System.out.println("bu sayi asal mi = " + asalMi);
    }

}

