import java.util.Scanner;
import java.math.*;
public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number(Base):");
        int base=scanner.nextInt();
        System.out.println("Enter a Number(Power):");
        int pow=scanner.nextInt();
        int c=base**pow;
        System.out.println();
    }
}
