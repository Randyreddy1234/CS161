public class Sigma {
    public static void main(String [] args){
        int num = 20, sum = 0, i = num;

        while(i >= 1){
            sum += i;
            i--;
        }
        System.out.println("The sigma of " + num + " is " + sum);
    }
}
