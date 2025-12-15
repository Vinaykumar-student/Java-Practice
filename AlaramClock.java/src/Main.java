import java.io.File;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.Timer;

public class Main {
    public static void main(String[] args)  {
        String filepath="C:\\Users\\USER\\Downloads\\suvvi.wav";
        File file=new File(filepath);
        Scanner scanner=new Scanner(System.in);
        Time tim=new Time();
        Thread thread1=new Thread(tim);
        LocalTime time=LocalTime.now();
        thread1.start();

        try {
            DateTimeFormatter formatter=DateTimeFormatter.ofPattern("HH:mm:ss");
            System.out.print("\nSet Alaram Time(HH:MM:SS):");
            String input=scanner.nextLine();
            time=LocalTime.parse(input,formatter);
            System.out.println("Alaram Clock is Set For "+time);
        }
        catch (DateTimeParseException e){
            System.out.println("Invalid Time Input");
        }
        Alaramclock alaramclock=new Alaramclock(time,file,scanner);
        Thread thread=new Thread(alaramclock);
        thread.start();

    }
}
