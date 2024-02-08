import java.util.*;
public class inputArray {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt(), longPos = 0, longest = 0;
        int [] arr = new int [size];
        String fives = new String("the indices of the fives are ");

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= longest){
                longPos = i;
                longest = arr[i];
            }

            if(arr[i] == 5){
                fives = fives + i + " ";
            }
        }
        System.out.println("a[" + longPos + "] = " + longest + " is the largest");
        System.out.println(fives);
    }
}
