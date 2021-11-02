package com.assignment;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Assignmnet2 {
	public static void main(String[] args) {
		try {
			Files.lines(Paths.get("emailIds.txt")).forEach(System.out::println);
			String [] s = {"abc@gmail.com", "abc@hotmail.com",
					"abc@yahoo.com", "123@yahoo.com",
					"123@gmail.com", "345@yahoo.com", };
			Map<String,ArrayList<String>> dom = new HashMap<>();
			for(String str:s) {
					String domain = str.substring(str.lastIndexOf("@)")+1,str.lastIndexOf("."));
					if(!dom.containsKey(domain)) {
							ArrayList<String> s1= new ArrayList<String>();
							s1.add(str);
							dom.put(domain, s1);
					}
					else if (dom.containsKey(domain)) {
						dom.get(domain).add(str);
					}
					
			}
			System.out.println(dom);
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
