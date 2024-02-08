import java.util.*;
public class EvenArrays {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[10];
        int num = sc.nextInt(), i = 0, in = 0;
        boolean inB = true;

        if(num % 2 == 0){
            num += 2;
            while(i < 10){
                arr[i] = num;
                i++;
                num += 2;
            }
        }else{
            num += 1;
            while(i < 10){
                arr[i] = num;
                i++;
                num += 2;
            }
        }

        while(inB == true){
            in = sc.nextInt();

            if(in >= 0 && in < 10){
                System.out.println("Position " + in + ": " + arr[in]);
            }else if(in == -1){
                inB = false;
            }else{
                System.out.println("Position " + in + ": No such index!");
            }
        }
    }
}
