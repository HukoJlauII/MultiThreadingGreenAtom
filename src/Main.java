public class Main {
    private final static int SLEEP_DELAY = 1000;

    public static void main(String[] args) throws InterruptedException {
        AsynchronousIO asynchronousIO = new AsynchronousIO();
        asynchronousIO.run();
        while (true) {
            System.out.println("Работает основная программа");
            Thread.sleep(SLEEP_DELAY);
        }

    }


}