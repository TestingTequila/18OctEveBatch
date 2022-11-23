package _11Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class _1ArrayList {

	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<>();
		list.add("Java");
		list.add("CSharp");
		list.add("Python");
		list.add("JavaScrip");
		list.add("VB");
		
	    System.out.println("===Loop using while loop===");
		int x=0;
		while(x<list.size())
		{
			System.out.println(list.get(x));
			x++;
		}
		
		System.out.println("===Loop using For loop===");
		for(int y=0; y<list.size(); y++)
		{
			System.out.println(list.get(y));
		}
		
		System.out.println("===Loop using Advanced For loop===");
		for(String l: list)
		{
			System.out.println(l);
		}
		
		System.out.println("===Loop using Iterator===");
		Iterator<String> it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("===Loop using lambda===");
		list.stream().forEach(lst->System.out.println(lst));
	}

}
