import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int n,m,res=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array Sizes N & M:");
        n=sc.nextInt();
        m=sc.nextInt();
        int[][] arr=new int[n][m];
        System.out.println("Enter array Elements:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Printing 2D matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.print("\n");
        }
        System.out.println("addition of diagnoal:");
        if(n==m){
            for(int i=0;i<n;i++){
                     res+=arr[i][i];
                 }

            System.out.println("Adding:"+res);
        }
        else{
            System.out.println("addition is not possible!");
        }
    }
}
