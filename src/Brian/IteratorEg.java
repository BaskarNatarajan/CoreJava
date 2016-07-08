/**
 * 
 */
package Brian;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;;



/**
 * @author BASKAR
 *
 */
public class IteratorEg {
	
	public static void main(String[] arg){
		
		//Create List
		List<String> online =	new ArrayList<>();
		
		//adding the elements
		online.add("Target");
		online.add("Walgreen");
		online.add("Amex");
		online.add("CapitalOne");
		online.add("Citi");
		
		
		//itertrate via for loop
		
		for(int i=0;i<online.size();i++)
		{
			System.out.println(online.get(i));
		}
		
		//Enhanced Loop or Advance for loop
		
		for(String var: online)
		{
			System.out.println(var);
		}
		
		//Iterate via "Iteator loop"
		
		Iterator<String> acc = online.iterator();
		
		while(acc.hasNext()){
			System.out.println(acc.next());
		}
		
		
		
	}

}
