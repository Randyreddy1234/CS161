import java.util.Scanner;

public class Methods {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        System.out.println(word.toUpperCase());
        System.out.println(word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase());
        System.out.println("The length is " + word.length());

        for(int i = 0; i < word.length(); i++){
            System.out.println(word.charAt(i));
        }
    }
}
