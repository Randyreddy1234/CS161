import java.util.Scanner;

public class tripleChar {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        String newWord = "";
        String word = sc.nextLine();

        for(int i = 0; i < word.length(); i++){
            for(int j = 0; j < 3; j++){
                newWord = newWord + word.charAt(i);
            }
        }

        System.out.println(newWord);
    }
}
