public class CustomerManager {
    private ICustomerDAL _customerDAL;
    public CustomerManager( ICustomerDAL customerDAL){
        _customerDAL = customerDAL;
    }
    public void add(){
        // add more business logic
        _customerDAL.add();
    }
    public void setCustomerDAL(ICustomerDAL customerDAL){
        _customerDAL = customerDAL;
    }
}
