import java.util.*;
public class StringManip {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String sen = new String(sc.nextLine()), rev = new String("");
        char letter;
        int t = 0;

        for(int i = 0; i < sen.length(); i++){
            if(sen.charAt(i) == ' '){

            }
            else{
                System.out.println(sen.charAt(i));
            }
        }

        for(int j = 0; j < sen.length(); j++){
            letter = sen.charAt(j);
            rev = letter + rev;
        }

        System.out.println(rev);

        for(int r = 0; r< sen.length(); r++){
            if(sen.charAt(r) == ' '){
                System.out.println(sen.substring(t,r));
                sen = sen.substring(r+1);
            }
        }
        System.out.println(sen);
    }
}
