public class Calculator {
    public static void main(String [] args){
        int num1 = 20;
        int num2 = 2;
        char math = '+';

        if(math == '+'){
            System.out.println(num1 + num2);
        }
        else if(math == '-'){
            System.out.println(num1 - num2);
        }
        else if(math == '/'){
            System.out.println(num1 / num2);
        }
        else if(math == '*'){
            System.out.println(num1 * num2);
        }
    }
}
