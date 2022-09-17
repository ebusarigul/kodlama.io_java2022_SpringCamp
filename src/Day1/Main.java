package Day1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        String metin = "İlginizi çekebilir";
        String ortaMetin = "Vade süresi"; //Değişken isimlendirmeleri java da camelCase olarak yazılır.

        System.out.println(metin);

        int vade = 12;

        double dolarDun = 18.15;
        double dolarBugun = 18.15;

        boolean dolarDustuMu = false;

        String okYonu = "";

        if (dolarBugun<dolarDun) {
            okYonu = "down.svg";
            System.out.println(okYonu);
        } else if (dolarBugun>dolarDun) {
            okYonu = "up.svg";
            System.out.println(okYonu);
        }
        else {
            okYonu = "equal.svg";
            System.out.println(okYonu);//if -else den biri mutlaka çalışır ama sadece biri çalışır..

            String[] krediler = {"Hızlı kredi","Maaşını Halkbanktan","Mutlu emekli","Hızlı kredi","Maaşını Halkbanktan","Mutlu emekli"};

            for (int i = 0; i < krediler.length; i++) {
                System.out.println(krediler[i]);

            }

        }
    }
}
