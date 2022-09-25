package VideoSeries;

public class Video37_InheritanceDemo {
    public static void main(String[] args) {

        Video37_OgretmenKrediManager ogretmenKrediManager = new Video37_OgretmenKrediManager();
        ogretmenKrediManager.Hesapla();

        Video37_KrediUI krediUI = new Video37_KrediUI();
        krediUI.KrediHesapla(ogretmenKrediManager);
        krediUI.KrediHesapla(new Video37_OgretmenKrediManager());
        krediUI.KrediHesapla(new Video37_TarimKrediManager());



    }
}
