package collections;

import java.util.Map;
import java.util.TreeMap;

public class TMap {

	public static void main(String[] args) {
		TreeMap<String, String> dictionary = new TreeMap<String,String> ();
		dictionary.put("Brave", "ready to endure danger or pain");
		dictionary.put("Brilliant", "ready to endure danger or pain");
		dictionary.put("Joy", "a feeling of great pleasure or happiness");
		dictionary.put("Confidence", "the state of feeling certain");
		
		for(String word: dictionary.keySet()) /*for(String word: dictionary.values())*/{
			//System.out.println(word);
			//System.out.println(dictionary.get(word));
			
		}
		for(Map.Entry <String, String> entry: dictionary.entrySet()) {
			System.out.println(entry.getKey()+ " : " +entry.getValue());
			
		}
	}

}
