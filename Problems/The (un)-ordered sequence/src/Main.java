import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        boolean flag = false;
        int k = 0;
        do{
            numbers.add(scanner.nextInt());

            if(numbers.get(k)==0){
                break;
            }
            k++;
        }while(true);

        numbers.remove(numbers.size()-1);

        for (int i = 0 ; i<numbers.size()-1; i++){
            if (numbers.get(i) >= numbers.get(i+1)){
                flag = true;
            }else {
                flag=false;
                break;
            }
            //System.out.println("iteration A " + i + "flag " + flag);

        }
        if (flag == false){
            for (int i = 0 ; i<numbers.size()-1; i++){
                if (numbers.get(i) <= numbers.get(i+1)){
                    flag = true;
                }else {
                    flag=false;
                    break;
                }
                //System.out.println("iteration B " + i + "flag " + flag);
            }}

        //for (int i = 0 ; i<numbers.size(); i++){
        //    System.out.println(numbers.get(i));
        //}
        if(numbers.size()==1){
            flag = true;
        }
        System.out.println(flag);

    }
}