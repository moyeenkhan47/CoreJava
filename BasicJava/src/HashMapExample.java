
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	 public static void main(String[] args) {
	        HashMap<Integer,String> hm = new HashMap<>();
	            hm.put(101,"deepak");
	            hm.put(102,"amit");
	            hm.put(105,"ravi");
	            hm.put(103,"kamal");
	            hm.put(104,"deepak");
	            //hm.remove(103);
	        System.out.println(hm.containsKey(105));
	        System.out.println(hm.containsValue("ravi"));
	        System.out.println(hm.get(102));
	        System.out.println(hm.isEmpty());
	        System.out.println(hm.size());
	                    for(Map.Entry m:hm.entrySet()){
	                        System.out.println(m.getKey() + " " + m.getValue());

	            }
	 }
}
