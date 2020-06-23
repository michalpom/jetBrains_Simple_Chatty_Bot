import java.awt.*;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int ready = 0;
        int toFix = 0;
        int reject = 0;

        for(int i = 0; i<n; i++){
            int part = scanner.nextInt();
            if (part == 1){
                toFix = toFix + 1;
            }
            if (part == -1){
                reject = reject + 1;
            }
            if (part == 0){
                ready = ready + 1;
            }
        }

        System.out.println(ready + " "+ toFix + " "+ reject);
    }
}