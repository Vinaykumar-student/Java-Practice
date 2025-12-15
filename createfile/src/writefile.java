import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class writefile {

    String filepath="C:\\Users\\USER\\Desktop\\sample.txt";
    String poem= """
            roses are red 
            violets are blue
            ****************
            """;
    writefile(){
        try(FileWriter writer=new FileWriter(filepath)){
            writer.write(poem);
            System.out.println("Text Written");

        }
        catch(FileNotFoundException e) {
            System.out.println("File Not Found");
        }
        catch (IOException e){
            System.out.println("Something went Wrong");
        }

    }
}
