import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[4];
        for(int i =0; i<4; i++){
            array[i]=scanner.nextInt()-1;
        }
        //System.out.println(Arrays.toString(array));
        for(int i = 0; i<4; i++){
            System.out.print(array[i]);
            System.out.print(" ");
        }
    }
}