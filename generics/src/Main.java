public class Main {

    public static void main(String[] args) {
	// write your code here
        Product product = new Product();
        product.setId(1);
        product.setPrice(150);
        Customer customer = new Customer();
        customer.set_name("something");
        MyList<Product> list = new MyList<>();
        list.add(product);
        MyList<Customer> list2= new MyList<>();
        list2.add(customer);
    }
}
