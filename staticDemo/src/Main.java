import DTO.Product;

public class Main {

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product = new Product();
        product.setPrice(15);
        product.setName("lol");
        productManager.add(product);
        Product product2_to_fail = new Product();
        productManager.add(product2_to_fail);
    }
}
