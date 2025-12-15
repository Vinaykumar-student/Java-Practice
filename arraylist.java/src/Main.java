import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int num=0;
        ArrayList<Integer> prime=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter 10 numbers:");
        for(int i=0;i<10;i++) {
            num = scanner.nextInt();
            prime.add(num);
        }
        System.out.println(prime);



        scanner.close();
    }

}
