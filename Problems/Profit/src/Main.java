import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        double M = scanner.nextDouble();
        double P = scanner.nextDouble();
        double K = scanner.nextDouble();
        int counter = 0;

        while (M < K){
            M = M + M * P/100;
            counter++;

        }
        System.out.println(counter);
    }
}