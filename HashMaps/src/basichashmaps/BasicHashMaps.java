package basichashmaps;

import java.util.HashMap;

public class BasicHashMaps {
	static HashMap<String, Boolean> map = new HashMap<>();
	
	public static void main(String[] args) {
		map.put("Kedar", true);
		map.put("Radek", false);
		System.out.println(map.get("Kedar"));
		
		//if map.containsKey( )
	}
	
}
