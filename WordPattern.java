import java.util.*;
public class WordPattern {
    public boolean wordPattern(String pattern, String str) {

        String[] words = str.split(" ");

        if(pattern.length() != words.length) return false;

        HashMap<Character, String> map = new HashMap<>();

        for(int i=0; i<pattern.length(); i++) {
            char ch = pattern.charAt(i);

            if(!map.containsKey(ch)) {

                if(map.containsValue(words[i])) {
                    return false;
                }

                map.put(ch, words[i]);
            }
            else if(words[i].equals(map.get(ch)) == false){
                return false;
            }
            else {

            }
        }
        return true;
    }
}
