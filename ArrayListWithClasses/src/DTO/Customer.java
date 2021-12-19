package DTO;

public class Customer {
    private int _id;
    private String _first_name;
    private String _last_name;

    public Customer(int id,String first_name, String last_name){
        _id = id;
        _first_name = first_name;
        _last_name = last_name;
    }
    public void set_id(int id){
        _id = id;
    }
    public int get_id(){
        return _id;
    }
    public void set_first_name(String first_name){
        _first_name = first_name;
    }
    public String get_first_name(){
        return _first_name;
    }
    public void set_last_name(String last_name){
        _last_name = last_name;
    }
    public String get_last_name(){
        return _last_name;
    }
    @Override
    public String toString(){
       return  _id +", " + _first_name + ", " + _last_name;
    }
}
