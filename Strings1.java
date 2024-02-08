// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Strings1 {
    public static void main(String[] args) {
       String cs = "Computer Science";
       String ed = new String(" Education");
       String sci = cs.substring(9);
       String finalString = sci.concat(ed);

       System.out.println(finalString);
    }
}