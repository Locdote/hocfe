package demo.collection;

import java.util.LinkedList;
import java.util.Queue;

public class DemoQueue {

	public static void main(String[] args) {
		Queue<String> danhSanhCho = new LinkedList<String>();
		
		danhSanhCho.add("Nguyen Van A");
		danhSanhCho.add("Nguyen Van B");
		danhSanhCho.add("Nguyen Van C");
		danhSanhCho.add("Nguyen Van D");
		
		String phanTuDau = danhSanhCho.peek();
		System.out.println(phanTuDau);
		
		phanTuDau = danhSanhCho.poll();
		System.out.println(phanTuDau);
		
		danhSanhCho.remove();

		System.out.println("=====================");
		danhSanhCho.forEach(s -> System.out.println(s));
		
		
		
	}

}
