import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();

        boolean value=false;

        if(one > 0 && two <= 0 && three <= 0){
            value=true;
        }
        if(one <= 0 && two > 0 && three <= 0){
            value=true;
        }
        if(one <= 0 && two <= 0 && three > 0){
            value=true;
        }

        System.out.println(value);

    }
}