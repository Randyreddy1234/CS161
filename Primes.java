public class Primes {
    public static void main(String [] args){
        int num = 6, i = 1, count = 0;

        do{
            if(num % i == 0){
                count++;
                i++;
            }
            i++;
        }while(i <= num);

        if(count == 2){
            System.out.println(num + " is a prime number");
        }
        else{
            System.out.println(num + " is NOT a prime number");
        }
    }
}
