package Day2_OOP1;

public class Main {
    public static void main(String[] args) {
        String mesaj = "vade oranı";

        Product product = new Product();
        product.setName("Delonghi Kahve Makinesi");
        product.setDiscount(7);
        product.setUnitPrice(7500);
        product.setUnitsInStocks(3);
        product.setImageUrl("image1.jpeg");

        Product product1 = new Product();
        product1.setName("Starbucks Kahve Makinesi");
        product1.setDiscount(8);
        product1.setUnitPrice(6500);
        product1.setUnitsInStocks(4);
        product1.setImageUrl("image2.jpeg");


        Product product2 = new Product();
        product2.setName("Tchibo Kahve Makinesi");
        product2.setDiscount(6);
        product2.setUnitPrice(6899);
        product2.setUnitsInStocks(25);
        product2.setImageUrl("image3.jpeg");


        Product[] products = {product,product1,product2};

        for (Product p : products){
            System.out.println(p.getName());
        }

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("0531561651");
        individualCustomer.setCustomerNumber("12348");

        individualCustomer.setFirstName("Ebubekir");
        individualCustomer.setLastName("Sarigul");
        //------------------------------------------------------------
        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setPhone("022461651");
        corporateCustomer.setCustomerNumber("21313");

        corporateCustomer.setCompanyName("SarigulOto");
        corporateCustomer.setTaxNumber("51651");

        Customer[] customers = {individualCustomer,corporateCustomer};

        for (Customer customer : customers){
            System.out.println(customer.getId());
        }


    }
}
