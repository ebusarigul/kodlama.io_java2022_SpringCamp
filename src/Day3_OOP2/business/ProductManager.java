package Day3_OOP2.business;

import Day3_OOP2.core.logging.Logger;
import Day3_OOP2.dataAccess.HibernateProductDao;
import Day3_OOP2.dataAccess.JdbcProductDao;
import Day3_OOP2.dataAccess.ProductDao;
import Day3_OOP2.entities.Product;

import java.util.List;

public class ProductManager {

    private ProductDao productDao;
    private List<Logger> loggers;

    public ProductManager(ProductDao productDao,List<Logger> loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception {
        // iş kuralları
        if (product.getUnitPrice()<10){
            throw new Exception("Ürün fiyatı 10 dan küçük olamaz");
        }

        productDao.add(product);

        for (Logger logger : loggers){   //[db,mail]
            logger.log(product.getName());
        }
    }

}
