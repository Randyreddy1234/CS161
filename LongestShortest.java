import java.util.*;
public class LongestShortest {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine()), longest = 0,
                longStr = 0, shortStr = 0, shortest = 0;
        String [] arr = new String[size];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextLine();
        }

        shortest = arr[0].length();

        for(int i = 0; i < arr.length; i++){
            if(arr[i].length() > longest){
                longest = arr[i].length();
                longStr = i;
            }
            else if(arr[i].length() <= shortest){
                shortest = arr[i].length();
                shortStr = i;
            }
        }
        System.out.println("Longest String: " + arr[longStr]);
        System.out.println("Longest position: " + longStr);
        System.out.println("Shortest String: " + arr[shortStr]);
        System.out.println("Shortest position: " + shortStr);

        for(int i = 0; i < arr.length; i++){
            System.out.println(i + " " + arr[i]);
        }
    }
}
