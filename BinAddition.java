import java.util.*;
public class BinAddition {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String num1 = new String(sc.nextLine()), num2 = new String(sc.nextLine()), result = new String("");
        boolean carry = false;

        //padding step
        if(num1.length() > num2.length()){
            int pad = num1.length() - num2.length();

            for(int i = 0; i < pad; i++){
                num2 = "0" + num2;
            }
        }
        else if(num1.length() < num2.length()){
            int pad = num2.length() - num1.length();

            for(int i = 0; i < pad; i++){
                num1 = "0" + num1;
            }
        }

        //addition step
        if(num1.length() == num2.length()){
            for(int i = num1.length() - 1; i >= 0; i--){
                if(num1.charAt(i) == '0' && num2.charAt(i) == '0' && !carry){
                    result = "0" + result;
                }
                else if(num1.charAt(i) == '0' && num2.charAt(i) == '1' && !carry || num1.charAt(i) == '1' && num2.charAt(i) == '0' && !carry){
                    result = "1" + result;
                }
                else if(num1.charAt(i) == '1' && num2.charAt(i) == '1' && !carry){
                    result = "0" + result;
                    carry = true;
                }
                else if(num1.charAt(i) == '0' && num2.charAt(i) == '0' && carry == true){
                    result = "0" + result;
                    carry = false;
                }
                else if(num1.charAt(i) == '0' && num2.charAt(i) == '1' && carry || num1.charAt(i) == '1' && num2.charAt(i) == '0' && carry) {
                    result = "1" + result;
                    carry = true;
                }
                else if(num1.charAt(i) == '1' && num2.charAt(i) == '1' && carry == true){
                    result = "1" + result;
                    carry = true;
                }
            }
            if(carry == true){
                result = "1" + result;
            }
        }
        System.out.println(result);
    }
}
