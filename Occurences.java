import java.util.*;
public class Occurences {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        String [] words = {"smile","sand","SMILE","SmIlE","sand","smile","SmilE"};
        String word = new String(sc.nextLine());
        int same = 0, sim = 0;

        for(int i = 0; i < words.length; i++){
            if(word.equals(words[i])){
                same++;
            }
            else if(word.equalsIgnoreCase(words[i])){
                sim++;
            }
        }

        System.out.println("Same String: " + same);
        System.out.println("Similar String: " + sim);
    }
}
