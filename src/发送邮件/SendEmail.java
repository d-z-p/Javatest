package 发送邮件;

public class SendEmail implements Runnable {
    private static Integer count = 100;

    @Override
    public void run() {
        while (count > 99) {
            cal();
        }
    }

    private  void cal() {
        try {
            Thread.sleep(20);
        } catch (Exception e) {

        }
        count--;
        System.out.println(Thread.currentThread().getName() + "," + count);
    }


    public static void main(String[] args) {
        SendEmail threadCount = new SendEmail();
        Thread thread1 = new Thread(threadCount);
        Thread thread2 = new Thread(threadCount);
        thread1.start();
        thread2.start();
    }
}
