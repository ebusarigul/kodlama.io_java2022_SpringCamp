package VideoSeries;

public class Video39_Main {
    public static void main(String[] args) {

       Video39_BaseKrediManager[] krediManagers = new Video39_BaseKrediManager[]
               {new Video39_OgretmenKrediManager(),new Video39_TarimKrediManager(),new Video39_OgrenciKrediManager()};

       for (Video39_BaseKrediManager krediManager : krediManagers){
           System.out.println(krediManager.hesapla(1000));
       }



    }
}
