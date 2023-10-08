import java.util.Timer;
import java.util.TimerTask;

public class AsynchronousIO implements Runnable {
    private final static int SLEEP_DELAY = 5000;
    private final static int REPEAT_DELAY = 10000;

    @Override
    public void run() {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Асинхронный привет!");
                try {
                    Thread.sleep(SLEEP_DELAY);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Асинхронный пока!");
            }
        }, 0, REPEAT_DELAY);
    }
}
