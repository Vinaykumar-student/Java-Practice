import java.io.*;
import java.util.Scanner;

public class Lyrics implements Runnable{
    @Override
    public void run(){
        String filepath="C:\\Users\\USER\\Desktop\\suvvi.txt";
        try{
            File file=new File(filepath);
            Scanner sc=new Scanner(file);
            Thread.sleep(30000);
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println(data);
                Thread.sleep(2900);
            }
        }catch (FileNotFoundException e){
            System.out.println("File Not Found!");
        }
        catch (InterruptedException e){
            System.out.println("Thread is interputed");
        }
    }
}
