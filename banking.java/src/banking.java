import javax.swing.*;
import java.util.Scanner;

import static java.lang.System.exit;

public class banking {
    static Scanner inscan = new Scanner(System.in);
    static String p = "0907";
    static int bal = 1000;

    public static void main(String[] args) {
        System.out.println("\t\t\tWelcome To Banking System");
        System.out.print("PLEASE ENTER YOUR NAME : ");
        String name = inscan.nextLine();
        System.out.printf("Hello %s Please Enter Pin:", name);
        String pin = inscan.nextLine();
        if (pin.equals(p)) {
            for (int i=0;i<50;i++){
                System.out.println("Enter 1 for Checkblance:");
                System.out.println("Enter 2 for Deposit:");
                System.out.println("Enter 3 for Withdraw:");
                System.out.println("Enter 4 for Exit");
                int ch = inscan.nextByte();
                switch (ch) {
                    case 1:
                        checkblance();
                        break;
                    case 2:
                        deposit();
                        break;
                    case 3:
                        withdraw();
                        break;
                    case 4:
                        exit(0);
                        break;
                    default:
                        System.out.println("Enter correct choice :");

                }

            }
        }
        else
            System.out.println("Incorrect Pin Try Again");
        inscan.close();

    }

    static void checkblance() {
        System.out.printf("Your Avaliable Balance is %d\n", bal);
    }

    static void deposit() {

        System.out.print("Enter amount To Be Deposited:");
        int ba=inscan.nextInt();
        inscan.nextLine();
        System.out.print("Please Enter your Pin:");
        String pi=inscan.nextLine();
        if(pi.equals(p)){
            bal+=ba;
            System.out.println("Money added successfully");
            System.out.println("Avaliavble Balance is "+bal);
        }
        else
            System.out.println("Incorrect Pin");
    }
    static void withdraw(){
        System.out.print("Enter amount to be Withdrawed:");
        int wi=inscan.nextInt();
        inscan.nextLine();
        if(wi<bal){
            System.out.print("Enter your pin:");
            String pp=inscan.nextLine();
            if(pp.equals(p)){
                bal-=wi;
                System.out.println("Money withdrawed Successfully");
                System.out.println("Avaliable Balance:"+bal);
            }
            else
                System.out.println("Incorrect Pin");
        }
        else
            System.out.println("Insuffient funds");
    }

}
