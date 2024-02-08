import java.util.*;
public class HexToDec {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String hex = new String(sc.nextLine());
        int dec = 0, base = 1;

        for(int i = hex.length() - 1; i >= 0; i--){
            switch(hex.charAt(i)){
                case '0':
                    dec += 0 * base;
                    base = base * 16;
                    break;
                case '1':
                    dec += 1 * base;
                    base = base * 16;
                    break;
                case '2':
                    dec += 2 * base;
                    base = base * 16;
                    break;
                case '3':
                    dec += 3 * base;
                    base = base * 16;
                    break;
                case '4':
                    dec += 4 * base;
                    base = base * 16;
                    break;
                case '5':
                    dec += 5 * base;
                    base = base * 16;
                    break;
                case '6':
                    dec += 6 * base;
                    base = base * 16;
                    break;
                case '7':
                    dec += 7 * base;
                    base = base * 16;
                    break;
                case '8':
                    dec += 8 * base;
                    base = base * 16;
                    break;
                case '9':
                    dec += 9 * base;
                    base = base * 16;
                    break;
                case 'A':
                    dec += 10 * base;
                    base = base * 16;
                    break;
                case 'B':
                    dec += 11 * base;
                    base = base * 16;
                    break;
                case 'C':
                    dec += 12 * base;
                    base = base * 16;
                    break;
                case 'D':
                    dec += 13 * base;
                    base = base * 16;
                    break;
                case 'E':
                    dec += 14 * base;
                    base = base * 16;
                    break;
                case 'F':
                    dec += 15 * base;
                    base = base * 16;
                    break;
            }
        }
        System.out.println(dec);
    }
}
