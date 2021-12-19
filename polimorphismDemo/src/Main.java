public class Main {

    public static void main(String[] args) {
	// write your code here
        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(),new DBLogger()};
        CustomerManager customerManager = new CustomerManager(new EmailLogger());
        customerManager.Add();
    }
}
