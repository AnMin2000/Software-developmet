package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
 public HashMapExample() {
 }

 public static void main(String[] args) {
     Map<String, Integer> map = new HashMap();
     map.put("신용권", 85);
     map.put("홍길동", 90);
     map.put("동장군", 80);
     map.put("홍길동", 95);
     System.out.println("총 Entry 수: " + map.size());
     System.out.println();
     String key = "홍길동";
     int value = (Integer)map.get(key);
     System.out.println(key + ": " + map.get("홍길동"));
     System.out.println();
     Set<String> keySet = map.keySet();
     Iterator<String> keyIterator = keySet.iterator();

     while(keyIterator.hasNext()) {
         String k = (String)keyIterator.next();
         Integer v = (Integer)map.get(key);
         System.out.println(k + " : " + v);
     }

     System.out.println();
     Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
     Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

     while(entryIterator.hasNext()) {
         Map.Entry<String, Integer> entry = (Map.Entry)entryIterator.next();
         String k = (String)entry.getKey();
         Integer v = (Integer)entry.getValue();
         System.out.println(k + " : " + v);
     }

     System.out.println();
     map.remove("홍길동");
     System.out.println("총 Entry 수: " + map.size());
     System.out.println();
 }
}
