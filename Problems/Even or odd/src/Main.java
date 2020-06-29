import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        while (true){
            int number = scanner.nextInt();
            if (number == 0){
                break;
            }

            if (number%2 == 0){
                System.out.println("even");
            }else {
                System.out.println("odd");
            }

        }

    }
}