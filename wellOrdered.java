import java.util.*;
public class wellOrdered {
    public static void main(String [] args){
        int num1 = 0, num2 = 0, num3 = 0;
        // num1 = left
        // num2 = middle
        // num3 = right

        for(int i = 100; i < 1000; i++){
            num1 = i / 100;
            num2 = (i/10) % 10;
            num3 = i % 10;

            if(num1 < num2 && num2 < num3 && num1 < num3){
                System.out.println(i);
            }
        }
    }
}
