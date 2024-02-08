public class Strings2 {
    public static void main(String [] args){
        String sen = new String("Most guitars have six strings.");
        int length = sen.length();
        int h = sen.indexOf('h');
        String lower = sen.toLowerCase();
        String upper = sen.toUpperCase();

        System.out.println("String Length: " + length);
        System.out.println("Position of the first 'h' : " + h);
        System.out.println(lower);
        System.out.println(upper);
    }
}
