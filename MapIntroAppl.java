import java.util.Collection;
// import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapIntroAppl {

	public static void main(String[] args) {
		Map<String, Integer> usa = new TreeMap<>();
		usa.put("Denver", 600_000);
		usa.put("Boston", 670_000);
		usa.put("Chicago", 2_700_000);
		usa.put("Atlanta", 470_000);
		usa.put("New York", 8_500_000);
		usa.put("Dallas", 1_300_000);
		Integer num = usa.get("Chicago");
		System.out.println(num);
		num = usa.get("Detroit");
		System.out.println(num);
		System.out.println(usa.size());
		System.out.println(usa.isEmpty());
		System.out.println(usa.containsKey("Boston"));
		System.out.println(usa.containsKey("Detroit"));
		System.out.println(usa.containsValue(600_000));
		System.out.println(usa.containsValue(700_000));
		num = usa.put("Chicago", 2_700_001);
		System.out.println(num);
		num = usa.get("Chicago");
		System.out.println(num);
		Collection<Integer> values = usa.values();
		int total = 0;
		for (Integer integer : values) {
			total += integer;
		}
		System.out.println("Total = " + total);
		System.out.println("===== Method 1 =====");
		Set<String> keys = usa.keySet();
//		for (String key : keys) {
//			System.out.println(key + " -> " + usa.get(key));
//		}
		keys.forEach(k -> System.out.println(k + " -> " + usa.get(k)));
		System.out.println("===== Method 2 =====");
		Set<Map.Entry<String, Integer>> entries = usa.entrySet();
		for (Map.Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + " => " + entry.getValue());
		}
	}

}
