public class Eircode {
    public static void main(String [] args){
        String eircode = "W23V6V8";
        String key = eircode.substring(0,3);
        String id = eircode.substring(3);

        if(key.equals("A86")){
            System.out.println("Key:" + key + "-Identifier:" + id + "-Area:Dunboyne.");
        }
        else if(key.equals("X35")){
            System.out.println("Key:" + key + "-Identifier:" + id + "-Area:Dungarvan.");
        }
        else if(key.equals("R45")){
            System.out.println("Key:" + key + "-Identifier:" + id + "-Area:Edenderry.");
        }
        else if(key.equals("W23")){
            System.out.println("Key:" + key + "-Identifier:" + id + "-Area:Maynooth");
        }
        else if(key.equals("V14")){
            System.out.println("Key:" + key + "-Identifier:" + id + "-Area:Shannon.");
        }
        else {
            System.out.println("Key:" + key + "-Identifier:" + id + "-Area:Other.");
        }
    }
}
