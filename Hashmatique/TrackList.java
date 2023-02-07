import java.util.HashMap;
import java.util.Set;

public class TrackList {
    public static void main(String[] args) {
        
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("In the End", "One thing, I don't know why...");
        map.put("Full moon", "The moon is full...");
        map.put("Greeter", "Hellow how are you..");
        map.put("Delicious", "This food is delicious..."); 
    
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(String.format("Track: %s - Lyrics: %s", key, map.get(key)));
        }
    }
}
