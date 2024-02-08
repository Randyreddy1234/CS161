public class Summing {
    public static void main(String [] args){
        int div = 0;
        int sum = 0;

        for(int i = 0; i <= 100; i++){
            if(i % 13 == 0){
                div += i;
            }
            sum += i*i;
        }
        System.out.println("The sum of all numbers divisible by 13 is " + div);
        System.out.println("The sum of all sqaures is " + sum);
    }
}
