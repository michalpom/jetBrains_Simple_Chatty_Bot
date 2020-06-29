import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int bridges = scanner.nextInt();

        for (int i = 0; i <bridges; i++){
            int bridge =scanner.nextInt();
            if (bridge<=height){
                System.out.println("Will crash on bridge " + (i+1));
                break;
            }

            if (i==bridges-1){
                System.out.println("Will not crash");
                break;
            }

        }
    }
}