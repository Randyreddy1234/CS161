public class WhileLoopSong_hidden {
    public static void main(String [] args){
        int i = 10;
        while(i > 1){
            System.out.println(i + " in a bed and the little one said,");
            System.out.println(i + "'Roll over, roll over'");
            System.out.println(i + "They all rolled over and one fell out\n");
            i--;
        }
        if(i == 1){
            System.out.println(i + " in a bed and the little one said,");
            System.out.println(i + "'Alone at last'");
        }
    }
}
