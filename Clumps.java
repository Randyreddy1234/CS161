import java.util.*;
public class Clumps {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt(), clumpSize = 1, max = 0, j = 0;
        int [] arr = new int[size];

        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 1; i < size; i++){
            if(arr[j] == arr[i]){
                clumpSize++;
            }else if(arr[j] != arr[i]){
                if(clumpSize > max){
                    max = clumpSize;
                }
                clumpSize = 1;
            }
            j++;
        }
        System.out.println("Biggest Clump Size: " + max);
    }
}
