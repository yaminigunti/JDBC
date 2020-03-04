package com.cts.CD.ui;
	import java.util.Map;
	import java.util.HashMap;
import java.util.LinkedHashMap;

	public class MapDemo {
		public static void main(String[]args) {
			Map<String,String>hm=new HashMap<>();
		hm.put("java","Language");
		hm.put("dotnet","Framework");
		hm.put("c#","Language");
		for(String Key:hm.keySet())
			System.out.printf("%s : %s\n",Key,hm.get(Key));
		System.out.println("-----------");
		
		Map<String,String>lhm=new LinkedHashMap<>();
		lhm.put("java","Language");
		lhm.put("dotnet","Framework");
		lhm.put("c#","Language");
		for(String Key:lhm.keySet())
			System.out.printf("%s : %s\n",Key,lhm.get(Key));
		System.out.println("-----------");
					
					
		}

}
