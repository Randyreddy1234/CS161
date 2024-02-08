import java.util.*;
public class SmallerNumbers {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        String list = new String(sc.nextLine());
        int [] num = new int[10];
        int i = 9;
        int count = 0;

        for(int j = list.length() - 1; j >= 0; j--){
            if(list.charAt(j) == ' '){
                num[i] = Integer.parseInt(list.substring(j+1));
                list = list.substring(0,j);
                i--;
            }
        }

        num[0] = Integer.parseInt(list);

        for(int r = 0; r < 9; r++){
            if(num[r] > num[r+1]){
                count++;
            }
        }

        System.out.println("A smaller number was enetered after a large number " + count + " times.");
    }
}
