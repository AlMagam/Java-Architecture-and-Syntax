package lab;

public class level_off {

    public static String make(String str, int newLength){
        StringBuilder liner = new StringBuilder(str.trim());//remove spaces at the beginning and end of a string
        int temp = 0;
        while(liner.length() != newLength){
            temp = liner.indexOf(" ", temp);
            if(temp == -1)
                temp = liner.indexOf(" ");
            while(liner.charAt(temp) == ' ' && liner.length() != newLength) {
                temp++;
                liner.insert(temp, " ");
                temp++;
            }
        }
        return liner.toString();
    }
}
