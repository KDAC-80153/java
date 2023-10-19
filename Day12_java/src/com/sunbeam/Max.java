
package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Max {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class Length implements Comparator<String>{
			@Override
			public int compare(String s1, String s2) {
				int diff=s1.length()-s2.length();
				return diff;
			}
		}
		List<String> list=new ArrayList<String>();
		list.add("Asad");
		list.add("Stokes");
		list.add("Smith");
		list.add("Dhoni");
		list.add("Babar");
		list.add("Kane");
				String s=Collections.max(list, new Length());
		
		System.out.println(s);
		

	}

}
