public class CustomerManager {
    private BaseLogger logger;
    public CustomerManager(BaseLogger logger){
        this.logger = logger;
    }
    public void Add(){
        System.out.println("Added");
        logger.Log("this is a log");
    }
}
