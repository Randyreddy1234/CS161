import java.util.*;
public class Triangles_hidden {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        double sideA = sc.nextDouble(), sideB = sc.nextDouble(), sideC = sc.nextDouble();

        if((sideA + sideB) > sideC && (sideB + sideC) > sideA && (sideA + sideC) > sideB){
            if(sideA == sideB && sideA == sideC){
                System.out.println("This is a equilateral triangle");
            }
            else if(sideA == sideB || sideA == sideC || sideB == sideC){
                System.out.println("This is a isosceles triangle");
            }
            else{
                System.out.println("This is a scalene triangle");
            }
        }
        else{
            System.out.println("This is not a triangle");
        }
    }
}
