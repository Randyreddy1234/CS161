import java.util.*;
public class Capital {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        String sen = new String(sc.nextLine().toLowerCase());
        String newSen = new String("");
        int r = 0;

        for(int i = 1; i < sen.length(); i++){
            if(r == 0){
                newSen = sen.substring(r,i).toUpperCase();
            }
            else if(sen.substring(r,i).equals(" ")){
                newSen = newSen + " " + sen.substring(r+1,i+1).toUpperCase();
                r++;
                i++;
            }
            else{
                newSen = newSen + sen.substring(r,i);
            }
            r++;
        }

        newSen = newSen + sen.charAt(sen.length() - 1);
        System.out.println(newSen);
    }
}
