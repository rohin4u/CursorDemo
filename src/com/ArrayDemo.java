package com;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayDemo {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add("delhi");
		list.add("mumbai");
		list.add("kerela");
		list.add("manali");
		list.add("pune");
		list.add("bihar");
		
		System.out.println(list);
		Iterator iterator = list.iterator();
		
		while(iterator.hasNext())
		{
			String next = (String) iterator.next();
			
			if(next.equals("pune"))
			{
				iterator.remove();
			}
			else if(next.equals("bihar"))
			{
				iterator.remove();
			}
		}
		System.out.println(list);

	}

}
