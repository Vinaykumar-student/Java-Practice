import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner inscan=new Scanner(System.in);
        System.out.print("Enter your Name:");
        String n=inscan.nextLine();
        System.out.print("Enter your Age:");
        int a=inscan.nextInt();
        inscan.nextLine();
        System.out.print("Enter your Rollno:");
        String r=inscan.nextLine();
        student stu=new student(n,a,r);


    }
}
