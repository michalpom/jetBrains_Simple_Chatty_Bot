import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String clean1 = (first.replace(" ", "")).trim();
        String second = scanner.nextLine();
        String clean2 =(second.replace(" ", "")).trim();


        System.out.println(clean1.equals(clean2));
    }
}