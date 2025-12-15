import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String filepath1="C:\\Users\\USER\\Downloads\\suvvi.wav";
        File file=new File(filepath1);
        String res="";
        Scanner scanner=new Scanner(System.in);
        try(AudioInputStream inputStream= AudioSystem.getAudioInputStream(file)){
            Clip clip=AudioSystem.getClip();
            clip.open(inputStream);
            System.out.print("Enter Q To Quit !:");
            while(!res.equals("Q")){
                clip.start();
                res=scanner.nextLine().toUpperCase();

            }
            clip.stop();
            clip.close();

        }
        catch (UnsupportedAudioFileException e){
            System.out.println("File Not Supported !");
        }
        catch (LineUnavailableException e){
            System.out.println("Line Not Supported !");
        }
        catch (IOException e){
            System.out.println("Something Went Wrong !");
        }
    }
}
