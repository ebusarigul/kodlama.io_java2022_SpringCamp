package VideoSeries;

public class Video42_MySqlCustomerDal implements Video42_CustomerDal, Video42_Repository{
    @Override
    public void add() {
        System.out.println("My SQL eklendi");
    }
}
