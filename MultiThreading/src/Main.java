public class Main {

    public static void main(String[] args) {
        CountDown countDown1 = new CountDown("1");
        CountDown countDown2 = new CountDown("2");
        CountDown countDown3 = new CountDown("3");
        CountDown countDown4 = new CountDown("4");
        countDown1.start();
        countDown2.start();
        countDown3.start();
        countDown4.start();
    }
}
