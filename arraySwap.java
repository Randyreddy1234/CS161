import java.util.*;
public class arraySwap {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        int copy = 0;

        for(int i = 0; i < 5; i++){
            arr[i] = sc.nextInt();
        }

        for(int j = 0; j < 5; j++){
            System.out.print(arr[j] + " ");
        }

        System.out.println("");

        copy = arr[4];
        arr[4] = arr[0];
        arr[0] = copy;

        for(int j = 0; j < 5; j++){
            System.out.print(arr[j] + " ");
        }
    }
}
