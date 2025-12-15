import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = 1;
        double sum = 0;
        System.out.print("Enter no.of bikers:");
        int n = sc.nextInt();
        double[] speed = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter speed of Biker %d:", m);
            speed[i] = sc.nextDouble();
            m++;
            sum += speed[i];
        }
        double avg = sum /n;
        System.out.println("average speed :" + avg);
        for (int j = 0; j < 5; j++) {
            if (speed[j] > avg) {
                System.out.println("Biker " + (j + 1) + " is qualified with speed:" + speed[j]);
            }
        }
    }
}
