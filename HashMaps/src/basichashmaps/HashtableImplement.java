package basichashmaps;

import java.util.HashMap;
import java.util.Hashtable;

public class HashtableImplement {
	
	String[] keys = new String[]{"Kedar", "Wonje", "Danny", "Justin", "Gio"};
	int [] values = new int[keys.length];
	
	Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();
	
	public void insertVal() {
		
		for(int i = 0; i < keys.length; i++) {
			hashtable.put(i+1, keys[i]);
		}
	}
	
	public String getVal(int key) {
		System.out.println(hashtable.get(key));
		return hashtable.get(key);
	}
	
	
	public static void main(String[] args) {
		HashtableImplement hmi = new HashtableImplement();
		hmi.insertVal();
		hmi.getVal(1);
		hmi.getVal(2);
	}
	
	
}
