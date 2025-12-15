import java.util.Scanner;

public class Myrunnable implements Runnable{
    private int sec;
    @Override
    public void run(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Seconds for Timer: ");
        sec=scanner.nextInt();
        scanner.nextLine();
        for (int i=0;i<=sec;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupted !");
            }
            if(i==sec){
                System.out.println("Time's Up !");
                System.exit(0);
            }

        }

    }
    public int getsec(){
        return sec;
    }

}
