import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        if ((A + B)> C && (A + C)> B && (C + B)> A){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}