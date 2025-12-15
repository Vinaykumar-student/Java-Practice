import java.io.*;

public class Main {
   public static void main(String[] args) throws FileNotFoundException {
       String filepath="C:\\Users\\USER\\Desktop\\poem.txt";
       FileReader reader=new FileReader(filepath);
      try( BufferedReader reader1=new BufferedReader(reader)){
          String line;
          while ((line=reader1.readLine())!=null){
              System.out.println(line);
          }
      }
      catch (FileNotFoundException e){
          System.out.println("File not Found ");
      }
      catch (IOException e){
          System.out.println("Something Went Wrong");
      }

   }
}
