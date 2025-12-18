import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float in, ne, wa;
        String rs=" ";
        System.out.print("Enter Initial Money:");
        in =sc.nextFloat();
        ne = in*40/100;
        wa = in*30/100;
        System.out.println("Ways to use Money wisely:");
        System.out.println("calculate Based on the Given Reference...");
        System.out.println("Needs   : 40% Of Monthly Allowance");
        System.out.println("Wants   : 30% Of Monthly Allowance");
        System.out.println("Savings : 30% Of Monthly Allowance");
        System.out.println("Monthly Allowance:"+in);
        System.out.println("Money should spend on Needs:"+ ne);
        System.out.println("Money should spend on Wants:"+ wa);
        System.out.println("Money should spend on Savings:"+ wa);
        System.out.println("Calculating Money Usage:");
        System.out.println("Enter N for Adding Debit to Needs:");
        System.out.println("Enter W for Adding Debit to Wants:");
        System.out.print("Enter Q to Exit:\n");
        while(!rs.equals("Q")){
            sc.nextLine();
            System.out.print("Enter Your Choice:");
            rs=sc.nextLine().toUpperCase();
            if(rs.equals("N")){
                System.out.print("Enter Spent Money on needs:");
                int sn=sc.nextInt();
                ne-=sn;
                System.out.println("Remaining Needs money:"+ne);
            }
            if(rs.equals("W")){
                System.out.print("Enter Spent Money on Wants:");
                int sw =sc.nextInt();
                wa-= sw;
                System.out.println("Remaining Needs money:"+wa);
            }
        }


       sc.close();
    }
}
