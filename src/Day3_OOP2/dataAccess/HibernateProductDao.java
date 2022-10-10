package Day3_OOP2.dataAccess;

import Day3_OOP2.entities.Product;

public class HibernateProductDao implements ProductDao{

    public void add(Product product){
        //sadece DB erisim kodları buraya yazılır... SQL
        System.out.println("Hibernate ile DB ye eklendi");
    }
}
