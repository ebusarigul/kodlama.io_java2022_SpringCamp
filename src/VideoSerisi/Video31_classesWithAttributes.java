package VideoSerisi;

public class Video31_classesWithAttributes {
    public static void main(String[] args) {


        Video31_Product product = new Video31_Product(1,"Laptop","Macbook Pro",30000,534,"Uzay Grisi");
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("MacBook Pro");
        product.setPrice(30000);
        product.setStockAmount(561);
        product.setRenk("Purple");


        Video31_ProductManager productManager = new Video31_ProductManager();
        productManager.Add(product);

        System.out.println("product.getKod() = " + product.getKod());

    }
}
