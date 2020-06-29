import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        //int flag = scanner.nextInt();
        while (true){
            int element = scanner.nextInt();
            if (element > max){
                max = element;
            }
            if (element == 0){
                break;
            }
        }
        System.out.println(max);
    }
}