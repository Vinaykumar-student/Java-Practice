import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String res;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a Day: ");
        res=scanner.nextLine().toUpperCase();
        try{
            Day day=Day.valueOf(res);
            switch (day){
                case MONDAY, TUESDAY, WEDNESDAY, THURSDAY,
                     FRIDAY -> System.out.println("Its a Weekday !");
                case SATURDAY,
                     SUNDAY -> System.out.println("Its a Weekend !");
            }

        }
        catch (IllegalArgumentException a){
            System.out.println("Invalid Day !");
        }



    }
}
