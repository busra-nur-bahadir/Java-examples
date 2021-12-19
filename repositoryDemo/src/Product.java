public class Product implements  IEntity{
    private int _id;
    private double _price;

    public void set_id(int id) {
        _id = id;
    }

    public int get_id() {
        return _id;
    }

    public void set_price(double price) {
        _price = price;
    }

    public double get_price() {
        return _price;
    }
}
