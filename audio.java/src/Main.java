import javax.sound.sampled.*;
import javax.swing.plaf.TableHeaderUI;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
     String filepath="C:\\Users\\USER\\Downloads\\suvvi.wav";
        File file=new File(filepath);
        Scanner scanner=new Scanner(System.in);
       try( AudioInputStream audio= AudioSystem.getAudioInputStream(file)){
           Lyrics lyrics=new Lyrics();
           Thread thread=new Thread(lyrics);
           String res="";
           System.out.println("P = Play");
           System.out.println("S = Stop");
           System.out.println("R = Reset");
           System.out.println("Q = Quit");
           Clip clip=AudioSystem.getClip();
           clip.open(audio);
           while (!res.equals("Q")){
               System.out.print("Please Enter Your Choice:");
               res=scanner.next().toUpperCase();
               clip.loop(clip.LOOP_CONTINUOUSLY);
               switch (res){
                   case "P" ->{
                       clip.start();
                       if(thread.isAlive()) {
                           thread.start();
                       }
                   }
                   case "S" -> {
                       clip.stop();
                       if (thread.isAlive()){
                           thread.interrupt();
                       }
                   }
                   case "R" -> clip.setMicrosecondPosition(0);
                   case "Q" -> clip.close();
                   default -> System.out.println("Invalid Input");
               }
           }
       }
       catch (LineUnavailableException e){
           System.out.println("File Error");
       }
       catch (UnsupportedAudioFileException e){
           System.out.println("File Not Supported");
       }
       catch (IOException e){
           System.out.println("Something Went Wrong");
       }
       finally {
           System.out.println("Thank you");
       }

    }
}
