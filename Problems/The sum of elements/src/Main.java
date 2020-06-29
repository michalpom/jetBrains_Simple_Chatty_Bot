import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        //int flag = scanner.nextInt();
        while (true){
            int element = scanner.nextInt();
            sum = sum + element ;
            if (element == 0){
                break;
            }
        }
        System.out.println(sum);
    }
}