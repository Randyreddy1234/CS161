public class Multiples_hidden {
    public static void main(String [] args){
        int i = 0;

        while(i <= 100){
            if(i % 5 == 0 && i % 7 == 0){
                System.out.println(i + " is a multiple of 5 and 7");
            }
            else if(i % 5 == 0 || i % 7 == 0){
                System.out.println(i + " is a multiple of 5 or 7");
            }
            i++;
        }
    }
}
