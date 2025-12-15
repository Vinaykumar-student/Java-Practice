import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println("\t\t\t\t\t\t\t\t\t\tWELCOME TO VK FASHIONS");
        System.out.println("1.MENS WEAR");
        System.out.println("2.WOMENS WEAR");
        System.out.println("3.KIDS WEAR");
        System.out.println("4.EXIT");
        Scanner shop=new Scanner(System.in);
        System.out.print("Enter Your Choice: ");
        int ch=shop.nextInt();
        if(ch==1){
            System.out.println("\t\t\t//Mens Wear\\\\");
            System.out.println("1.FORMAL WEAR");
            System.out.println("2.CASUAL WEAR");
            System.out.print("Enter your choice: ");
            int inch=shop.nextByte();
            if (inch==1){
                System.out.println("\t\tFormal Wear");
                System.out.println("avaliable Suits:");
                System.out.println("black suit:size L;price ₹999 suit:size M");
                System.out.print("Enter your choice: ");
                String m=shop.nextLine();
            }

        }
    }
 }
