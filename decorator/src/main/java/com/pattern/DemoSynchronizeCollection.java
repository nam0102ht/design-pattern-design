package com.pattern;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DemoSynchronizeCollection {
	//ứng dụng của decorator trong java.
	/*synchronizedCollection dùng cho phân luồng Collection, trả về chuỗi đồng bộ
	 *unmodifiableSet trả về một khung nhìn sau đó không thể thay đổi giá trị của tập collection đó
	 *checkedXXX được dùng trả về một giá trị chỉ định an toàn của một collection
	 */
	public static void main(String[] args) {
		try {
			List<String> lst = new ArrayList<String>();
			lst.add("Bánh căn");
			lst.add("Bánh bò");
			lst.add("Bánh xèo");
			lst.add("Bánh tét");
	
			Collection<String> c = Collections.synchronizedCollection(lst);
			System.out.println(c);
		}catch(IndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage());
		}
		try {
			Set<String> lst2 = new HashSet();
			lst2.add("Bánh căn");
			lst2.add("Bánh bò");
			lst2.add("Bánh xèo");
			lst2.add("Bánh tét");
			Collection<String> c =  Collections.unmodifiableSet(lst2);
			System.out.println(c);
		}catch(UnsupportedOperationException ex) {
			System.out.println(ex.getMessage());
		}
		List<String> lst3 = new ArrayList<>();
		lst3.add("TP");
		lst3.add("PROVIDES");
		lst3.add("QUALITY");
		lst3.add("TUTORIALS");
		Collection<String> c3 = Collections.checkedList(lst3, String.class);
		System.out.println(c3);
	}
}
