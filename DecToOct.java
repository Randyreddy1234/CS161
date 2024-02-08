import java.util.*;
public class DecToOct {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int dec = sc.nextInt(), octD = 0;
        String oct = new String("");

        while(dec != 0){
            octD = dec % 8;
            oct = octD + "" + oct;
            dec /= 8;
        }
        System.out.println(oct);
    }
}
