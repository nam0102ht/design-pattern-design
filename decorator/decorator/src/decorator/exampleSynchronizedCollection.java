package decorator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class exampleSynchronizedCollection {
	//syntax static <T> Collection<T> synchronizedCollection(Collection<T> c){}
	/*để sử dụng đồng bộ trong Collections thì ta sẽ dùng synchronizedCollection
	*để sử dụng đúng thì ta sẽ dùng đúng cấu trúc trên
	*/
	public static void main(String[] args) {
		try {
			List<String> lst = new ArrayList<>();
			
			lst.add("Cherry");
			lst.add("Apple");
			lst.add("Coconut");
			lst.add("Pinaple");
			lst.add("Banana");
			
			Collection<String> c = Collections.synchronizedCollection(lst);
			System.out.println(c);
		}catch(IndexOutOfBoundsException ex) {
			System.out.println("Exception: "+ex.getMessage());
		}
	}
}
