public class Palindromes {
    public static void main(String [] args){
        String text = new String("NAVAN");
        String reverse = "";
        char letter;

        for(int i = 0; i < text.length();i++){
            letter = text.charAt(i);
            reverse = letter + reverse;
        }

        if(text.equalsIgnoreCase(reverse)){
            System.out.println(text.toUpperCase() + " is a palindrome");
        }
        else{
            System.out.println(text.toUpperCase() + " is NOT a palindrome");
        }
    }
}
