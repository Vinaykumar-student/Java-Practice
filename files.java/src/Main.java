import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args)  {
        String filepath="C:\\Users\\USER\\Desktop\\poem.txt";
        String file= """
                Name   : P.Vinay Kumar
                reg no : 25985A0598
                course : CSE
                college: Raghu 
                """;
        try(FileWriter writer=new FileWriter(filepath)){
         writer.write(file);
            System.out.println("File created");
        }
        catch (FileNotFoundException e){
            System.out.println("File not Found");
        }
        catch (IOException e){
            System.out.println("Something went Wrong");
        }

    }
}
