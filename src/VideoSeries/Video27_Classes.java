package VideoSeries;

public class Video27_Classes {
    public static void main(String[] args) {

        //reference type
        Video27_CustomerManager customerManager = new Video27_CustomerManager();
        Video27_CustomerManager customerManager1 = new Video27_CustomerManager();
        customerManager=customerManager1;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        // value type
        int sayi1 = 10;
        int sayi2 = 15;
        sayi2 = sayi1;
        sayi1=30;
        System.out.println(sayi2); // 10 vericek

        int[] sayilar1 = new int[]{1,2,3};
        int[] sayilar2 = new int[]{4,5,6};
        sayilar2 = sayilar1;
        sayilar1[0]= 10;
        System.out.println(sayilar2[0]); // 10 verdi cunku diziler referans tiptir.


    }
}
