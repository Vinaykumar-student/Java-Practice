import javax.sound.sampled.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

public class Alaramclock implements Runnable{
    LocalTime time;
    File file;
    Scanner scanner;

    Alaramclock(LocalTime time,File file,Scanner scanner){
        this.time=time;
        this.file=file;
        this.scanner=scanner;
    }

    @Override
    public void run(){
        if(LocalTime.now().isAfter(time)){
            System.out.println("Times Already passed !");
        }
       else {
            while (LocalTime.now().isBefore(time)){
                LocalTime now=LocalTime.now();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Thread Interrupted !");
                }
            }
            System.out.println("\n*Times Up*");
            audio();
            scanner.close();
            }
        }
        private void audio(){
           try( AudioInputStream inputStream= AudioSystem.getAudioInputStream(file)) {
               Clip clip=AudioSystem.getClip();
               clip.open(inputStream);
               clip.start();
               System.out.print("Press Enter # To Stop Alaram:");
               scanner.nextLine();
               clip.stop();
               clip.close();
           }
           catch (UnsupportedAudioFileException e){
               System.out.println("File Not Supported !");
           }
           catch (LineUnavailableException e){
               System.out.println("Line Unavaliable !");
           }
           catch (IOException e){
               System.out.println("Somrthing Went Wrong !");
           }
        }




    }
