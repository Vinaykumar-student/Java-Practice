import java.time.LocalTime;

public class Time implements Runnable{
    public void run(){
        while (true){
            LocalTime time=LocalTime.now();
            int hour=time.getHour();
            int min=time.getMinute();
            int sec=time.getSecond();
            synchronized (System.out) {
                System.out.printf("\r%02d:%02d:%02d", hour, min, sec);
                System.out.flush();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupted !");;
            }

        }
    }
}
