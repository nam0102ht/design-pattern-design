package decorator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class DemoJDK8Adapter {
	/*
	 * asList<> trả một mảng về dạng danh sách
	 * Enumeration là một interface giúp xác định các phần tử
	 * Collections.list() trả một mang vector bất kì về list với Enumeration là một adapter
	 * Collections.enumeration(<T> i) trả về một danh sách các phần tử chỉ định và cung cấp các khả năng thích ứng cao giữa các API  
	 */
	public static void main(String[] aƯrgs) {
		try {
			String[] lst = new String[] {"A", "B", "C", "D"};
			
			List<String> lst2 = Arrays.asList(lst);
			System.out.println(Collections.checkedList(lst2, String.class));
		}catch(NullPointerException ex) {
			System.out.println(ex.getMessage());
		}
		try {
			Vector<String> v = new Vector<String>();
			v.add("A");
			v.add("B");
			v.add("C");
			
			Enumeration<String> e = v.elements();
			
			List<String> lst2 = Collections.list(e);
			System.out.println(Collections.checkedList(lst2, String.class));
		}catch(NullPointerException ex) {
			System.out.println(ex.getMessage());
		}
		try { 
			  
            // creating object of List<String> 
            List<String> arrlist = new ArrayList<String>(); 
  
            // Adding elemnet to srclst 
            arrlist.add("Ram"); 
            arrlist.add("Gopal"); 
            arrlist.add("Verma"); 
  
            // Print the list 
            System.out.println("List: " + arrlist); 
  
            // creating object of type Enumeration<String> 
            Enumeration<String> e = Collections.enumeration(arrlist); 
  
            // Print the Enumeration 
            System.out.println("\nEnumeration over list: "); 
  
            // print the enumeration 
            while (e.hasMoreElements()) 
                System.out.println("Value is: " + e.nextElement()); 
        } 
  
        catch (IllegalArgumentException e) { 
            System.out.println("Exception thrown : " + e); 
        } 
	}
}
