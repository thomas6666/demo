package com.example.forygsoft;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapEntrySet {

	public static void main(String[] args) {
       Map<String,String> maps=new HashMap<>();
       maps.put("aa","12344");
       maps.put("bb", "122323");
       maps.put("cc", "32323");
       Iterator<Entry<String,String>> it=maps.entrySet().iterator();
       while (it.hasNext()) {
		Entry<String, String> e = (Entry<String, String>) it.next();
		System.out.println("键" + e.getKey() + "的值为:" + e.getValue());
	   }
	}

}
