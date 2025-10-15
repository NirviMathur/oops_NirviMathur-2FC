public class BackgroundJobExecution {
    public static void main(String[] args) {

        System.out.println("Main thread started...");

        Runnable backgroundTask = () -> {
            try {
                System.out.println("Background job started...");
                Thread.sleep(3000);
                System.out.println("Background job completed successfully!");
            } catch (InterruptedException e) {
                System.out.println("Background job interrupted!");
            }
        };

        Thread jobThread = new Thread(backgroundTask);
        jobThread.start();

        System.out.println("Main thread continues executing other tasks...");

        try {
            jobThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted!");
        }

        System.out.println("All tasks completed.");
    }
}
