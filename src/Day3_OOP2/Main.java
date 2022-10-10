package Day3_OOP2;

import Day3_OOP2.business.ProductManager;
import Day3_OOP2.core.logging.DatabaseLogger;
import Day3_OOP2.core.logging.FileLogger;
import Day3_OOP2.core.logging.Logger;
import Day3_OOP2.core.logging.MailLogger;
import Day3_OOP2.dataAccess.HibernateProductDao;
import Day3_OOP2.dataAccess.JdbcProductDao;
import Day3_OOP2.dataAccess.ProductDao;
import Day3_OOP2.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        Product product1 = new Product(1,"iphone 14 pro max",48000);

        List<Logger> loggers = new ArrayList<>();
        loggers.add(new DatabaseLogger());
        loggers.add(new FileLogger());
        loggers.add(new MailLogger());

        ProductManager productManager = new ProductManager(new HibernateProductDao(),loggers);
        productManager.add(product1);



    }
}
