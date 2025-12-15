import java.io.File;
import java.io.IOException;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) throws IOException {
        String filepath="C:\\Users\\USER\\Desktop\\sample.txt";
        File file=new File(filepath);
        if(!file.exists()){
            file.createNewFile();
            System.out.println("File Successfully Created");
        }
        else{
            System.out.println("File Already Exits");
        }
        writefile writefile=new writefile();
        Readfile readfile=new Readfile();




    }
}
