import java.util.*;
public class DecToBin {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(), binaryD = 0;
        String binaryN = new String("");

        while(num != 0){
            binaryD = num % 2;
            binaryN = binaryD + "" + binaryN;
            num /= 2;
        }

        System.out.println(binaryN);
    }
}
