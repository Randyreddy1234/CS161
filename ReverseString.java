public class ReverseString {
    public static void main(String [] args){
        String rev = new String("programming");
        String finalString = "";
        char letter;

        for(int i = 0; i < rev.length(); i++){
            letter = rev.charAt(i);
            finalString = letter + finalString;
        }

        System.out.println(finalString);
    }
}
