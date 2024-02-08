public class BreakNums {
    public static void main(String [] args){
        for(int i = 100; i <= 999; i++){
            if(i % 47 == 0){
                System.out.println(i);
                System.out.println(i / 100);
                System.out.println((i / 10) % 10);
                System.out.println(i % 10);
                System.out.println("**********");
            }
        }
    }
}
