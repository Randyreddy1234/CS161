import java.util.*;
public class codes_hidden {
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    boolean stop = false;

    do {
        String code = new String(sc.nextLine());

        if (code.equalsIgnoreCase("STOP")) {
            stop = true;
        } else {
            String mod = new String(code.substring(0, 2));
            int year = Integer.parseInt(code.substring(2, 3));

            if (mod.equals("CS")) {
                System.out.println(code + " is a valid year " + year + " Computer Science module code");
            } else if (mod.equals("EE")) {
                System.out.println(code + " is a valid year " + year + " Electronic Engineering module code");
            } else if (mod.equals("BI")) {
                System.out.println(code + " is a valid year " + year + " Biology module code");
            } else if (mod.equals("MT")) {
                System.out.println(code + " is a valid year " + year + " Maths module code");
            } else if (mod.equals("CH")) {
                System.out.println(code + " is a valid year " + year + " Chemistry module code");
            } else if (mod.equals("CI")) {
                System.out.println(code + " is a valid year " + year + " Chinese module code");
            } else if (mod.equals("BS")) {
                System.out.println(code + " is a valid year " + year + " Business module code");
            } else {
                System.out.println("Invalid module code");
            }
        }
    } while(stop == false);
    }
}
