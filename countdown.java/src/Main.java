import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Seconds To Countdown Starts From:");
        int res=scanner.nextInt();
        Timer timer=new Timer();
        TimerTask task=new TimerTask() {
            int count=res;
            @Override
            public void run() {
                System.out.println(count);
                count--;
                if (count<0){
                    System.out.println("Happy Birthday");
                    timer.cancel();
                }

            }
        };
        timer.schedule(task,0,1);


    }
}
