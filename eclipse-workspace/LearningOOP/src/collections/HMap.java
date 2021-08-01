package collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class HMap {

	public static void main(String[] args) {
		LinkedHashMap<String, String> dictionary = new LinkedHashMap<String,String>();
		dictionary.put("Brave", "ready to endure danger or pain");
		dictionary.put("Brilliant", "ready to endure danger or pain");
		dictionary.put("Joy", "a feeling of great pleasure or happiness");
		dictionary.put("Confidence", "the state of feeling certain");
		
		for(String word: dictionary.keySet()) {
			//System.out.println(word);
			System.out.println(dictionary.get(word));
			
		}
		for(Map.Entry <String, String> entry: dictionary.entrySet()) {
			System.out.println(entry.getKey()+ " : " +entry.getValue());
			
		}
	}

}
