package _11Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class _3HashMap {

	public static void main(String[] args) {

         HashMap<String, String> hm = new HashMap<>();
         hm.put("jason.roger@gmail.com", "test@1234");
         hm.put("kerrie.wright@janbask.com", "test@4321");
         hm.put("ben.fletcher@gmail.com", "test@56756");
         hm.put("lee.pikhaver@janbask.com", "test@321");
         hm.put("denimo.ror@gmail.com", "test@14234");
         hm.put("denimo.ror@gmail.com", "test@14234");
         
         System.out.println("====Set====");
         Set<String> st= hm.keySet();
         st.stream().forEach(s->System.out.println(s));
         
         System.out.println("====Iterator====");
         Iterator<String> it =st.iterator();
         while(it.hasNext())
         {
        	 System.out.println(it.next());
         }
         
         System.out.println("====Set====");
         for(String s : st)
         {
        	 System.out.println(s);
         }
         System.out.println("COLLECTION RESULT");
         Collection<String> cl= hm.values();
         Iterator<String> itt =cl.iterator();
         while(itt.hasNext())
         {
        	 System.out.println(itt.next());
         }
         System.out.println("STREAM ");
         cl.stream().forEach(i->System.out.println(i));

	}

}
