package VideoSeries;

public class Video43_CustomerManager {

    private Video42_CustomerDal customerDal;

    public Video43_CustomerManager(Video42_CustomerDal customerDal) {
        this.customerDal=customerDal;
    }

    public void add(){
        //iş kodları
        customerDal.add();
    }

}
