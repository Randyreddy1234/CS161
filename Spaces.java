public class Spaces {
    public static void main(String [] args){
        String addSpaces = new String("cup of tea");
        String newWord = new String("");

        for(int i = 0; i < addSpaces.length(); i++){
            if(addSpaces.charAt(i) != ' '){
                newWord = newWord + addSpaces.charAt(i) + " ";
            }
            else{
                newWord = newWord;
            }
        }

        System.out.println(newWord);
    }
}
