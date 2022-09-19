package VideoSerisi_1_23;

import java.util.Scanner;

public class video20_sesliHarfler {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.print("sesli harf giriniz = ");
        String harf = oku.next();

        switch (harf) {
            case "A":
            case "I":
            case "O":
            case "U":
                System.out.println("kalın sesli harf");
                break;
            case "E":
            case "İ":
            case "Ö":
            case "Ü":
                System.out.println("İnce sesli harf");
                break;
            default:
                System.out.println("Gecersiz harf girdiniz.");


        }


    }
}
