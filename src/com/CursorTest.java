package com;

import java.util.Enumeration;
import java.util.Vector;

public class CursorTest {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		for(int i=1; i<=10; i++)
		{
			v.addElement(i);
		}
		
		Enumeration e = v.elements();
		
		while(e.hasMoreElements())
		{
			Integer value = (Integer) e.nextElement();
			if(value%2==0)
			{
				System.out.println(value);
			}else
			{
				System.out.println("Removed Value : "+value);
				v.remove(value);
			}
		}
		System.out.println(v);
		
	}

}
