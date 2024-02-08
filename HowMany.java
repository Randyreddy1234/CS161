public class HowMany {
    public static void main(String [] args){
        int num = 40, HowMany = 0;

        while(num >= 2){
            num /= 2;
            HowMany += 1;
        }
        System.out.println(HowMany);
    }
}
