import java.util.*;
public class ReplaceA {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        String sen = new String(sc.nextLine());
        String newSen = new String("");
        int j = 0;

        for(int i = 0; i < sen.length() - 1; i++){
            if(sen.charAt(i) == 'a'){
                j++;
            }
        }

        if(j <= 3){
            newSen = sen.replace('a','#');
        }
        else{
            newSen = sen.replace('a','@');
        }

        System.out.println(newSen);
    }
}
