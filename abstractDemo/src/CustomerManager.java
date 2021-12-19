public class CustomerManager {
    private DBManager databaseConnection;
    public CustomerManager(DBManager dbManager){
        this.databaseConnection = dbManager;
    }
    public void addCustomer(){
        databaseConnection.add();
    }
}
