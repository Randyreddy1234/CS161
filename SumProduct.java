import java.util.*;
public class SumProduct {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt(), sum = 0, product = 1, largest = 0;
        int [] arr = new int [size];

        for(int i = 0; i < size;i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
            product *= arr[i];
            if(arr[i] > largest){
                largest = arr[i];
            }
        }

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Largest Number: " + largest);
    }
}
