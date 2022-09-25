package VideoSerisi;

public class Video31_classesWithAttributes {
    public static void main(String[] args) {


        Video31_product product = new Video31_product();
        product.name = "Laptop";
        product.id = 1;
        product.description = "MacBook Pro";
        product.price = 30000;
        product.stockAmount = 561;

        Video31_ProductManager productManager = new Video31_ProductManager();
        productManager.Add(product);








    }
}
