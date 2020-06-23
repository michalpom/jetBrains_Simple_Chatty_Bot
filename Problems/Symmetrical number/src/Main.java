import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numberStr = scanner.next();

        String reversed = new StringBuilder(numberStr).reverse().toString();

        if (numberStr.equals(reversed)){
            System.out.println("1");
        }else{
            System.out.println("41");
        }


    }
}