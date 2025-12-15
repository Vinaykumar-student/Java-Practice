import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String name;
        Myrunnable myrunnable =new Myrunnable();
        Thread thread=new Thread(myrunnable);
        thread.setDaemon(true);
        thread.start();
        thread.join();
        Scanner inscan=new Scanner(System.in);
        System.out.printf("You Have %d Seconds to Enter Your Name \n", myrunnable.getsec());
        System.out.print("Enter Your  Name: ");
        name=inscan.nextLine();
        System.out.println("Hello "+name);
        inscan.close();


    }
}
