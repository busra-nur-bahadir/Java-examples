import DTO.Product;
import Interfaces.IProductManager;

public class ProductManager implements IProductManager {

    public void add(Product product) {
       if(ProductValidator.validate(product)){
           System.out.println("Added");
       }
       else{
           System.out.println("Sorry :(");
       }
    }
}
