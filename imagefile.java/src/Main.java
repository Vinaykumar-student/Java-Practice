import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String filepath = "C:\\Users\\USER\\Desktop\\25985A0598\\25985A0598.jpeg";

        try (FileInputStream read = new FileInputStream(filepath)) {
            byte[] data = read.readAllBytes();  // get all file bytes
            System.out.println("File size: " + data.length + " bytes");
        } catch (IOException e) {
            System.out.println("Something Went Wrong: " + e.getMessage());
        }
    }
}
