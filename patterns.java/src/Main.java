import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no.of rows:");
        a=sc.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
