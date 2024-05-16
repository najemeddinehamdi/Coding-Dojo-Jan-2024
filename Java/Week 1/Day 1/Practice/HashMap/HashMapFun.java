import java.util.HashMap;
import java.util.Set;


public class HashMapFun {
    public static void main(String[] args){
        HashMap<String,String> songMap= new HashMap<String,String>();
        songMap.put("Kendrick Lamar", "Not like us");
        songMap.put("Drake", "Family Matters");
        songMap.put("aa", "euphoria");
        songMap.put("Ken", "meet the grahams");
        String artist= songMap.get("Drake");
        
        System.out.println(artist);

        Set<String> keys = songMap.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(songMap.get(key));    
        }
    }

    
}