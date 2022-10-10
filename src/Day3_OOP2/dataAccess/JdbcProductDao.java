package Day3_OOP2.dataAccess;

import Day3_OOP2.entities.Product;

public class JdbcProductDao implements ProductDao{

    public void add(Product product){
        //sadece DB erisim kodları buraya yazılır... SQL
        System.out.println("JDBC ile DB ye eklendi");
    }
}

