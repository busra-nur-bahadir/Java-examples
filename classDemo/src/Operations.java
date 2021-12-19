public class Operations {
    public int add(int... num) {
        int res = 0;
        for (int e : num) {
            res += e;
        }
        return res;
    }
}
