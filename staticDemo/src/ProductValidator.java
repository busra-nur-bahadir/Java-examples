import DTO.Product;

public class ProductValidator {
    static {
        System.out.println("This is static code block");
    }
    public static boolean validate(Product product){
        if(product.getName() != null && !product.getName().isEmpty() && product.getPrice()>0){
            return true;
        }
        else{
            return false;
        }
    }
    public void something(){

    }
    //INNER CLASS
    public static class InnerClass{
        public static void something(){}
    }
}
