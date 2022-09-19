package VideoSerisi_1_23;

import java.util.Scanner;

public class video22_arkadasSayilar {
    public static void main(String[] args) {

        // 220-284

        System.out.println("------ Arkadas sayi kontrol programı-------");
        Scanner oku = new Scanner(System.in);
        System.out.print("ilk sayi giriniz = ");
        int number1 = oku.nextInt();
        System.out.print("ikinci sayi giriniz = ");
        int number2 = oku.nextInt();

        boolean arkadasMi = false;

        int total1 = 0;
        int total2 = 0;

        for (int i = 1; i < number1; i++) {
            if (number1 % i == 0) {
                total1 += i;
            }
        }
        for (int i = 1; i < number2; i++) {
            if (number2 % i == 0) {
                total2 += i;
            }
        }
        if (total1 == number2 && total2 == number1) {
            arkadasMi = true;
        }
        System.out.println("Bu iki sayi arkadas mi? = " + arkadasMi);


    }
}
