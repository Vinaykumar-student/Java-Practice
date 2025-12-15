import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        HashMap<String,Integer> map=new HashMap<>();
        System.out.println("Enter 'Q' To Quit");
        System.out.println("Enter Any thing to continue Entry");
        String res="";
        System.out.println("Enter Key & Value");
        while (!res.equals("Q")){
            String name;
            int roll;
            System.out.print("Enter Name of the Student: ");
            name=scanner.nextLine();
            System.out.print("Enter Student Rollno: ");
            roll=scanner.nextInt();
            scanner.nextLine();
            map.put(name,roll);
            System.out.print(" Are want to continue Student Entry: ");
            res=scanner.nextLine().toUpperCase();
        }
        for(Map.Entry<String,Integer> entry:map.entrySet() ){
            System.out.println("Name :"+entry.getKey()+"  Roll :"+entry.getValue());
        }

        scanner.close();
    }
}
