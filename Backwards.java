public class Backwards {
    public static void main(String [] args){
        String sentence = new String("pay no attention to that man behind the curtain");

        for(int i = sentence.length() - 1; i >= 0; i--){
            if(sentence.charAt(i) == ' '){
                System.out.println(sentence.substring(i+1));
                sentence = sentence.substring(0,i);
            }
        }
        System.out.println(sentence);
    }
}
