public class CountDown implements Runnable {
    private Thread _thread;
    private String _thread_name;
    public CountDown(String thread_name){
        _thread_name = thread_name;
        System.out.println("thread is being created...");
    }
    @Override
    public void run() {
        System.out.println("Thread:" + _thread_name+ ", is running..");
        try {
            for (int i = 10; i >= 0; i--) {
            System.out.println("Thread: " + _thread_name + ", Count: " + i);
            }
            _thread.sleep(10000);
        }catch(InterruptedException e){
            System.out.println(" ERROR at " + _thread_name + e.getMessage());
        }
    }

    public void start(){
        if(_thread == null){
            _thread = new Thread(this, _thread_name);
            _thread.start();
        }
        System.out.println("Thread " + _thread_name + "has been started");
    }
}
