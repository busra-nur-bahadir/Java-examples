public class Customer implements  IEntity{
    private String _name;
    private String _email;

    public void set_name(String name) {
        _name = name;
    }

    public String get_name() {
        return _name;
    }

    public void set_email(String email) {
        _email = email;
    }
    public String get_email(){
        return _email;
    }
}
