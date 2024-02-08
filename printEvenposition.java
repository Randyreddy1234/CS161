import java.util.*;
public class printEvenposition {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        String word = new String(sc.nextLine());
        String  newWord = new String("");

        newWord = newWord + word.charAt(0);

        for(int i = 1; i < word.length(); i++){
            if(i % 2 == 0){
                newWord = newWord + word.charAt(i);
            }
        }
        System.out.println(newWord);
    }
}
