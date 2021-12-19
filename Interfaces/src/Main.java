public class Main {

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new OracleDAL());
        customerManager.add();
        customerManager.setCustomerDAL(new MySqlDAL());
        customerManager.add();
    }
}
