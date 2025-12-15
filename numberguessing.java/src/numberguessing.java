
import java.util.Random;

import java.util.Scanner;

import static java.lang.System.exit;
public class numberguessing {
    public static void main(String[] args){
        System.out.println("\t\t\t\tWELCOME TO NUMBER GUESSING GAME");
        int guess=0;
        int att=0;
        Random random=new Random();
        Scanner inscan=new Scanner(System.in);
        System.out.print("Enter a random number between 1-10: ");
        int rname=random.nextInt(1,11);
       do{
            guess=inscan.nextInt();
            att++;
            if(guess<rname) {
                System.out.println("Too Low");
            }
            else if (guess>rname) {
                System.out.println("Too High");
            }
            else{
                System.out.println("Correct :"+rname);
                System.out.println("Attpemts taken:"+att);
                exit(0);
            }
            System.out.println("INCORRECT...TRY AGAIN:");

        } while(guess!=rname);
        System.out.println(rname);
        inscan.close();
    }
}
