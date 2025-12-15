import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Readfile {
    String filepath="C:\\Users\\USER\\Desktop\\sample.txt";
    Readfile(){
        try(BufferedReader read=new BufferedReader(new FileReader(filepath))){
            String line;
            while ((line=read.readLine())!=null){
                System.out.println(line);
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File Not Found");
        }
        catch (IOException e){
            System.out.println("Something went Wrong");
        }
    }

}
