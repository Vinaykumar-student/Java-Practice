import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(arr));
        System.out.print("enter element to be searched =");
        Scanner innerscan = new Scanner(System.in);
        int ele = innerscan.nextInt();
        boolean found=false;
        for (int i = 0; i <arr.length;i++) {
            if (arr[i] == ele) {
                System.out.println("element found=" + ele + "\t at location \t" + i);
                found=true;
                break;
            }
        }
        if(!found)
            System.out.println("element not found");

    }
}