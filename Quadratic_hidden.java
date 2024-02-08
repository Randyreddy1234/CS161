public class Quadratic_hidden {
    public static void main(String [] args){
        double coord1 = 1, coord2 = 0, coord3 = -1;

        if(((coord2 * coord3) - 4*coord1*coord3) < 0){
            System.out.println("No Solutions");
        }
        else{
            if(((-coord2 + Math.sqrt((coord2*coord2) - 4*coord1*coord3)) / (2*coord1)) == ((-coord2 - Math.sqrt((coord2*coord2) - 4*coord1*coord3)) / (2*coord1))){
                System.out.println("x = " + ((-coord2 + Math.sqrt((coord2*coord2) - 4*coord1*coord3)) / (2*coord1)));
            }
            else{
                System.out.println("x = " + ((-coord2 + Math.sqrt((coord2*coord2) - 4*coord1*coord3)) / (2*coord1)));
                System.out.println("x = " + ((-coord2 - Math.sqrt((coord2*coord2) - 4*coord1*coord3)) / (2*coord1)));
            }
        }
    }
}
