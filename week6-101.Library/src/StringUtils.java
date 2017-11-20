public class StringUtils {
    public static boolean included(String word, String searched){
        if (word.toLowerCase().contains(searched.trim().toLowerCase())) return true;
        else return false;
    }
}
