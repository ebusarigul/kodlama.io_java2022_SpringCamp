package VideoSerisi;

public class Video30_dortIslem {

    public int Topla(int sayi1,int sayi2){
        return sayi1+sayi2;
    }
    public int Topla(int sayi1,int sayi2,int sayi3){
        return sayi1+sayi2+sayi3;
    }
    public int Topla(int... sayi){
        int toplam=0;
        for(int i : sayi){
            toplam+=i;
        }
        return toplam;
    }

    public int Cikar(int sayi1,int sayi2){
        return sayi1-sayi2;
    }
    public int Carp(int sayi1,int sayi2){
        return sayi1*sayi2;
    }
    public int Bol(int sayi1,int sayi2){
        return sayi1/sayi2;
    }
}
