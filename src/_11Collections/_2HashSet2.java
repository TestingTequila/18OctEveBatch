package _11Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class _2HashSet2 {

	public static void main(String[] args) {

		Set<String> hs = new HashSet<>();
		hs.add("Java");
		hs.add("CSharp");
		hs.add("Python");
		hs.add("JavaScrip");
		hs.add("VB");
		hs.add("Java");
		
		// while loop => Cannot use
		// for loop => Cannot use
		
		System.out.println("===advanced loop===");
		for(String h : hs)
		{
			System.out.println(h);
		}
		
		System.out.println("===Iterator Loop===");
		Iterator<String > it =hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("===Lammbda With Stream===");
		hs.stream().forEach(h->System.out.println(h));

	}

}
