package VideoSeries;

public class Video41_AbstractDemo {
    public static void main(String[] args) {

        Video41_CustomerManager customerManager = new Video41_CustomerManager();
        customerManager.baseDBManager = new Video41_MySqlDBManager();
        customerManager.getCustomers();







    }
}
