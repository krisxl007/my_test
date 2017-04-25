import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Test {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "1");

        for(Map.Entry entry : map.entrySet()) {
            String key = (String) entry.getKey();
            key = "2";
            System.out.println(key);
        }

        System.out.println("Main: " + map.get("1"));
    }
}