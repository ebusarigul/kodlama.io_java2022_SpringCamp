package VideoSeries;

public class Video42_InterfaceMain {
    public static void main(String[] args) {

        Video43_CustomerManager customerManager = new Video43_CustomerManager(new Video42_OracleCustomerDal());
        customerManager.add();



    }

}
