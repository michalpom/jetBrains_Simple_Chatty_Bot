import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.next();

        String aa= string.replace('a', 'b');

        System.out.println(aa);
    }
}