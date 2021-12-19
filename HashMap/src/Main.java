import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String, String> dictionary = new HashMap<String, String>();
        dictionary.put("love", "爱");
        dictionary.put("eat", "吃");
        dictionary.put("drink", "喝");
        for (String key : dictionary.keySet()) {
            System.out.println(key + " " + dictionary.get(key));
        }
    }
}
