import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        city.replace(" ", "");
        System.out.println(city.endsWith("burg"));


    }
}