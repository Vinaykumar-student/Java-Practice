
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("\t\t\t\t\tWelcome To simple interest calculator");
        Scanner simple=new Scanner(System.in);
        System.out.print("Enter Principal :");
        long sip =simple.nextLong();
        System.out.print("Rate of interest :");
        float inte =simple.nextFloat();
        System.out.print("Enter time :");
        float time =simple.nextFloat();
        double cal=(sip*inte*time)/100;
        System.out.println("Simple interest ="+cal);
        double total=cal+sip;
        System.out.println("Total ="+total);
        simple.close();
        }
    }
