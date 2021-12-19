import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList array = new ArrayList();
        for (int i = 0; i < 10; ++i) {
            array.add(i);
        }
        for (char i = 'a'; i < 'h'; ++i) {
            array.add(i);
        }

        for (Object e : array) {
            System.out.println(e);
        }
        array.remove(10);
        for (Object e : array) {
            System.out.println(e);
        }

        ArrayList<String> cities = new ArrayList<String>();
        cities.add("İstanbul");
        cities.add("Ankara");
        cities.add("İzmir");

        Collections.sort(cities);
        System.out.println(cities.toString());
        cities.remove("Ankara");
        System.out.println(cities.toString());

        int [][] trying  = new int[3][4];
        for(int i = 0 ; i <3;++i){
            for(int j = 0;j<4;++j){
                trying[i][j] = i+j;
            }
        }
        System.out.println(Arrays.deepToString(trying));


    }
}
