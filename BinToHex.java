import java.util.*;
public class BinToHex {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        long bi = sc.nextLong();
        int dec = 0, exp = 1,hexD = 0;
        String hex = new String("");

        while(bi != 0){
            dec += exp * (bi % 10);
            exp *= 2;
            bi /= 10;
        }

        while(dec != 0){
            hexD = dec % 16;

            if(hexD == 10){
                hex = "A" + hex;
            }
            else if(hexD == 11){
                hex = "B" + hex;
            }
            else if(hexD == 12){
                hex = "C" + hex;
            }
            else if (hexD == 13) {
                hex = "D" + hex;
            }
            else if(hexD == 14){
                hex = "E" + hex;
            }
            else if(hexD == 15){
                hex = "F" + hex;
            }
            else{
                hex = hexD + hex;
            }
            dec /= 16;
        }
        System.out.println(hex);
    }
}
